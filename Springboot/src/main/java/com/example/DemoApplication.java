package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Utiles.ResponseVo;
import com.example.hxyz.Service.DemoService;
import com.example.hxyz.domain.entity.FactoryUserEntity;
@Configuration
@ComponentScan("com.example")
// Spring Boot的AutoConfig和载入外部properties文件的 标识
@EnableConfigurationProperties
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class})
@RestController
public class DemoApplication {
	
	@RequestMapping("/")
	public String index(){
		return "Hello World";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}

}
