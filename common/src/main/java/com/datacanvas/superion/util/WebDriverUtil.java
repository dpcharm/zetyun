package com.datacanvas.superion.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtil {

    private static final WebDriverUtil WebDriverUtil = new WebDriverUtil();

    private WebDriverUtil() {
    }

    public static WebDriverUtil getDriver() {
        System.setProperty("webdriver.chrome.driver", "D:\\workspace\\zetyun\\case\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        return WebDriverUtil;
    }

    public static void main(String[] args) {
        System.out.println(WebDriverUtil.getDriver());
        System.out.println(WebDriverUtil.getDriver());
        System.out.println(WebDriverUtil.getDriver());
        System.out.println(WebDriverUtil.getDriver());
        System.out.println(WebDriverUtil.getDriver());
    }

//    public WebDriverUtil() {
//    }
//
//    static enum SingletonEnum {
//        INSTANCE;
//        private WebDriver driver;
//
//        private SingletonEnum() {
//            System.setProperty("webdriver.chrome.driver", "D:\\workspace\\zetyun\\case\\src\\main\\resources\\chromedriver.exe");
//            driver = new ChromeDriver();
//            driver.manage().window().maximize();
//        }
//
//        public WebDriver getDriver() {
//            return driver;
//        }
//    }
//
//    public static WebDriver getDriver() {
//        return SingletonEnum.INSTANCE.getDriver();
//    }


}
