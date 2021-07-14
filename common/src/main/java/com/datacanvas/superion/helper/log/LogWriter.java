package com.datacanvas.superion.helper.log;

import com.datacanvas.superion.util.DateTimeUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.PrintWriter;
import java.io.StringWriter;

public class LogWriter {

    private static String LOG_TIME;
    private static String LOG_LEVEL;

    public static void debug(Class<?> clazz, String message) {
        Logger logger = LoggerFactory.getLogger(clazz.getName());
        logger.debug(message);
        LOG_TIME = DateTimeUtil.getYearMonthDayHourMinuteSecondMillisecond();
        LOG_LEVEL = "DEBUG";
        String logPrefix = String.format("%s  %-5s : ", LOG_TIME, LOG_LEVEL);
        message = logPrefix + message;

        // Record step log
        if (StringUtils.isEmpty(StepLogger.getLog())) {
            StepLogger.setLog(StepLogger.getLog().append(message).append(System.getProperty("line.separator")));
        } else {
            StepLogger.setLog(StepLogger.getLog().append(System.getProperty("line.separator")).append(message).append(System.getProperty("line.separator")));
        }
    }

    public static void info(Class<?> clazz, String message) {
        Logger logger = LoggerFactory.getLogger(clazz.getName());
        logger.info(message);
        LOG_TIME = DateTimeUtil.getYearMonthDayHourMinuteSecondMillisecond();
        LOG_LEVEL = "INFO";
        String logPrefix = String.format("%s  %-5s : ", LOG_TIME, LOG_LEVEL);
        message = logPrefix + message;

        // Record step log
        if (StringUtils.isEmpty(StepLogger.getLog())) {
            StepLogger.setLog(StepLogger.getLog().append(message).append(System.getProperty("line.separator")));
        } else {
            StepLogger.setLog(StepLogger.getLog().append(System.getProperty("line.separator")).append(message).append(System.getProperty("line.separator")));
        }
    }

    public static void error(Class<?> clazz, String message) {
        Logger logger = LoggerFactory.getLogger(clazz.getName());
        logger.error(message);
        LOG_TIME = DateTimeUtil.getYearMonthDayHourMinuteSecondMillisecond();
        LOG_LEVEL = "ERROR";
        String logPrefix = String.format("%s  %-5s : ", LOG_TIME, LOG_LEVEL);
        message = logPrefix + message;

        // Record step log
        if (StringUtils.isEmpty(StepLogger.getLog())) {
            StepLogger.setLog(StepLogger.getLog().append(message).append(System.getProperty("line.separator")));
        } else {
            StepLogger.setLog(StepLogger.getLog().append(System.getProperty("line.separator")).append(message).append(System.getProperty("line.separator")));
        }
    }

    public static void error(Class<?> clazz, String message, Throwable throwable) {
        Logger logger = LoggerFactory.getLogger(clazz.getName());
        logger.error(message, throwable);
        LOG_TIME = DateTimeUtil.getYearMonthDayHourMinuteSecondMillisecond();
        LOG_LEVEL = "ERROR";
        String logPrefix = String.format("%s  %-5s : ", LOG_TIME, LOG_LEVEL);
        message = logPrefix + message;

        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        throwable.printStackTrace(printWriter);
        String error = stringWriter.toString();

        // Record step log
        if (StringUtils.isEmpty(StepLogger.getLog())) {
            StepLogger.setLog(StepLogger.getLog().append(message).append(System.getProperty("line.separator")).append(error));
        } else {
            StepLogger.setLog(StepLogger.getLog().append(System.getProperty("line.separator")).append(message).append(System.getProperty("line.separator")).append(error));
        }
    }

    public static void warn(Class<?> clazz, String message) {
        Logger logger = LoggerFactory.getLogger(clazz.getName());
        logger.warn(message);
        LOG_TIME = DateTimeUtil.getYearMonthDayHourMinuteSecondMillisecond();
        LOG_LEVEL = "WARN";
        String logPrefix = String.format("%s  %-5s : ", LOG_TIME, LOG_LEVEL);
        message = logPrefix + message;

        // Record step log
        if (StringUtils.isEmpty(StepLogger.getLog())) {
            StepLogger.setLog(StepLogger.getLog().append(message).append(System.getProperty("line.separator")));
        } else {
            StepLogger.setLog(StepLogger.getLog().append(System.getProperty("line.separator")).append(message).append(System.getProperty("line.separator")));
        }
    }

    public static void main(String[] args) {

        // Get log and set log
        error(LogWriter.class, "Error without exception message1!");
        error(LogWriter.class, "Error without exception message2!");
        error(LogWriter.class, "Error without exception message3!");
        error(LogWriter.class, "Error with exception message!", new Exception("This is exception."));
        debug(LogWriter.class, "Debug message1!");
        info(LogWriter.class, "Info message1!");
        warn(LogWriter.class, "Warn message1!");
        System.out.println(StepLogger.getLog());

        // Reset log
        StepLogger.resetLog();
        debug(LogWriter.class, "New debug message1!");
        debug(LogWriter.class, "New debug message2!");
        info(LogWriter.class, "New info message1!");
        warn(LogWriter.class, "New warn message1!");
        debug(LogWriter.class, "New debug message3!");
        info(LogWriter.class, "New info message2!");
        info(LogWriter.class, "New info message3!");
        warn(LogWriter.class, "New warn message2!");
        error(LogWriter.class, "New error with exception message!", new Exception("This is a new exception.", new Exception("Exception 1", new Exception("Exception 2", new Exception("Exception 3")))));
        System.out.println(StepLogger.getLog());
    }

}
