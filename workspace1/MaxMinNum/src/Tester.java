import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int i;
		int [] a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five numbers");
		for(i=0;i<a.length;i++)
		a[i] = sc.nextInt();
		
		int max = a[0];
		int min = a[0];
		for(i=1;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Maximum value is:- " + max*5);
		for(i=1;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Minimum value is:- " + min*5/);

	}

}
