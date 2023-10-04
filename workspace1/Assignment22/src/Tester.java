import java.awt.*;
class Circle extends Frame implements Runnable{
	private Thread t1;
	private int x;
	
	public Circle() {
		x=200;
		t1=new Thread(this, "t1");
		t1.start();
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillOval(x,200,100,100);
	}

	@Override
	public void run() {
		int flag=0;
		while(true) 
		{
			if(Thread.currentThread()==t1)
			{
				if(flag==0)
					x++;
				else if(flag==1)
					x--;
				if(x==this.getWidth()-100)
					flag=1;
				if(x==0)
					flag=0;
				try {
					Thread.sleep(10);
				}catch (Exception e) {
					
				}
			}
			repaint();
		}
		
	}
}
public class Tester {

	public static void main(String[] args) {
		Circle m = new Circle();
		m.setSize(500,500);
		m.setVisible(true);

	}

}
