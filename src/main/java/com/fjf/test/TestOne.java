package com.fjf.test;


import org.apache.log4j.Logger;

/**
 * @author fujianfeng
 * @date 2019年07月07日23:15:13
 * 练习log日志
 */
public class TestOne {

    private static final Logger LOGGER = Logger.getLogger(TestOne.class);


    public static void main(String[] args) {
        LOGGER.debug("******debug");
        LOGGER.info("******info");
        LOGGER.warn("******warn");
        LOGGER.error("******error");
    }

}
