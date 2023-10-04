package in.mindcraft;

import java.sql.Connection;
import java.util.*;
import java.io.IOException;
import java.sql.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowController {

	@RequestMapping("/show")
	public void show(HttpServletRequest req, HttpServletResponse res) throws IOException, ClassNotFoundException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/laptop","root","Pass@12345");
			PreparedStatement stmt = conn.prepareStatement("select * from laptop.laptop1;");
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


