
public class Tester {
	
	public static void fn1() throws InterruptedException {
		fn2();
	}
	public static void fn2() throws InterruptedException {
		System.out.println("fn2...");
		Thread.sleep(100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			fn1();
		} catch (Exception e) {  // here exception is super class of interrupted class
			e.printStackTrace();
		}
	}

}
