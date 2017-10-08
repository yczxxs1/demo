package hibernatetest;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Emp;

public class HibernateTest2 {
	static SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	static Session session= sessionFactory.getCurrentSession();
	public static void main(String[] args) {
		

		session.get(Emp.class,7369);
	}
}
