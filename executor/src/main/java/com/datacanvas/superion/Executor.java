package com.datacanvas.superion;

import com.datacanvas.superion.util.FileUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;


@SpringBootApplication
public class Executor {


    private static ConfigurableApplicationContext appContext;

    @Value("D:\\workspace\\zetyun\\executor\\workdir\\UI\\6.1.0\\plan\\planMeta.json")
    Resource planPath;

    @Bean(name = "planPath")
    String planPath() throws IOException {
        return planPath.getFile().getPath();
    }

    public static void main(String[] args) {

        SpringApplication springApplication = new  SpringApplication(Executor.class);
        appContext = springApplication.run(Executor.class,args);

        String planPath = (String) appContext.getBean("planPath");
        String format = String.format("%s%s%s", planPath, File.separator, "planMeta.json");
        String s = FileUtil.readFromFilePath(format);

        System.out.println(s);


    }

}
