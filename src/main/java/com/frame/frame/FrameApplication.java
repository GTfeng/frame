package com.frame.frame;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.frame")
//@MapperScan("com.frame.frame.web.mapper")
public class FrameApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrameApplication.class, args);
	}

}
