package com.frame.frame;

import com.frame.frame.base.XMybatisPlusConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan(basePackages = "com.frame")
@MapperScan("com.frame.frame.web.mapper")
//@Import(XMybatisPlusConfig.class)
//@EnableAutoConfiguration(exclude = XMybatisPlusConfig.class)
public class FrameApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrameApplication.class, args);
	}

}
