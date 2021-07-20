package com.datacanvas.superion.util;

import com.datacanvas.superion.helper.log.LogWriter;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class WebUiToolKit {

    private WebUiToolKit() {
    }

    /**
     * Scroll to web element
     *
     * @param webDriver  Web driver
     * @param webElement The web element
     */
    public static void scrollToWebElement(WebDriver webDriver, WebElement webElement) {
        try {
            JavascriptExecutor jse = (JavascriptExecutor) webDriver;
            jse.executeScript("arguments[0].scrollIntoView(true);", webElement);
        } catch (Exception e) {
            LogWriter.error(WebUiToolKit.class, String.format("Fail to scroll to web element: %s", webElement), e);
        }
    }

    /**
     * Highlight web element
     *
     * @param webDriver  Web driver
     * @param webElement The web element
     */
    public static void highlightWebElement(WebDriver webDriver, WebElement webElement) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
        javascriptExecutor.executeScript("arguments[0].setAttribute('style', arguments[1]);", webElement, "background: yellow; border: 2 px solid red;");
        WaitUtil.wait(WebUiWaitUtil.ONE_SECOND);
    }

    /**
     * Mouse over web element
     *
     * @param webDriver  Web driver
     * @param webElement The web element
     */
    public static void mouseOver(WebDriver webDriver, WebElement webElement) {
        try {
            Actions action = new Actions(webDriver);
            action.moveToElement(webElement).perform();
        } catch (Exception e) {
            LogWriter.error(WebUiToolKit.class, e.getMessage(), e);
        }
    }


}
