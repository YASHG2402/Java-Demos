import java.util.*;

class Student {
	private int rollNo;
	private String name;
	private double percentage;
	private Set<String> skillset;
	
	public Student() {
		rollNo = 0;
		name = "";
		percentage = 0;
		skillset = null;
	}
	public Student(int rollNo, String name, double percentage, Set<String> skillset)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
		this.skillset =  skillset;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public Set<String> getSkillset() {
		return skillset;
	}
	public void setSkillset(Set<String> skillset) {
		this.skillset = skillset;
	}
}
class UtilityList {
	private List<Student> list;
	
	public UtilityList() {
		list = new ArrayList<>();
	}
	public void CreateList() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roll no: ");
		int rollNo = sc.nextInt();
		System.out.println("Enter name of Student: ");
		String name = sc.next();
		System.out.println("Enter percentage of student: ");
		double percentage = sc.nextDouble();
		System.out.println("Enter the skillset of students: ");
		String skillset = sc.next();
	}
	public void PrintList(int rollNo, String name, double percentage, String skillset) {
		System.out.println("Roll no: " + rollNo);
		System.out.println("Name of Student: " + name);
		System.out.println("Percentage: : " + percentage);
		System.out.println("Skillset: " + skillset);
	}
}
public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> li = new ArrayList<>();
		int choice = sc.nextInt();
		while(true) {
			System.out.println("1.Insert a record");
			System.out.println("2.Display the record");
		}

	}

}
