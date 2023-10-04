package in.mindcraft;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/show")
public class ShowLaptop extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, NumberFormatException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/laptop","root","Pass@12345");
			PreparedStatement stmt = conn.prepareStatement("select * from laptop.laptop;");
			List<String>dataList = new ArrayList<>();
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				dataList.add(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
			}
			res.getWriter().println(dataList);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
