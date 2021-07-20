package com.datacanvas.superion.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class WebUiAceUtil {

    public static String getValue(WebDriver webDriver, String elementId) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
        String s = String.format("var s = ace.edit('%s').getValue(); return s;", elementId);
        return (String) javascriptExecutor.executeScript(s);
    }

    public static void setValue(WebDriver webDriver, String elementId, String value) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
        String s = String.format("ace.edit('%s').setValue('%s');", elementId, value);
        javascriptExecutor.executeScript(s);
    }

}
