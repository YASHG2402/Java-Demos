package in.mindcraft;

public class studentDetails {
	private int rollNum;
	private String name;
	private double ctc;
	private static int showcnt;
	
	public studentDetails() {
		rollNum = 101;
		name = "Yash";
		ctc = 500000;
		showcnt++;
	}
	public studentDetails(int rollNum, String name, double ctc) {
		this.rollNum = rollNum;
		this.name = name;
		this.ctc = ctc;
		showcnt++;
	}
	
	public void show() {
		System.out.println(rollNum + " " + name + " " + ctc);
	}
	
	public static void showcnt() {
		System.out.println("Number of objects: " + showcnt);
	}
}
