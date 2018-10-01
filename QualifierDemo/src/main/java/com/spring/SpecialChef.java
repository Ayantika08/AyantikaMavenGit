package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("specialchef")
public class SpecialChef {
	
	InternationalChef chef;
	
	public void makeFood()
	{
		chef.makeFood();
	}
	
	@Autowired
	@Qualifier("koreanchef")
	public void setChef(InternationalChef chef) 
	{
		this.chef = chef;
	}
	

}
