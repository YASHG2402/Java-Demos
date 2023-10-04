package in.mindcraft.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1 = new Laptop();
		l1.setLid(102);
		l1.setName("HP");
		
		Laptop l2 = new Laptop();
		l2.setLid(103);
		l2.setName("ASUS");
		
		Student s1 = new Student();
		s1.setRollno(101);
		s1.setName("Yash");
		Student s2 = new Student();
		s2.setRollno(102);
		s2.setName("Raj");
		
		s1.getList().add(l1);
		s1.getList().add(l2);
		
		l1.getList().add(s1);
		l2.getList().add(s2);
		
		Configuration con = new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(s1);
		session.save(s2);
		session.save(l1);
		session.save(l2);
		tx.commit();
	}

}
