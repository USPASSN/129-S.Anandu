package com.marticus.main;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.marticus.dao.Aadhar;
import com.marticus.dao.Person;
import com.marticus.util.HibernateUtil;

public class AppAp {
	 

		public static void main(String[] args) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			try {
				transaction = session.beginTransaction();
				Aadhar aadhar1 = new Aadhar("Ab12345");
				Aadhar aadhar2 = new Aadhar("AA111");
				Person person1 = new Person("indhar",aadhar1);
				Person person2 = new Person("indharJain",aadhar2);
				session.save(person1);
				session.save(person2);
				transaction.commit();
			} catch (HibernateException e) {
				transaction.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}

		}

	}
 
