package com.windranger.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AService {
	@Autowired
	BService bService;

	public AService() {
		System.out.println("A service construct");
	}

	public void getBService() {
		System.out.println(bService);
	}
}
