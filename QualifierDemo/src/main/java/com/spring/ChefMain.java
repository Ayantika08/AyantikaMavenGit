package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ChefMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ChefConfig.class);
		SpecialChef sc = ctx.getBean("specialchef", SpecialChef.class);
		sc.makeFood();
	}
}
