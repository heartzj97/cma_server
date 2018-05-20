package com.cma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages="com.cma.mapper")
public class CmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmaApplication.class, args);
	}
}
