package com.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Tka.College;

public class UpdateData {
	
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(College.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		int id=4;
		College c=ss.get(College.class, id);
		c.setC_name("KVV Karad");
		c.setC_department("Science");
		ss.merge(c);
		tr.commit();
	}

}
