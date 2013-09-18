package com.dao.impl;

import org.springframework.stereotype.Repository;

import com.dao_x.PersonDao;
@Repository("personDaoBean")
public class PersonDaoBean implements PersonDao {
	public void add(){
		System.out.println("add...");
	}

}
