import java.util.*;


public class Tester {
	// vector:- It is called as dynamically growing array.
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		System.out.println(v);  // using toString
		for(Integer val:v)
			System.out.print(val+" ");
		System.out.println();
		
		Iterator <Integer> itr = v.iterator(); //using iterator
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.print(v.get(3));
		System.out.println();
		
		List<Integer> li = new ArrayList<>(); // for Array
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		
		System.out.println(li);  // using toString
		for(Integer val:li)
			System.out.print(val+" ");
		System.out.println();
		
		Iterator <Integer> itr1 = li.iterator(); //using iterator
		while(itr1.hasNext()) {
			System.out.print(itr1.next()+" ");
		}
		System.out.println();
		System.out.print(li.get(3));
	}

}
