package hibernatetest;




import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


import entity.Emp;

public class HqlTest {
	
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		//外键 多对一 懒加载
		Query<Emp> query=session.createQuery("from Emp", Emp.class);
		List<Emp> list=query.getResultList();
		for(Emp emp:list){
			System.out.println("ename:"+emp.getEname());
			System.out.println("dname:"+emp.getDept().getDname());
		}
		//指定多列查询
		Query<Object[]> query1=session.createQuery("select e.ename,e.job from Emp e", Object[].class);
		List<Object[]> list1=query1.getResultList();
		for(Object[] str:list1){
			System.out.println(str[0]);
		}
		//指定单列查询
		Query<Object> query2=session.createQuery("select e.job from Emp e", Object.class);
		List<Object> list2=query2.getResultList();
		for(Object o:list2){
			System.out.println(o);
		}
		//单个对象查询
		Query<Emp> query3=session.createQuery("from Emp e where e.empno=7369",Emp.class);
		Emp e=query3.getSingleResult();
		System.out.println(e.getEname());
		
		Emp emp=session.get(Emp.class, 7499);
		System.out.println(emp.getDept().getDname());
		
	}
}
