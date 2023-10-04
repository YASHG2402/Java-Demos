class FirstThread extends Thread {
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("Hello....");
			try {
				Thread.sleep(30);
			}catch (Exception e) {
				
			}
		}
	}
}
class SecondThread extends Thread {
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("Hi....");
			try {
				Thread.sleep(40);
			}catch (Exception e) {
				
			}
		}
	}
}
public class Tester {

	public static void main(String[] args) {
		FirstThread ft = new FirstThread();
		SecondThread st = new SecondThread();
		ft.start();
		st.start();

	}

}
