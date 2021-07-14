package com.datacanvas.superion.service;

import com.alibaba.fastjson.JSONPath;
import com.datacanvas.superion.pojo.Plan;
import com.datacanvas.superion.util.FileUtil;

import javax.annotation.Resource;
import java.io.File;

public class PlanBo {


    @Resource
    Plan plan;

    public Plan getPlanProperty(String planPath){

        String planMetaPath = String.format("%s%s%s",planPath, File.separator,"planMeta.json");
        String metaJson = FileUtil.readFromFilePath(planMetaPath);
        String name = JSONPath.read(metaJson, "$.name").toString();
        System.out.println(name);


        return plan;
    }




}
