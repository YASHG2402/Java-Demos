class Mythread implements Runnable{
	
	private Thread t1, t2;
	
	public Mythread() {
		t1=new Thread(this,"first");
		t2=new Thread(this,"second");
		t1.start();
		t2.start();
		
	}
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			if(Thread.currentThread()==t1)
				System.out.println("Hello");
			else if(Thread.currentThread()==t2)
				System.out.println("Hi");
		}
		
	}
	
}
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Mythread();
	}

}
