package hibernatetest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Dept;
import entity.Emp;

public class HibernateTest {
	public static void main(String[] args) {
	// findEmpbyDept();
	  //update(); 
		//add();
		Dept d1=new Dept(1,"sss");
		Emp e=new Emp(45,"sad");
		Emp e2=new Emp(46,"sd");
		//many to one
		e.setDept(d1);
		e2.setDept(d1);
		//one to many
		d1.getEmps().add(e);
		d1.getEmps().add(e2);
		session.save(d1);
		session.save(e);
		session.save(e2);
		session.beginTransaction().commit();
	}
	
	
		
	static SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	static Session session= sessionFactory.openSession();
	
	/**
	 * one to many
	 */
	static void add(){
		
			Emp e1 = new Emp(32,"ss");
			Emp e2=new Emp(33,"aa");
			Dept d1=new Dept(32,"s");
			d1.getEmps().add(e1);
			d1.getEmps().add(e2);
			session.save(d1);
			session.save(e1);
			session.save(e2);
			session.beginTransaction().commit();
	
	}
	/**
	 * one to many
	 */
	static void findEmpbyDept(){
		Dept d=session.get(Dept.class, 22);
		for(Emp e:d.getEmps()){
			System.out.println(e.getEmpno()+e.getEname());
		}
	}
	/**
	 * one to many
	 */
	static void update(){
		Dept d=new Dept(13,"sd");
		Emp e=session.get(Emp.class, 1);
		d.getEmps().add(e);
		session.save(d);
		session.beginTransaction().commit();
	}

}
