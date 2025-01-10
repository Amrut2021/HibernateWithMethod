package com.Main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Tka.Book;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class FetchAll {
	
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Book.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
	
		CriteriaBuilder cb=ss.getCriteriaBuilder();
		CriteriaQuery<Object>cq=cb.createQuery();
		Root<Book>root=cq.from(Book.class);
		cq.select(root);
		
		Query query=ss.createQuery(cq);
		List<Book>list=query.getResultList();
		
		for (Book book : list) {
			System.out.println(book);
		}
	}

}
