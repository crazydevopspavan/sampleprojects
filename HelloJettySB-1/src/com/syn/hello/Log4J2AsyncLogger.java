package com.syn.hello;

import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;

public class Log4J2AsyncLogger {
    private static Logger logger = LogManager.getLogger(Log4J2AsyncLogger.class);
    public void performSomeTask(){
               logger.debug("This is a debug message.");
               logger.info("This is an info message.");
               logger.warn("This is a warn message.");
               logger.error("This is an error message.");
               logger.fatal("This is a fatal message.");
     }

}
