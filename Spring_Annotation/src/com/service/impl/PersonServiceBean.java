package com.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.dao_x.PersonDao;
import com.service_x.PersonService;
@Service("personServiceBean")
//@Scope("prototype")
public class PersonServiceBean implements PersonService {
	//@Autowired private PersonDao personDao;
	//@Resource(name = "personDao")
	private PersonDao personDao;

	// @Resource first:name then:type @Autowired first:type
	@PostConstruct
	public void init(){
		System.out.println("init...");
	}
	@PreDestroy
	public void destory(){
		System.out.println("destory...");
	}
	public PersonServiceBean() {
	}
	@Resource
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
    /** only the setter method is used. **/
	public PersonServiceBean(PersonDao personDao, String name) {
		super();
		this.personDao = personDao;
		// this.name = name;
	}

	public void save() {
		// System.out.println(name);
		personDao.add();
	}
}
