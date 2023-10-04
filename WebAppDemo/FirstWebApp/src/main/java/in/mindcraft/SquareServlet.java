package in.mindcraft;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/square")
public class SquareServlet extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		//int c = (int)req.getAttribute("c");
		
		//int c = Integer.parseInt(req.getParameter("c"));
		
		//HttpSession session = req.getSession();
		//int c = (int) session.getAttribute("c");
		
		Cookie [] cookies = req.getCookies();
		int c = 0;
		for(Cookie ck:cookies)
		{
			if(ck.getName().equals("c"))
			{
				c = Integer.parseInt(ck.getValue());
			}
		}
		
		int sq = c * c;
		HttpSession session = req.getSession();
		session.setAttribute("sq", sq);
		res.sendRedirect("result.jsp");
		
		//res.getWriter().println("Square of addition is: " + sq);
	}
}
