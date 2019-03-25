package com.gm.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test
{
	public static void main(String[] args) 
	{
		Configuration configuration=new Configuration().configure ("com/gm/sample/Hibernate.cfg.xml");
		SessionFactory sfactory = configuration.buildSessionFactory();
		Session session=sfactory.openSession();
		Transaction transaction= session.beginTransaction();
		
		//create employee object
		Empdetails empdetails=new Empdetails();
		empdetails.setEid(101);
		empdetails.setEname("Rajani");
		empdetails.setEsalary("5000");
		empdetails.setEaddress("Atlanta");
		
		session.save(empdetails);
	transaction.commit();
	System.out.println("Success..!"); 
		
		
	}

}
