package com.Main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Tka.College;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class FetchAll {
	
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(College.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		
		CriteriaBuilder hcb=ss.getCriteriaBuilder();
		CriteriaQuery<Object>cq=hcb.createQuery();
		Root<College>root=cq.from(College.class);
		cq.select(root);
		
		Query query=ss.createQuery(cq);
		List<College>list=query.getResultList();
		for (College college : list) {
			System.out.println(college);
		}
		tr.commit();
		ss.close();
		
		
	}

}
