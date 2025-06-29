package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample2 {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample2.class);

    public static void main(String[] args) {
        String user = "Divyanshu";
        int loginAttempts = 3;
        String location = "Bhopal";

        logger.info("User {} has logged in from {}", user, location);
        logger.warn("User {} has {} unsuccessful login attempts", user, loginAttempts);
        logger.error("Login process failed for user: {}", user);
    }
}