import java.sql.*;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id, name and cost");
		int lid=sc.nextInt();
		String name=sc.next();
		double cost=sc.nextDouble();
		
		
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","Pass@12345");
	PreparedStatement pstmt = conn.prepareStatement("insert into Laptop values(?,?,?)"); // to get input from user
	pstmt.setInt(1, lid);
	pstmt.setString(2, name);
	pstmt.setDouble(3, cost);
	boolean status = pstmt.execute();
	//Statement stmt = conn.createStatement(); // to add values from code
	//boolean status = stmt.execute("insert into Laptop values(104,'Apple',100000)");
	if(!status)
		System.out.println("Row inserted successfully");
//	ResultSet rset = stmt.executeQuery("select * from Laptop");
//	while(rset.next()) {
//		System.out.println(rset.getInt(1)+" "+rset.getString(2)+" "+rset.getDouble(3));
//	}
	conn.close();
	}

}
