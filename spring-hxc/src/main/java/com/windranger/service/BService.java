package com.windranger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BService {
	@Autowired
	AService aService;

	public BService() {
		System.out.println("B service construct");
	}

	public void getAService() {
		System.out.println(aService);
	}
}