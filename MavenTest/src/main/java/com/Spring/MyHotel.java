package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.ConfigurationClassPostProcessor;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigClass.class);
		InternationalChef chef =ctx.getBean("chinesechef",InternationalChef.class);
		chef.makeFood();
		

	}

}
