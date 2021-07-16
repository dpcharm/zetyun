package com.datacanvas.superion.util;

import com.datacanvas.superion.helper.log.LogWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {


    public static String readFromFilePath(String filePath) {
        String path = "src/main/resources";
        String content = "";
        File file = new File(filePath);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path + File.separator + file));
            String str;
            while ((str = reader.readLine()) != null) {
                content += str;
            }
            reader.close();
        } catch (IOException e) {
            LogWriter.error(FileUtil.class, String.format("readFromFilePath() exception: %s", e), e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ex) {
                }
            }
        }
        return content;
    }
}
