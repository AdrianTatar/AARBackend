package com.rso.aar.persistence;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseTablenamePrefix {

	@Value("${hibernate.default_schema}")
	private String defaultSchema;

	private static final String PREFIX_SEPARATOR = ".";

	public String getValue() {
		return defaultSchema + PREFIX_SEPARATOR;
	}

}
