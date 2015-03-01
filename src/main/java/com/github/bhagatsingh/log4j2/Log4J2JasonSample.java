package com.github.bhagatsingh.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Log4J2JasonSample
 *
 */
public class Log4J2JasonSample {
	static final Logger logger = LogManager.getLogger(Log4J2JasonSample.class
			.getName());

	public void writeToLog(String msg) {
		logger.debug("Entering writeToLog()");
		logger.info("Hello Log4J 2.2 World!!!" + msg);
		logger.debug("Exiting writeToLog()");
	}
}
