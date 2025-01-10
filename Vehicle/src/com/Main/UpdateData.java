package com.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Tka.Vehicle;

public class UpdateData {
	
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Vehicle.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		int id=3;
		Vehicle v=ss.get(Vehicle.class,id);
		v.setName("Swift");
		v.setModel("S346");
		
		ss.merge(v);
		tr.commit();
	}

}
