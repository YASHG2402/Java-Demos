import java.util.ArrayList;
import java.util.Scanner;

class Employee {
	private int empid;
	private String empName;
	private double salary;
	
	public Employee() {
		empid=101;
		empName="Yash";
		salary=30000;
	}
	public Employee(int empid, String empName, double Salary) {
		this.empid=empid;
		this.empName=empName;
		this.salary=salary;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void display() {
		System.out.println("Employee Id: " + empid);
		System.out.println("Employee Name: " + empName);
		System.out.println("Salary: " + salary);
	}
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id: ");
		empid = sc.nextInt();
		System.out.println("Enter employee name: ");
		empName = sc.next();
		System.out.println("Enter Salary: ");
		salary = sc.nextDouble();
	}
	public void updateInfo(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
    }
}
public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 		ArrayList <Employee> li = new ArrayList<>();
		while(true) {
			System.out.println("1. Insert a record");
			System.out.println("2. Update the record");
			System.out.println("3. Display the record");
			System.out.println("4. Exit");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				Employee newEmployee = new Employee();
				newEmployee.accept();
				li.add(newEmployee);
				System.out.println("Record inserted successfully");
				break;
			case 2:
				System.out.println("Enter the employee id to update: ");
				int empidToUpdate = sc.nextInt();
				sc.nextLine();
				boolean found = false;
				for(Employee emp: li) {
					if(emp.getEmpid() == empidToUpdate) {
						System.out.println("Enter new Employee name: ");
						String newEmpName = sc.nextLine();
						System.out.println("Enter new Salary: ");
						double newSalary = sc.nextDouble();
						emp.updateInfo(newEmpName, newSalary);
						found=true;
						break;
					}
				}
				if(!found) {
					System.out.println("Employee not found");
				}
				break;
			case 3:
				System.out.println("Employee Records:");
				for(Employee emp:li) {
					emp.display();
				}
				break;
			case 4:
				System.out.println("Exiting the program.");
                System.exit(0); 
			}
		}
	}
}
