package in.mindcraft.HibernateAssignment;

import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Tester {

	public static void main(String[] args) {
		
		//MobilePhone m1 = new MobilePhone(1,"Google Pixel", 60000);
		
		Configuration con = new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		//session.save(m1);
		//tx.commit();
		
		int choice;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Add a Mobile Phone");
			System.out.println("2. Update a Mobile Phone");
			System.out.println("3. Delete a Mobile Phone");
			System.out.println("4. Display all Mobile Phones");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the mobile id, name and price");
				MobilePhone m = new MobilePhone(sc.nextInt(),sc.next(),sc.nextDouble());
				session.save(m);
				tx.commit();
				break;
			}
		}

	}

}
