package com.fjf.testlogback;

import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class LogbackTest {
	
	private static final  org.slf4j.Logger logger = LoggerFactory.getLogger(LogbackTest.class) ;

	public static void main(String[] args) {
 
		logger.error("0000000000" );


		MDC.put("userId", "zhang3");
		logger.error("1111111111" );
		logger.error("2222222222"   );


		MDC.put("userId", "li4");
		logger.error("3333333333");
		
	}

}
