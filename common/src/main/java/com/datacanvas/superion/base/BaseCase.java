package com.datacanvas.superion.base;

import com.datacanvas.superion.util.WebDriverUtil;

import java.util.logging.Logger;


public class BaseCase {

    public BaseCase() {
        WebDriverUtil.getDriver();
    }

}
