package com.datacanvas.superion.helper.log;

public class StepLogger {

    private static final StepLogger stepLogger = new StepLogger();
    private StringBuilder log;

    private StepLogger() {
        log = new StringBuilder();
    }

    private static StepLogger getStepLogger() {
        return stepLogger;
    }

    public static StringBuilder getLog() {
        return stepLogger.log;
    }

    public static void setLog(StringBuilder strBuilder) {
        stepLogger.log = strBuilder;
    }

    public static void resetLog() {
        stepLogger.log = new StringBuilder();
    }

}
