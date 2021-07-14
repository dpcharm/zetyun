package com.datacanvas.superion.helper.web;

import org.openqa.selenium.By;

public class ByAdapter {

    private static By by;

    public static By getBy(String locator, String value){
        switch (locator.toLowerCase()){
            case "id":
                by = By.id(value);
                break;
            case "xpath":
                by = By.xpath(value);
                break;
        }
        return by;
    }

}
