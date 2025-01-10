package com.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Tka.Bird;

public class InsertDataBird {
	
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bird.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		 Bird b=new Bird();
		
		 b.setName("Hen");
		 b.setColor("Black");
    	 ss.persist(b);
		 
		 tr.commit();
		 ss.close();
		 
		 
		
	}

}
