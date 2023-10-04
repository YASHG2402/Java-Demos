package in.mindcraft;

import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {

	@RequestMapping("/add")
	public void add(HttpServletRequest req, HttpServletResponse res) throws SQLException, NumberFormatException {
		int a = Integer.parseInt(req.getParameter("id"));
		String b = req.getParameter("name");
		int c = Integer.parseInt(req.getParameter("cost"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/laptop","root","Pass@12345");
			PreparedStatement pstmt = conn.prepareStatement("insert into laptop1 values(?,?,?)");
			pstmt.setInt(1, a);
			pstmt.setString(2, b);
			pstmt.setInt(3, c);
			boolean status = pstmt.execute();
			conn.close();
			pstmt.close();
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
}
