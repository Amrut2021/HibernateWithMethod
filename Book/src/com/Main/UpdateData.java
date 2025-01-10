package com.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Tka.Book;

public class UpdateData {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Book.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		int id=1;
		Book b=ss.get(Book.class,id);
		b.setB_Name("C & C++");
		b.setNoOfPages(475);
		ss.merge(b);
		tr.commit();
		
		
	
	}

}
