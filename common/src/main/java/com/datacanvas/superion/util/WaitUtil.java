package com.datacanvas.superion.util;

import com.datacanvas.superion.helper.log.LogWriter;

import java.util.concurrent.TimeUnit;

public class WaitUtil {

    /**
     * Wait for seconds of timeout
     *
     * @param seconds The timeout
     * @return True if wait successfully, false otherwise
     */
    public static boolean wait(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            LogWriter.error(WaitUtil.class, String.format("wait() exception: %s", e), e);
            return false;
        }
        return true;
    }

    /**
     * Wait for seconds of timeout
     *
     * @param seconds The timeout
     * @return True if wait successfully, false otherwise
     */
    public static boolean wait(double seconds) {
        try {
            TimeUnit.MILLISECONDS.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            LogWriter.error(WaitUtil.class, String.format("wait() exception: %s", e), e);
            return false;
        }
        return true;
    }

}
