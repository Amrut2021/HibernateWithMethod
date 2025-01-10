package com.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Tka.Book;

public class InsertDataBook {
	
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Book.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		 Book b=new Book();
		 b.setId(2);
		 b.setB_Name("Bhagavad Gita");
		 b.setB_Author("S.Radhakrishnan");
		 b.setLanguage("English");
		 b.setNoOfPages(657);
		 ss.persist(b);
		 tr.commit();
		 ss.close();
		 
		 System.out.println("Data inserted");
		 
		 
		 
	}

}
