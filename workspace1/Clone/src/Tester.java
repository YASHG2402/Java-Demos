class  Vehicle implements Cloneable {
	private int VehNumber;
	private String VehName;
	private double VehPrice;
	
	public Vehicle() {
		
	}
	public Vehicle(int num, String n, double p) {
		VehNumber = num;
		VehName = n;
		VehPrice = p;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public void show() {
		System.out.println(VehNumber + " " + VehName + " " + VehPrice);
	}
}
public class Tester {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle(101, "Maruti", 500000);
		Vehicle v2 = (Vehicle)v1.clone();
		v1.show();
		v2.show();	
	}

}
