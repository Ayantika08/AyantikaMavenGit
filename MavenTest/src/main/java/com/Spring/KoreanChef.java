package com.Spring;

import org.springframework.stereotype.Component;

@Component("koreanchef")
public class KoreanChef implements InternationalChef{

	@Override
	public void makeFood() {
		// TODO Auto-generated method stub
		System.out.println("Jajangmyeon");
		
	}
	

}
