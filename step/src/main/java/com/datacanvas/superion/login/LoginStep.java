package com.datacanvas.superion.login;

import com.datacanvas.superion.util.FileUtil;

import java.io.File;

public class LoginStep {

    public static void main(String[] args) {
        String format = String.format("%s%s%s", "executor/workdir/UI/case/Login--Login", File.separator, "caseMeta.json");
        String s = FileUtil.readFromFilePath(format);
        System.out.println(s);


    }


}
