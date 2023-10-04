package in.mindcraft.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.mindcraft.dao.AllDao;
import in.mindcraft.pojos.Customer;
import in.mindcraft.pojos.Product;

@Controller
public class AllController {
	
	private AllDao productDao = new AllDao();
	private AllDao customerDao = new AllDao();
	private AllDao cartDao = new AllDao();
	
	@RequestMapping("/customer")
	public ModelAndView customerLogin() {
		ModelAndView mv = new ModelAndView(); 
		mv.setViewName("customer.jsp");
		return mv;
	}	
	
	@RequestMapping("/admin")
	public ModelAndView adminLogin() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin.jsp");
		return mv;
	}
	
	@RequestMapping("product")
	public ModelAndView admin(HttpServletRequest req, HttpServletResponse res) {
		int id = 101;
		String pass = "pass";
		int paramId=Integer.parseInt(req.getParameter("id"));
		String paramPass = req.getParameter("password");
		if(id==paramId && pass.equals(paramPass)) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("option.jsp");
			return mv;
		}else {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("admin.jsp");
			return mv;
		}
		
	}
	
	@RequestMapping("/add")
	public void addProduct(HttpServletRequest req, HttpServletResponse res) throws SQLException {
		int a = Integer.parseInt(req.getParameter("id"));
		String b = req.getParameter("name");
		int c = Integer.parseInt(req.getParameter("price"));
		int d = Integer.parseInt(req.getParameter("quantity"));
		float e = Float.parseFloat(req.getParameter("discount"));
		
		Product product = new Product(a,b,c,d,e);
		productDao.addProduct(product);
	}
	
	@RequestMapping("/addCus")
	public ModelAndView customer() {
		ModelAndView mv = new ModelAndView(); 
		mv.setViewName("customer.jsp");
		return mv;
	} 
	
	@RequestMapping("/cart")
	public void addCustomer(HttpServletRequest req, HttpServletResponse res) throws SQLException {
		int a = Integer.parseInt(req.getParameter("id"));
		String b = req.getParameter("password");
		Double c = Double.parseDouble(req.getParameter("balance"));
		
		Customer cust = new Customer(a,b,c);
		customerDao.addCustomer(cust);
	}
	
	@RequestMapping("/showproducts")
	public ModelAndView showProduct() throws SQLException {
		ModelAndView mv = new ModelAndView();
		List<Product> list = productDao.showProducts();
		mv.setViewName("showProducts.jsp");
		mv.addObject("list", list);
		System.out.println("Displaying All Products....");
		return mv;
	}
	@RequestMapping("/removecustomer")
	public ModelAndView rCustomers() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("deleteCustomer.jsp");
		System.out.println("Deleting Customers...");
		return mv;
	}
	
	@RequestMapping("/deletecustomer")
	public ModelAndView removeCustomer(HttpServletRequest req, HttpServletResponse res) throws ClassNotFoundException, SQLException, IOException {
		ModelAndView mv = new ModelAndView();
		
		int cid = Integer.parseInt(req.getParameter("id"));
		
		customerDao.removeCustomer(cid);

		
		mv.setViewName("result.jsp");
		res.setContentType("text/html"); // Set the content type PrintWriter out
		
		PrintWriter out  = res.getWriter(); // Get the response writer
		  
		out.println("<script>"); 
		out.println("setTimeout(function() {");
		out.println("    window.location.href = 'admin.jsp';"); // Redirect to the
		out.println("}, 3000);"); // 3-second delay, adjust
		out.println("</script>");
		  
		out.println("<p>Deleted Successfully!!!</p>"); 
		
		out.close();
		  
		 
		return mv;
	}
	
	public boolean checkcustomer(String password) throws ClassNotFoundException, SQLException {
		System.out.println(customerDao.checkCustomer(password));
		System.out.println(password);
		boolean c = customerDao.checkCustomer(password);
		return c;
	}
	
	@RequestMapping("/cart")
	public ModelAndView addtoCart() throws ClassNotFoundException, SQLException {
		ModelAndView mv = new ModelAndView();
		List<Product> list = productDao.showProducts();
		
		mv.setViewName("addCart.jsp");
		
		mv.addObject("list",list);
		
		return mv;
	}
	@RequestMapping("/addItems")
	public ModelAndView addItems(HttpServletRequest request, HttpServletResponse response, @RequestParam("pid") int pid, @RequestParam("name") String name, @RequestParam("cost") double cost, @RequestParam("discount") double discount) throws ClassNotFoundException, SQLException, InterruptedException, IOException {
		ModelAndView mv = new ModelAndView();
//		List<Product> list = productdao.showProduct();
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");

		String invoiced = "No";
		int quantity = 1;
		cartDao.addItems(username, pid, name, cost, quantity, discount, invoiced);
				
		mv.setViewName("result.jsp");

		response.setContentType("text/html"); // Set the content type
		PrintWriter out = response.getWriter(); // Get the response writer

		out.println("<script>");
		out.println("setTimeout(function() {");
		out.println("    window.location.href = 'http://localhost:8080/ShoppingApp/addtoCart';"); // Redirect to the next page after a delay
		out.println("}, 3000);"); // 3-second delay, adjust as needed
		out.println("</script>");

		out.println("<p>Item Inserted within Cart!!!</p>");
		out.close();

		return mv;
		
	}
}

