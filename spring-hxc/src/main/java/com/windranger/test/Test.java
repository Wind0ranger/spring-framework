package com.windranger.test;

import com.windranger.app.Appconfig;
import com.windranger.service.AService;
import com.windranger.service.BService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
		System.out.println(ac.getBean(AService.class));
		System.out.println(ac.getBean(BService.class));
//		ac.getBean(AService.class).getBService();
//		ac.getBean(AService.class).getBService();
//		ac.getBean(AService.class).getBService();
	}
}
