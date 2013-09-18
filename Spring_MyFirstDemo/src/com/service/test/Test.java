package com.service.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service_x.PersonService;

public class Test {
	public static void main(String args[]){
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		//PersonService personService1 = (PersonService) ctx.getBean("personService3");
		//singleton pattern
		//PersonService personService2 = (PersonService) ctx.getBean("personService3");
        //System.out.println(personService1 == personService2);
		//scope = "prototype" get a new Bean object.
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		PersonService personService = (PersonService) ctx.getBean("personService3");
        personService.save();
        ctx.close();
        /** if I want to use the close(),I need to use the AbstractApplicationContext **/
	}
}
