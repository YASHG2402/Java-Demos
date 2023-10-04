import java.util.*;

class thread1 implements Runnable {
	private int num;
	private Thread t1, t2;
	
	public thread1(int num) {
		this.num=num;
		t1=new Thread(this,"first");
		t2=new Thread(this,"second");
		t1.start();
		t2.start();
	}
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			if(Thread.currentThread()==t1)
				System.out.println("Incremented value: " + (num+i));
			else if(Thread.currentThread()==t2)
				System.out.println("Table value: " + (num*i));
		}
	}
	
}
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=sc.nextInt();
		thread1 t = new thread1(num);
	}

}
