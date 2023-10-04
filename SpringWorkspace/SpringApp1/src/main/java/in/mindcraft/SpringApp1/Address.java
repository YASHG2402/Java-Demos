package in.mindcraft.SpringApp1;

public class Address {
	private String city;
	private String state;
	
	public Address() {
		
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public void display() {
		System.out.println(city);
		System.out.println(state);
	}
	
}
