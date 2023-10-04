package in.mindcraft;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		int a = Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));
		int c = a + b;
		
		//request.setAttribute("c", c);
		//System.out.println(c);
		//response.getWriter().println("Addition:- " + c);
		
		//RequestDispatcher rd = request.getRequestDispatcher("square");
		//rd.forward(request, response);
		
		//response.sendRedirect("square?c=" + c);  // url rewritting
		
		//HttpSession session = request.getSession();
		//session.setAttribute("c", c);
		//response.sendRedirect("square");
		
		Cookie cookie = new Cookie("c",c + "");
		response.addCookie(cookie);
		response.sendRedirect("square");
	}
}
