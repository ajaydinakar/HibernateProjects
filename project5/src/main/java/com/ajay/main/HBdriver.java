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
		Configuration cfg1=new Configuration();
		Configuration cfg2=new Configuration();
		Configuration cfg3=new Configuration();
		cfg1.configure("hibernate3.cfg.xml");
		cfg2.configure("hibernate2.cfg.xml");
		cfg3.configure("hibernate1.cfg.xml");
		SessionFactory factory1=cfg1.buildSessionFactory();
		SessionFactory factory2=cfg2.buildSessionFactory();
		SessionFactory factory3=cfg3.buildSessionFactory();
		Session ses1=factory1.openSession();
		Session ses2=factory2.openSession();
		Session ses3=factory3.openSession();
		Transaction tx1=ses1.beginTransaction();
		Transaction tx2=ses2.beginTransaction();
		Transaction tx3=ses3.beginTransaction();
		//
	try {
		Student st =new Student();
		st.setId(9);
		st.setName("john doe");
		st.setAge(65);
		ses1.save(st);
		ses2.save(st);
		ses3.save(st);
		tx1.commit();
		tx2.commit();
		tx3.commit();
		ses1.evict(st);
		ses2.evict(st);
		ses3.evict(st);
	}catch(HibernateException e) {e.printStackTrace();}
		finally {
		ses1.close();
		ses2.close();
		ses3.close();
		}
	}

}
