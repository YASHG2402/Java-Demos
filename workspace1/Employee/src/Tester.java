class Employee {
	private int empId;
	private String empName;
	private double basicSal;
	
	public Employee() {
		empId=101;
		empName="Yash";
		basicSal=30000;
	}
	public Employee(int id, String n, double s) {
		empId=id;
		empName=n;
		basicSal=s;
	}
	public double getbasicSal() {
		return basicSal;
	}
	public void display() {
		System.out.println(empId+" "+empName+" "+basicSal);
	}
}
class Manager extends Employee{
	private double petrolAll;
	private double foodAll;
	private double otherAll;
	
	public Manager(int empId, String empName, double basicSal) {
		super(empId,empName,basicSal);
		petrolAll=0.08*super.getbasicSal();
		foodAll=0.12*super.getbasicSal();
		otherAll=0.04*super.getbasicSal();
	}
	public double calGrossSal() {
		return super.getbasicSal()+petrolAll+foodAll+otherAll;
	}
	public double PF() {
		return getbasicSal()*0.125;
	}
	public double calNetSalary() {
		return calGrossSal() - PF();
	}
	public void display() {
		super.display();
		System.out.println("Petrol Allowance: " + petrolAll);
		System.out.println("Food Allowance: " + foodAll);
		System.out.println("Other Allowance: " + otherAll);
		System.out.println("PF: " + PF());
		
	}
}
class MarketingEx extends Employee{
	private double kmAll;
	private double tourAll;
	private double telAll=2000;
	
	public MarketingEx(int empId, String empName, double basicSal, int k, int t, int tel) {
		super(empId, empName, basicSal);
		kmAll = k;
		tourAll = k*t;
		telAll = 2000;
	}
	public double calGrossSal() {
		return super.getbasicSal()+kmAll+tourAll+telAll;
	}
	public double PF() {
		return getbasicSal()*0.125;
	}
	public double calNetSalary() {
		return calGrossSal() - PF();
	}
	public void display() {
		super.display();
		System.out.println("Petrol Allowance: " + kmAll);
		System.out.println("Food Allowance: " + tourAll);
		System.out.println("Other Allowance: " + telAll);
	}
}



public class Tester {
	public static void printObject(Employee e1) {
		e1.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101,"Yash",40000);
		e1.display();
		Manager m1 = new Manager(103,"Raj",50000);
		m1.display();
		System.out.println("Gross Salary: " + m1.calGrossSal());
		System.out.println("Net Salary: " + m1.calNetSalary());
		

	}

}
