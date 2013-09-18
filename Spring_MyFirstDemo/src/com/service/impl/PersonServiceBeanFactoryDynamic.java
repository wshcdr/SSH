package com.service.impl;

public class PersonServiceBeanFactoryDynamic {
	public PersonServiceBean createPersonServiceBean()
	{
		return new PersonServiceBean();
	}

}
