package com.Main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Tka.Bird;
import com.arjuna.ats.internal.jdbc.drivers.modifiers.list;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class FetchAll {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bird.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		CriteriaBuilder cb=ss.getCriteriaBuilder();
		CriteriaQuery<Object>cq=cb.createQuery();
		Root<Bird>root=cq.from(Bird.class);
		
		cq.select(root);
		Query query=ss.createQuery(cq);
		
		List<Bird>list=query.getResultList();
		
		for (Bird bird : list) {
			System.out.println(bird);
		}
		
		
	}

}
