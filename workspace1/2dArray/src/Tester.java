import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int i;
		int j;
		int [][] a = {{1,2,3},{4,5,6},{7,8,9}}; // initialized array
		int [][] b = {{1,2,3,4},{5,6},{7,8,9}}; // jagged array
		int [][] c = new int[3][4]; // uninitialized array with 3 rows and 4 columns
		int [][] d = new int[3][];
		d[0] = new int[4];
		d[1] = new int[2];
		d[2] = new int[3];
		System.out.println("Enter elements for array d: ");
		Scanner sc = new Scanner(System.in);
		for(i=0;i<d.length;i++) {
			for(j=0;j<d[i].length;j++)
			{
				d[i][j] = sc.nextInt();
			}
		}
		for(int []temp:d) {
			for(int val:temp) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

}
