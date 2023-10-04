import java.util.*;
class Laptop implements Comparable<Laptop> {
	private int lid;
	private String name;
	private double cost;
	
	public Laptop() {
		lid=101;
		name="Lenovo";
		cost=40000;
	}
	public Laptop(int lid, String name, double cost) {
		this.lid=lid;
		this.name=name;
		this.cost=cost;
	}
	public void show() {
		System.out.println(lid+" "+name+" "+cost);
	}
	public String toString() {
		return "\nlid=" + lid + " name=" + name + " cost=" + cost;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cost, lid, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && lid == other.lid
				&& Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(Laptop o) {
		if(this.cost<o.cost)
			return -1;
		else if(this.cost>o.cost)
			return 1;
		else
			return 0;
	}
	public int getLid() {
		return lid;
	}
	
	
}
class LaptopCompare implements Comparator<Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
		if(o1.getLid()<o2.getLid())
			return -1;
		else if(o1.getLid()>o2.getLid())
			return 1;
		else
			return 0;
	}
	
}
public class Tester {

	public static void main(String[] args) {
		Set<Laptop> set = new TreeSet<>();
		set.add(new Laptop(102,"HP",50000));
		set.add(new Laptop(103,"Acer",70000));
		set.add(new Laptop(104,"Lenovo",80000));
		System.out.println("TreeSet: "+ set); 
		System.out.println();
		List<Laptop> list = new ArrayList<>();
		list.add(new Laptop(108,"Asus",65000));
		list.add(new Laptop(105,"Dell",40000));
		list.add(new Laptop(110,"Apple",80000));
		Collections.sort(list, new LaptopCompare());
		System.out.println("ArrayList: " + list);
	}

}
