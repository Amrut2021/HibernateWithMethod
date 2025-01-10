package com.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Tka.College;

public class InsertData {
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(College.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr=ss.beginTransaction();
		College c=new College();
		c.setId(4);
		c.setC_name("DYP Pune");
		c.setC_department("Arts");
		System.out.println("data inserted");
		ss.persist(c);
		tr.commit();
		ss.close();
	}

}
