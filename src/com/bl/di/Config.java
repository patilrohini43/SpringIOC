package com.bl.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {
	
	@Bean
	public Student student() {
		Student student=new Student();
		return student;
	}

}
