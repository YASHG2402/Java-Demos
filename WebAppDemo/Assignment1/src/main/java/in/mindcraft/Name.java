package in.mindcraft;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Name extends HttpServlet{

		public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
		{
			String a = request.getParameter("name");
			
			response.getWriter().println("Welcome " + a);
		}
}
