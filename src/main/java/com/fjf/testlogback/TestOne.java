package com.fjf.testlogback;

import org.slf4j.LoggerFactory;

/**
 * @date 2019年07月11日14:12:06
 * @author fujianfeng4
 * logback的需要学习
 *
 */
public class TestOne {


    private static final  org.slf4j.Logger LOGGER = LoggerFactory.getLogger(TestOne.class) ;

    public static void main(String[] args) throws InterruptedException {




       /* LOGGER.debug("**debug");
        LOGGER.info("**info");
        LOGGER.warn("**warn");
        LOGGER.error("**error");*/


       //sl4j
        String a = "fujf";
        LOGGER.info("**my name is "+a);
        LOGGER.info("my name22 is {}  {}",a,a);



       //实时加载配置
       /* for (int i = 0; i < 1000 ;i++) {
            LOGGER.debug("**debug****");
            LOGGER.info("**info****");
            LOGGER.warn("**warn***");
            LOGGER.error("**error****");
            LOGGER.warn("**fujianfeng sql error***");

            Thread.sleep(1000);

        }*/



    }
}
