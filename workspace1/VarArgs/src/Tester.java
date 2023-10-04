
public class Tester {
	
	public static String add(String s,int ...a) {
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum = sum + a[i];
		return s+sum;
	}
	public static void main(String[] args) {
		System.out.println(add("Addition: ", 1,2,3,4,5,6));
		}

}
