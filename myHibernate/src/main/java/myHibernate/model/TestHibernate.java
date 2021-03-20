package myHibernate.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		Employee emp = new Employee(1,"John",89999);
		s.save(emp);
		System.out.println("Object Saved");
		
		t.commit();
		s.close();
		
	}

}
