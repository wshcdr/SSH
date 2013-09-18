package com.service.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service_x.PersonService;

public class Test {
	public static void main(String args[]){
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext  ctx = new ClassPathXmlApplicationContext ("beans.xml");
		PersonService personService = (PersonService) ctx.getBean("personService");
		personService.save();
		/*
		for(String str:personService.getList()){
			System.out.println(str);
		}
		*/
	}
}
