package com.vico.clever.cdr.test;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.core.Application;

import org.apache.log4j.Logger;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.junit.Test;

import com.vico.clever.cdr.CleverRestApplication;

public class MyResourceTest extends JerseyTest {
	
	protected final Logger logger = Logger.getLogger(this.getClass());
	
	protected Application configure(){
		enable(TestProperties.LOG_TRAFFIC);
		enable(TestProperties.DUMP_ENTITY);
		return new CleverRestApplication();
	}
	@Test
	public void testMyResource(){
		final String myresource=target("myresource").request().get(String.class);
		logger.debug(myresource);
		assertEquals("Got it!", myresource);
	}
}
