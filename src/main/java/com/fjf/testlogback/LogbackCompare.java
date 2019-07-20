package com.fjf.testlogback;

import org.slf4j.LoggerFactory;

public class LogbackCompare {
	private static final  org.slf4j.Logger loggerAsync = LoggerFactory.getLogger(LogbackAsync.class) ;
	private static final  org.slf4j.Logger logger = LoggerFactory.getLogger(LogbackCompare.class) ;
	private static final  org.apache.log4j.Logger logger4j =org.apache.log4j.Logger.getLogger(LogbackCompare.class) ;

	public static void main(String[] args) throws InterruptedException {
		long cost;

		//logback
		long start=System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			logger.debug("ABCDEFG{}",i);
			logger.error("ABCDEFG{}",i);			
		}
		cost=System.currentTimeMillis()-start;
		
		System.out.println("logback:"+cost);


        //logback 异步
	    start=System.currentTimeMillis();		
		
		for (int i = 0; i < 1000; i++) {
			
			loggerAsync.debug("ABCDEFG:{}",i);
			loggerAsync.error("ABCDEFG:{}",i);		
			
		}
		cost=System.currentTimeMillis()-start;
		
		System.out.println("logback异步:"+cost);
		



		//lof4j
	    start=System.currentTimeMillis();		
		
		
		for (int i = 0; i < 1000; i++) {
			
			logger4j.debug("ABCDEFG:{}"+i);
			logger4j.error("ABCDEFG:"+i);		
			
		}
		cost=System.currentTimeMillis()-start;
		
		System.out.println("log4j:"+cost);

		Thread.sleep(3000);
	}

}
