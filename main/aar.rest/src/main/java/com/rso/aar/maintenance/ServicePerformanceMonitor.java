package com.rso.aar.maintenance;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jamonapi.Monitor;
import com.jamonapi.MonitorFactory;

@Aspect
public class ServicePerformanceMonitor {

	private static final Logger LOGGER = LoggerFactory.getLogger(ServicePerformanceMonitor.class);

	public ServicePerformanceMonitor() {
		LOGGER.info("Registered!");
	}

	@Around("execution(* com.rso.aar.rest..*Service.*(..))")
	public Object monitor(ProceedingJoinPoint serviceMethod) throws Throwable {
		String name = createJoinPointTraceName(serviceMethod);
		Monitor monitor = MonitorFactory.start(name);
		try {
			return serviceMethod.proceed();
		} finally {
			monitor.stop();
			LOGGER.debug(monitor.toString());
		}
	}

	private String createJoinPointTraceName(JoinPoint joinPoint) {
		Signature signature = joinPoint.getSignature();
		StringBuilder sb = new StringBuilder();
		sb.append(signature.getDeclaringType().getSimpleName());
		sb.append('.').append(signature.getName());
		return sb.toString();
	}
}