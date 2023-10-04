class MyMath<G>{
	public void Swap(G a, G b) {
		G temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}
}
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath <Integer> m1 = new MyMath<>(); // <Integer> is a wrapper class 
		m1.Swap(10,20);
		MyMath <String> m2 = new MyMath<>(); // <String> is a wrapper class
		m2.Swap("Mindcraft","Infosys");
		
	}

}
