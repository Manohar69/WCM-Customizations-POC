package com.sivavaka.test.spring.scheduler;

import javax.naming.NamingException;

import org.apache.log4j.Logger;

public class TestTask implements Runnable {
	private static final Logger logger = Logger.getLogger(TestTask.class);

	@Override
	public void run() {
		logger.info("Schduler has started executing the task");
		
		try {
			//Accessing the URL resource that is configured in WAS console using the initial context
			javax.naming.InitialContext ctx = new javax.naming.InitialContext();
			java.net.URL blogUrl = (java.net.URL)ctx.lookup("url/blogurl");
		}catch(NamingException e){
			logger.error("Error while accessing the URL resource");
		}
		
		logger.info("Scheduler has finished the task");

	}

}
