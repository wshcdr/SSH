package com.service.impl;

import com.service_x.PersonService;

public class PersonServiceBean implements PersonService{
	public void init(){
	    System.out.println("init...");	
	}
	public PersonServiceBean(){
		System.out.println("construction...");
	}
	public void save(){
		System.out.println("I am save...");
	}
	public void destroy(){
		System.out.println("destroy...");
	}

}
