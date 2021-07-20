package com.datacanvas.superion.util;

import com.datacanvas.superion.helper.log.LogWriter;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

@SuppressWarnings("unchecked")
public class WebUiWaitUtil {

    public static final double ZERO_POINT_ONE_SECOND = 0.1;
    public static final double ZERO_POINT_TWO_SECOND = 0.2;
    public static final double ZERO_POINT_THREE_SECOND = 0.3;
    public static final double ZERO_POINT_FIVE_SECOND = 0.5;
    public static final int ONE_SECOND = 1;
    public static final int TWO_SECONDS = 2;
    public static final int THREE_SECONDS = 3;
    public static final int FIVE_SECONDS = 5;
    public static final int TEN_SECONDS = 10;
    public static final int TWENTY_SECONDS = 20;
    public static final int THIRTY_SECONDS = 30;
    public static final int ONE_MINUTE = 1 * 60;
    public static final int TWO_MINUTES = 2 * 60;
    public static final int THREE_MINUTES = 3 * 60;
    public static final int FOUR_MINUTES = 4 * 60;
    public static final int FIVE_MINUTES = 5 * 60;
    public static final int TEN_MINUTES = 10 * 60;
    public static final int TWENTY_MINUTES = 20 * 60;
    public static final int THIRTY_MINUTES = 30 * 60;
    public static final int ONE_HOUR = 1 * 60 * 60;
    public static final int TWO_HOURS = 2 * 60 * 60;
    public static final int THREE_HOURS = 3 * 60 * 60;

    private WebUiWaitUtil() {
        throw new AssertionError();
    }


}
