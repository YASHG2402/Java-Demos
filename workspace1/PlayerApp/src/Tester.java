interface printable {
	public void printDetails();
}

class CktPlayer implements printable {
	private String name;
	private int runs;
	
	public CktPlayer() {
		name = "Rohit Sharma";
		runs = 10000;
	}
	public CktPlayer(String n, int r) {
		name = n;
		runs = r;
	}
	public void printDetails() {
		System.out.println(name +" has scored " + runs + " runs");
	}
}

class FtPlayer implements printable {
	private String name;
	private int goals;
	
	public FtPlayer() {
		name = "Messi";
		goals = 100;
	}
	public FtPlayer(String n, int g) {
		name = n;
		goals = g;
	}
	public void printDetails() {
		System.out.println(name +" has scored " + goals + " goals");
	}
}




public class Tester {

	public static void main(String[] args) {
		printable p1 = new CktPlayer("Virat Kohli", 15000);
		p1.printDetails();
		System.out.println();
		FtPlayer f1 = new FtPlayer("Cristiano Ronaldo",110);
		f1.printDetails();

	}

}
