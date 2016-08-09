package com.wande.log;

import org.apache.log4j.Logger;

public class TestLog4j {
	private final static Logger logger = Logger.getLogger(TestLog4j.class);

	public static void main(String[] args) {
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
	}

}
