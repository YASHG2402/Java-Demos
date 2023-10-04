class Stack <G>{
	private int size;
	private int top;
	private G []arr;
	
	public Stack() {
		size=5;
		top=-1;
		arr=(G[])new Object[size];
	}
	public Stack(int s) {
		size=s;
		top=-1;
		arr=(G[])new Object[size];
	}
	public boolean isFull() {
		return top==size-1;	
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public void push(G val) throws Exception {
		if(!isFull())
			arr[++top]=val;
		else 
			throw new Exception("Overflow...");
	}
	public G pop() throws Exception {
		if(!isEmpty())
			return arr[top--];
		else 
			throw new Exception("Underflow...");
	}
	public void display() {
		for(int i=0;i<=top;i++)
			System.out.print(arr[i]+" ");
	}
}
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer>s1 = new Stack <>();
		try {
			s1.push(12);
			s1.push(14);
			s1.push(16);
			s1.push(12);
			s1.push(14);
			s1.pop();
			s1.display();
		} catch (Exception e) {
			System.out.println(e);;
		}
		System.out.println();
		Stack <String> s2 = new Stack <>();
		try {
			s2.push("apple");
			s2.push("mango");
			s2.push("orange");
			s2.push("guava");
			s2.push("watermelon");
			s2.pop();
			s2.display();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
