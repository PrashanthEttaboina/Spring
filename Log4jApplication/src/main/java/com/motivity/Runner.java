package com.motivity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Runner {

	private static final Logger logger = LogManager.getLogger(Runner.class);

	public void run() {

		logger.info("Information message");
		logger.warn("Warning message");
		logger.error("This is a normal error");
		logger.fatal("this is a fatal error");
	}

}