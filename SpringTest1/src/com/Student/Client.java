package com.Student;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	public static void main(String args[]){
		Resource rs = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(rs);
		Student stu = (Student)factory.getBean("student");
		String stuName = stu.getName();
		int stuAge = stu.getAge();
		System.out.println(stuName);
		System.out.println(stuAge);
}
}
