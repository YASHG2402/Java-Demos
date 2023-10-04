import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println(a + " " + b);

	}

}
