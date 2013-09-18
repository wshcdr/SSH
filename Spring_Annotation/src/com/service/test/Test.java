package com.service.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service_x.PersonService;

public class Test {
	public static void main(String args[]) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"beans.xml");
		PersonService personService = (PersonService) ctx
				.getBean("personServiceBean");
		/** pay attention to the name of the Bean. **/
		System.out.println(personService);
		personService.save();
		ctx.close();
	}
}
