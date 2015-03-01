package com.github.bhagatsingh.log4j2;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class Log4J2JasonSampleTest extends TestCase {

	@Test
	public void testApp() {
		Log4J2JasonSample log = new Log4J2JasonSample();
		log.writeToLog(" You rock.");
		assertTrue(true);
	}
}
