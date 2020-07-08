package com.demo.spring.app.property.rest.controller;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/config/myapp/myapp.properties")
@PropertySource("classpath:/config/system/sysapp.properties")
public class ConfigClass {

	
	//myapp.properties config values
	
	@NotBlank(message="A url can not be empty")
	String test = "";
	
	@Min(message="Enter a valid id", value = 5)
	private int id;
	
	@Value("${myapp.url}")
	private String myAppUrl;
	
	@Value("${myapp.username}")
	private String myAppUsername;
	
	@Value("${myapp.password}")
	private String myAppPassword;

	
	//myapp.properties config values
	@Value("${sysapp.url}")
	private String sysAppUrl;
	
	@Value("${sysapp.username}")
	private String sysAppUsername;
	
	@Value("${sysapp.password}")
	private String sysAppPassword;
	
	
	
	public String getSysAppUrl() {
		return sysAppUrl;
	}

	public void setSysAppUrl(String sysAppUrl) {
		this.sysAppUrl = sysAppUrl;
	}

	public String getSysAppUsername() {
		return sysAppUsername;
	}

	public void setSysAppUsername(String sysAppUsername) {
		this.sysAppUsername = sysAppUsername;
	}

	public String getSysAppPassword() {
		return sysAppPassword;
	}

	public void setSysAppPassword(String sysAppPassword) {
		this.sysAppPassword = sysAppPassword;
	}

	public String getMyAppUrl() {
		return myAppUrl;
	}

	public void setMyAppUrl(String myAppUrl) {
		this.myAppUrl = myAppUrl;
	}

	public String getMyAppUsername() {
		return myAppUsername;
	}

	public void setMyAppUsername(String myAppUsername) {
		this.myAppUsername = myAppUsername;
	}

	public String getMyAppPassword() {
		return myAppPassword;
	}

	public void setMyAppPassword(String myAppPassword) {
		this.myAppPassword = myAppPassword;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public void testConstraint(@Valid int id) {
		// TODO Auto-generated method stub
		
		this.id = id;
		System.out.println(id);
		
	}

	
}
