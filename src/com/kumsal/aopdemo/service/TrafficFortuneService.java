package com.kumsal.aopdemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {

	public String getFortune() throws InterruptedException{
		TimeUnit.SECONDS.sleep(5);
	
		
		return "Expect heavy this morning";
	}

	public String getFortune(boolean tripWire) {
		if (tripWire) {
			throw new RuntimeException("Major accident! Highway is closed");
		}
		return null;
	}
}
