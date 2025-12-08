package com.nt.Config;

import java.beans.BeanProperty;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig:: 0-param constutor");
	}
	@Bean(name="ltime")
	public LocalTime createltime() {
		System.out.println("AppConfig.createltime()");
		return LocalTime.now();
		
	}
	@Bean(name="ldate")
	public LocalDate createldate() {
		System.out.println("AppConfig.createldate()");
		return LocalDate.now();
	}
	

}
