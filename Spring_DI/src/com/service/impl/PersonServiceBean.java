package com.service.impl;

import java.util.*;


import com.dao_x.PersonDao;
import com.service_x.PersonService;

public class PersonServiceBean implements PersonService{
	private PersonDao personDao;
	private String name;
	public PersonServiceBean(PersonDao personDao,String name){
		super();
		this.personDao = personDao;
		this.name = name;
	}
	/*
	private List<String> list = new ArrayList<String>(); 
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
    */
	public void save(){
		System.out.println(name);
	    personDao.add();
	    //服务层和DAO层彻底解耦
	}
}
