package com.spring;

import org.springframework.stereotype.Component;

@Component("englishchef")
public class EnglishChef implements InternationalChef{

	@Override
	public void makeFood() {
		// TODO Auto-generated method stub
		System.out.println("Fish and Chips");
		
	}
	
	

}
