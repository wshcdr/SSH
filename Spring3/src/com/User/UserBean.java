package com.User;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class UserBean {
       public boolean checkUser(String name,String password){
    	   boolean res = false;
    	   Resource rs = new ClassPathResource("beans.xml");
           BeanFactory factory = new XmlBeanFactory(rs);
           User user = (User)factory.getBean("user");
           if(user.getName().equals(name)&&user.getPassword().equals(password)){
        	   res = true;
           }
           return res;
       }
}
