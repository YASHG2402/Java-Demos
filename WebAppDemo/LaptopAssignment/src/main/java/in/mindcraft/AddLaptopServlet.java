package in.mindcraft;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddLaptopServlet extends HttpServlet{

		public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, NumberFormatException{
			
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
				PreparedStatement pstmt = conn.prepareStatement("insert into Laptop values(?,?,?)");
				pstmt.setInt(1, a);
				pstmt.setString(2, b);
				pstmt.setDouble(3, c);
				boolean status = pstmt.execute();
				HttpSession session = req.getSession();
				session.setAttribute("lid", a);
				session.setAttribute("name", b);
				session.setAttribute("cost", c);
				res.sendRedirect("create.jsp");
				res.getWriter().println("Record inserted successfully");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
		
}
