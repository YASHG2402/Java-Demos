// Array is a collection of similar types
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		int i;
		int [] a = new int[] {1,2,3,4,5}; // initialized array
		int [] b = {1,2,3,4,5}; // initialized array
		float [] c = new float[5]; // uninitialized array



        Scanner sc = new Scanner(System.in);
		System.out.println("Enter five floats:");
		for(i=0;i<c.length;i++)
			c[i] = sc.nextFloat();
		for(i=0;i<c.length;i++)
			System.out.println(c[i]+" ");
		for(float val:c) // for-each read only loop
			System.out.println(val+" ");
	
	}

}
