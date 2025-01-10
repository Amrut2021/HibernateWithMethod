package com.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Tka.College;

public class DeleteData {
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(College.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr=ss.beginTransaction();
//		College c=new College();
		int id=2;
		College c=ss.get(College.class, id);
		ss.remove(c);
		tr.commit();
		ss.close();
		
	}

}
