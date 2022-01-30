package com.marticus.main;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;




import com.marticus.dao.CoachingCentre;
import com.marticus.dao.StudentC;
import com.marticus.util.HibernateUtil;

import java.util.HashSet;
import java.util.Set;


public class AppCs {
	 

		public static void main(String[] args) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			try {
				transaction = session.beginTransaction();
				
				Set<CoachingCentre> ccName = new HashSet<CoachingCentre>();
				ccName.add(new CoachingCentre("Physics","123"));
				ccName.add(new CoachingCentre("MATHS","456"));
				ccName.add(new CoachingCentre("Chemistry","789"));
				
				StudentC s2 = new StudentC("INDHAR",ccName);
				session.save(s2);
				

									
				transaction.commit();
			} catch (HibernateException e) {
				transaction.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}

		}

	}