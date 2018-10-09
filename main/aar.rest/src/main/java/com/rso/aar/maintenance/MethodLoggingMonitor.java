package com.rso.aar.maintenance;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class MethodLoggingMonitor {

	private static final Logger LOGGER = LoggerFactory.getLogger(MethodLoggingMonitor.class);

	public MethodLoggingMonitor() {
		LOGGER.info("Registered");
	}

	@Around("execution(* com.rso.aar.rest..*Service.*(..))")
	public Object log(ProceedingJoinPoint serviceMethod) throws Throwable {
		Logger log = LoggerFactory.getLogger(serviceMethod.getTarget().getClass());
		String prettyPrintedServiceMethod = prettyPrint(serviceMethod);
		Object[] methodParameters = serviceMethod.getArgs();
		if (log.isDebugEnabled() && methodParameters != null) {
			StringBuilder builder = new StringBuilder();
			builder.append("Begin " + prettyPrintedServiceMethod);
			builder.append("\n");
			for (int i = 0; i < methodParameters.length; i++) {
				Object parameter = methodParameters[i];
				builder.append("Parameter: ");
				builder.append(parameter != null ? parameter.getClass() + "=" + parameter : "null");
				if (i < methodParameters.length - 1) {
					builder.append("\n");
				}
			}
			log.debug(builder.toString());
		}

		try {
			return serviceMethod.proceed();
		} finally {
			if (log.isDebugEnabled()) {
				log.debug("End " + prettyPrintedServiceMethod);
			}
		}
	}

	private String prettyPrint(ProceedingJoinPoint proceedingJoinPoint) {
		return proceedingJoinPoint.getKind() + " [" + proceedingJoinPoint.getSignature() + "]";
	}
}