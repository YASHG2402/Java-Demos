import java.awt.*;

class MovingCircle extends Frame implements Runnable {
	private Thread t1,t2,t3;
	private int x1,x2,x3;
	
	public MovingCircle() {
		x1=x2=x3=100;
		t1=new Thread(this, "t1");
		t2=new Thread(this, "t2");
		t3=new Thread(this, "t3");
		t1.start();
		t2.start();
		t3.start();
				
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(x1, 100, 100, 100);
		g.setColor(Color.BLUE);
		g.fillOval(x2, 250, 100, 100);
		g.setColor(Color.GREEN);
		g.fillOval(x3, 400, 100, 100);
	}

	@Override
	public void run() {
		while(true) {
				if(Thread.currentThread()==t1) {
					synchronized(this) {
						x1++;
						if(x1==this.getWidth()-100) {
							try {
								wait();
							}catch (InterruptedException e) {}
						}
					}	
				try {
					Thread.sleep(30);
				}catch (Exception e) {
					
				}
			}
			else if(Thread.currentThread()==t2) {
				synchronized(this) {
					x2++;
					if(x2==this.getWidth()-100) {
						try {
							wait();
						}catch (InterruptedException e) {}
					}
				}
				try {
					Thread.sleep(60);
				}catch (Exception e) {
					
				}
			}
			else if(Thread.currentThread()==t3) {
				synchronized(this) {
					x3++;
					if(x3==this.getWidth()-100) {
						x1=x2=x3=0;
						notifyAll();
					}
				}
				try {
					Thread.sleep(90);
				}catch (Exception e) {
					
				}
			}
			repaint();
		}
	}
}
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovingCircle mc = new MovingCircle();
		mc.setSize(500,500);
		mc.setVisible(true);
	}

}
