package com.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Tka.Vehicle;

public class InsertData {
	
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicle.class);
		 SessionFactory sf=cfg.buildSessionFactory();
		 Session ss=sf.openSession();
		 Transaction tr=ss.beginTransaction();
		 Vehicle v=new Vehicle();
     	 v.setId(3);
		 v.setName("R15");
		 v.setModel("R354");
		 v.setColor("White");
		 ss.persist(v);
		 tr.commit();
		 ss.close();
		 System.out.println("Data Inserted");
		 
	}
	

}
