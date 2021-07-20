package com.datacanvas.superion.cases.login;

import com.alibaba.fastjson.JSONPath;
import com.datacanvas.superion.base.BaseCase;
import com.datacanvas.superion.helper.web.ByAdapter;
import com.datacanvas.superion.util.FileUtil;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Locale;
import java.util.ResourceBundle;

public class LoginCase extends BaseCase {

    WebElement userName;
    String userNameBy;
    String userNameByValue;

    WebElement passwd;
    String passwdBy;
    String passwdByValue;

    WebElement login;
    String loginBy;
    String loginByValue;

    String url; //登录网址
    String uname;   //用户名
    String pwd; //密码

    @BeforeClass
    public void getAllElement() {

        String loginPageElementJsonPath = String.format("%s%s%s", "element_v610\\login", File.separator, "Login.json");
        String loginPageElementJson = FileUtil.readFromFilePath(loginPageElementJsonPath);

        userNameBy = JSONPath.read(loginPageElementJson, "$.login.userName.by").toString();
        userNameByValue = JSONPath.read(loginPageElementJson, "$.login.userName.byValue").toString();

        passwdBy = JSONPath.read(loginPageElementJson, "$.login.passwd.by").toString();
        passwdByValue = JSONPath.read(loginPageElementJson, "$.login.passwd.byValue").toString();

        loginBy = JSONPath.read(loginPageElementJson, "$.login.loginButton.by").toString();
        loginByValue = JSONPath.read(loginPageElementJson, "$.login.loginButton.byValue").toString();

        ResourceBundle bundle = ResourceBundle.getBundle("element_v610/login/Login", Locale.CHINA);
        url = bundle.getString("url");
        uname = bundle.getString("userName");
        pwd = bundle.getString("passwd");
    }

    @Test
    public void login() {
        driver.get(url);
        inputUnameAndPwd();
    }

    public void inputUnameAndPwd() {
        userName = driver.findElement(ByAdapter.getBy(userNameBy, userNameByValue));
        userName.sendKeys(uname);
        passwd = driver.findElement(ByAdapter.getBy(passwdBy, passwdByValue));
        passwd.sendKeys(pwd);
        login = driver.findElement(ByAdapter.getBy(loginBy, loginByValue));
        login.click();
    }

}
