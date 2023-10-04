package in.mindcraft.HQLDemo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*MobilePhone m1 = new MobilePhone(101,"Apple",70000);
		MobilePhone m2 = new MobilePhone(102,"Oppo",45000);
		MobilePhone m3 = new MobilePhone(103,"Nokia",30000);	
		MobilePhone m4 = new MobilePhone(104,"Asus ROG",60000);*/
		
		Configuration con = new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		//MobilePhone m = (MobilePhone)session.get(MobilePhone.class, 102);
		
		//System.out.println("Details of Mobile: " + m);
		
		Query query = session.createQuery("from MobilePhone where cost > 50000");
		List<MobilePhone> mlist = query.list();
		for(MobilePhone m:mlist)
			System.out.println(m);
		/*session.save(m1);
		session.save(m2);
		session.save(m3);
		session.save(m4);*/
		
		tx.commit();

	}

}
