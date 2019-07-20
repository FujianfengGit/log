package com.fjf.testlogback;

import org.slf4j.LoggerFactory;

public class LogbackAsync {
	
	private static final  org.slf4j.Logger logger = LoggerFactory.getLogger(LogbackAsync.class) ;
	
	public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <  1000; i++) {
			logger.info("AAAAAAAAAAA");
		}
        Thread.sleep(1000);
	}
}
