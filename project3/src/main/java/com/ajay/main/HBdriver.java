package com.ajay.main;


import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ajay.domain.Student;

public class HBdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session ses=factory.openSession();
		Transaction tx=ses.beginTransaction();
	try {
		Student st =new Student();
		st.setId(4);
		st.setName("krishna");
		st.setAge(28);
		ses.save(st);
		tx.commit();
		ses.evict(st);
	}catch(HibernateException e) {e.printStackTrace();}
		finally {
		ses.close();
		}
	}

}
