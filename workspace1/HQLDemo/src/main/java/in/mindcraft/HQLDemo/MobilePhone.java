package in.mindcraft.HQLDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MobilePhone {
	@Id
	private int mid;
	private String name;
	private double cost;
	
	public MobilePhone() {
		
	}
	
	public MobilePhone(int mid, String name, double cost) {
		this.mid= mid;
		this.name=name;
		this.cost = cost;
	}
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "MobilePhone [mid=" + mid + ", name=" + name + ", cost=" + cost + "]";
	}
	
	
}
