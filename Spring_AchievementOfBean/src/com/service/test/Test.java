package com.service.test;
import com.achievementofbean.HiCampClassPathXmlApplicationContext;
import com.service_x.PersonService;

public class Test {
	public static void main(String args[]){
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		HiCampClassPathXmlApplicationContext  ctx = new HiCampClassPathXmlApplicationContext ("beans.xml");
		PersonService personService = (PersonService) ctx.getBean("personService");
		personService.save();
	}
}
