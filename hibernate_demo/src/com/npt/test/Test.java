package com.npt.test;

import org.hibernate.Transaction;
import com.npt.db.HibernateSessionFactory;
import com.npt.db.Student;

public class Test {
	public static void main(String[] args) {
		org.hibernate.Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		Student stu = new Student("Äô¾¸Óî", 22, 98);
		try {
			session.save(stu);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	}


