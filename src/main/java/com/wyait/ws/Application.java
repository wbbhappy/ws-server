package com.wyait.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

// 这是一个配置Spring的配置类
@Configuration
// @SpringBootApplication：Spring Boot项目的核心注解，主要目的是开启自动配置，自动扫描该类同级包以及子包。
@SpringBootApplication
// @MapperScan(basePackages = "com.wyait.boot.dao")
public class Application {
	public static void main(String[] args) {
		// 启动spring boot应用
		SpringApplication sa = new SpringApplication(Application.class);
		// 禁用命令行更改application.properties属性
		sa.setAddCommandLineProperties(false);
		sa.run(args);
	}
}
