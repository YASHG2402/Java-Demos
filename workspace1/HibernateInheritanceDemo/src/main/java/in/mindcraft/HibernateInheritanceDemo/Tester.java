package in.mindcraft.HibernateInheritanceDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		//acc.setAcc_id(1);
		acc.setName("Arnav");
		acc.setBalance(500000);
		
		SavingsAccount sacc = new SavingsAccount();
		//sacc.setAcc_id(2);
		sacc.setInterestRate(5);
		
		CurrentAccount cacc = new CurrentAccount();
		//cacc.setAcc_id(3);
		cacc.setOverlimit(10000);
		
		Configuration con = new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(acc);
		session.save(sacc);
		session.save(cacc);
		
		tx.commit();
	}

}
