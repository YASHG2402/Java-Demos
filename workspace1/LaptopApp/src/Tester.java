class Laptop {
	private int lid;
	private String make;
	private double cost;
	
	public Laptop() { // No argument method or default method
		lid = 101;
		make = "Apple";
		cost = 50000;
	}
	public Laptop(int lid, String make, double cost) {   // Parameter method
		this.lid = lid;
		this.make = make;
		this.cost = cost;
	}
	public int getLid() { // getter method
		return lid;
	}
	public void setLid(int lid) { // setter method
		this.lid = lid;
	}
	public String getMake() { // getter method
		return make;
	}
	public void setMake(String make) { // setter method
		this.make = make;
	}
	public double getCost() { // getter method
		return cost;
	}
	public void setCost(double cost) { // setter method
		this.cost = cost;	
	}
	public void show() {
		System.out.println(lid+ " "+make+" "+cost);
	}
}
public class Tester {

	public static void main(String[] args) {
		Laptop l1 = new Laptop(102,"Lenovo", 60000);
		System.out.println(l1.getCost());
		l1.setCost(70000);
		System.out.println(l1.getCost());
		l1.show();

	}

}
