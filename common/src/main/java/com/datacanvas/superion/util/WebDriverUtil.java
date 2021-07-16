package com.datacanvas.superion.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtil {

    private WebDriverUtil() {
    }

    static enum SingletonEnum {
        INSTANCE;
        private WebDriver driver;

        private SingletonEnum() {
            System.setProperty("webdriver.chrome.driver", "D:\\workspace\\zetyun\\case\\src\\main\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        public WebDriver getDriver() {
            return driver;
        }
    }

    public static WebDriver getDriver() {
        return SingletonEnum.INSTANCE.getDriver();
    }

    public static void main(String[] args) {
        System.out.println(WebDriverUtil.getDriver());
        System.out.println(WebDriverUtil.getDriver());
        System.out.println(WebDriverUtil.getDriver());
        System.out.println(WebDriverUtil.getDriver());
        System.out.println(WebDriverUtil.getDriver());
    }

}
