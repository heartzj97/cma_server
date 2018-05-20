package com.cma;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@Configuration
@MapperScan(basePackages="com.cma.mapper")
public class CmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmaApplication.class, args);
	}
	
	@Bean  
    public MultipartConfigElement multipartConfigElement() {  
        MultipartConfigFactory factory = new MultipartConfigFactory();  
        //单个文件最大  
        factory.setMaxFileSize("10MB"); //KB,MB  
        //设置总上传数据总大小  
        factory.setMaxRequestSize("100MB");  
        return factory.createMultipartConfig();  
    }  
	
}
