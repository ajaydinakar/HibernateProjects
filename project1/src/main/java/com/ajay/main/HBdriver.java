package com.ajay.main;


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
		Student st =new Student();
		st.setId(2);
		st.setName("suresh");
		st.setAge(27);
		ses.save(st);
		tx.commit();
		ses.evict(st);
		ses.close();
		
		

	}

}
