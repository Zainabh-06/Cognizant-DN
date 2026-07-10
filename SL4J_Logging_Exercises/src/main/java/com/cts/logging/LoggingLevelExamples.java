package com.cts.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingLevelExamples {

    private static final Logger logger = LoggerFactory.getLogger(LoggingLevelExamples.class);

    public static void main(String[] args) {

        int marks = 28;
        if (marks < 0 || marks > 100) {
            logger.error("Invalid marks entered.");
        }

        else if (marks < 35) {
            logger.warn("Student has scored below the passing marks.");
        }
        else {
            System.out.println("Student has passed the examination.");
        }

       
    }
}