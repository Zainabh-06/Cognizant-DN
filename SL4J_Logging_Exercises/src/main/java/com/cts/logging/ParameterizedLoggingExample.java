package com.cts.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {

        String studentName = "Rahul";
        int marks = 85;

        System.out.println("Displaying Student Details");

        logger.info("Student Name: {}", studentName);
        logger.info("Student Marks: {}", marks);

        System.out.println("Program execution completed.");
    }
}