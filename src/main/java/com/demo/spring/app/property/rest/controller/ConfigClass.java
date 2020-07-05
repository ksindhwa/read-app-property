package com.demo.spring.app.property.rest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/config/myapp/myapp.properties")
@PropertySource("classpath:/config/system/sysapp.properties")
public class ConfigClass {

	
	//myapp.properties config values
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

	
}
