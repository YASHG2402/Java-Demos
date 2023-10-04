import in.mindcraft.*;
public class Tester {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.show();
		System.out.println();
		Employee e2 = new Employee(222,"Jay",10,10,1995);
		e2.show();
		System.out.println();
		WageEmployee w1 = new WageEmployee(111,"Om",12,12,2022,10,25);
		w1.show();
		System.out.println();
		SalesPerson s1 = new SalesPerson(102,"Sahil",13,06,2022,5,50,200,50);
		s1.show();
		System.out.println("Salary of Employee: " + s1.Salary());
		
		//Employee p1 = new SalesPerson();
		//p1.show();    
	}

}
