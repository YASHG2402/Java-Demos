import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int i;
		int j;
		int [][] a = new int[3][3];
		int [][] b = new int[3][3];
		int [][] c = new int[3][3];
		System.out.println("Enter elements for array A: ");
		Scanner sc = new Scanner(System.in);
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) 
			{
				a[i][j] = sc.nextInt();
			}
		}
		for(int []temp:a) {
			for(int val:temp) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				b[j][i] = a[i][j];
			}
		}
		System.out.println("Transpose:- ");
		for(int []temp:b) {
			for(int val:temp) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("Addition of matrix: ");
		for(int []temp:c) {
			for(int val:temp) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

}
