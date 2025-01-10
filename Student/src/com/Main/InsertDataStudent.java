package com.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Tka.Student;

public class InsertDataStudent {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Student s = new Student();

		s.setId(5);
		s.setName("Kiaan");
		s.setAge(23);
		s.setGender("Male");
		s.setAddress("Satara");

		ss.persist(s);
		tr.commit();
		ss.close();

		System.out.println("data inserted");

	}

}
