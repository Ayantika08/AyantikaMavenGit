package com.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("koreanchef")

public class KoreanChef implements InternationalChef{
	
	public void makeFood()
	{
		System.out.println("Patbingsu");
	}

}
