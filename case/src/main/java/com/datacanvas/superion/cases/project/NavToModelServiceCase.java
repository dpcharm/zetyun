package com.datacanvas.superion.cases.project;

import com.alibaba.fastjson.JSONPath;
import com.datacanvas.superion.base.BaseCase;
import com.datacanvas.superion.helper.web.ByAdapter;
import com.datacanvas.superion.util.FileUtil;
import com.datacanvas.superion.util.WebUiToolKit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

public class NavToModelServiceCase extends BaseCase {

    WebElement modelServiceTab;
    String modelServiceTabBy;
    String modelServiceTabByValue;

    WebElement modelServiceListBtn;
    String modelServiceListBtnBy;
    String modelServiceListBtnByValue;


    @BeforeClass
    public void BeforeTest() {
        String loginPageElementJsonPath = String.format("%s%s%s", "element_v610\\project", File.separator, "ModelService.json");
        String loginPageElementJson = FileUtil.readFromFilePath(loginPageElementJsonPath);

        modelServiceTabBy = JSONPath.read(loginPageElementJson, "$.modelService.modelServiceTab.by").toString();
        modelServiceTabByValue = JSONPath.read(loginPageElementJson, "$.modelService.modelServiceTab.byValue").toString();

        modelServiceListBtnBy = JSONPath.read(loginPageElementJson, "$.modelService.modelServiceListBtn.by").toString();
        modelServiceListBtnByValue = JSONPath.read(loginPageElementJson, "$.modelService.modelServiceListBtn.byValue").toString();
    }

    @Test
    public void NavToModelService() throws InterruptedException {
        moveToModelService();

    }

    public void moveToModelService() throws InterruptedException {

        modelServiceTab = driver.findElement(ByAdapter.getBy(modelServiceTabBy, modelServiceTabByValue));
        WebUiToolKit.mouseOver(driver, modelServiceTab);

        Thread.sleep(2000);

        modelServiceListBtn = driver.findElement(ByAdapter.getBy(modelServiceListBtnBy, modelServiceListBtnByValue));
        modelServiceListBtn.click();


    }


}
