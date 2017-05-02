package com.schoolinformationmanagementsystem.mytools;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorExecution {  
    public static void generator(){  
          
        List<String> warnings=new ArrayList<String>();  
        try {   
        //specify the location of the  config file to generator
        File configFile=new File("./src/main/resources/mybatis/mybatis-generator/mybatis-generator.xml");  
        //parser the file
        ConfigurationParser cp=new ConfigurationParser(warnings);  
        Configuration config=cp.parseConfiguration(configFile);  
        //set whether the file could be override
        DefaultShellCallback dsc=new DefaultShellCallback(true);  
        MyBatisGenerator mg=new MyBatisGenerator(config, dsc, warnings);  
        mg.generate(null);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
          
    }  
  
    /**  
     * @param args  
     */  
    public static void main(String[] args) {  
        GeneratorExecution.generator();  
        System.out.println("done!");  
    }  
  
}  