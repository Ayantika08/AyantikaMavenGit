package com.Spring;

import org.springframework.stereotype.Component;

@Component("italianchef")
public class ItalianChef implements InternationalChef {

	@Override
	public void makeFood() {
		// TODO Auto-generated method stub
		System.out.println("Pasta");
	}

}
