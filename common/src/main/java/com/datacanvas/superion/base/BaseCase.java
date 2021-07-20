package com.datacanvas.superion.base;

import com.datacanvas.superion.util.WebDriverUtil;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;


public class BaseCase {

    protected static WebDriver driver;
    protected static Logger logger;

    public BaseCase() {
        WebDriverUtil.getDriver();

    }

}
