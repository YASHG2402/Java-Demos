package in.mindcraft.HibernateAssignment1;

import java.util.List;
import java.util.Scanner;

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
		Configuration con = new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
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
				System.out.println("Enter mobile id, name and cost");
				MobilePhone m1 = new MobilePhone();
				int mid = sc.nextInt();
				String name = sc.next();
				double cost = sc.nextDouble();
				m1.setMid(mid);
				m1.setName(name);
				m1.setCost(cost);
				session.save(m1);
				tx.commit();
			case 2:
				System.out.println("Enter the mid to update the mobile phone");
				int updateId = sc.nextInt();
				MobilePhone updateMobile = (MobilePhone) session.get(MobilePhone.class, updateId);
				
				if(updateMobile != null)
					System.out.println("Enter the new name: ");
				    String updateMake = sc.next();
			case 3:
				
			case 4:
				Query query = session.createQuery("from MobilePhone");
				List<MobilePhone> mlist = query.list();
				for(MobilePhone m:mlist)
					System.out.println(m);
				tx.commit();
				
			}
		}
	}

}
