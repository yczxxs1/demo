package hibernatetest;





import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Account;
import entity.Pi;

public class Onetoonetest {
	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session= sessionFactory.openSession();
		Account a=new Account(7,"a","a");
		Pi p=new Pi(7,"s",a);
		try{
			session.save(p);
			session.beginTransaction().commit();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	
		
	}
}
