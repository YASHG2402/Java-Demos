package in.mindcraft.controllers;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import in.mindcraft.dao.LaptopDao;
import in.mindcraft.pojos.Laptop;

@Controller
public class LaptopController {
	
	private LaptopDao laptopDao = new LaptopDao(); 

	@RequestMapping("/insertLap")
	public void addLaptop(HttpServletRequest req, HttpServletResponse res) throws SQLException {
		int lid = Integer.parseInt(req.getParameter("lid"));
		String name = req.getParameter("name");
		double cost = Double.parseDouble(req.getParameter("cost"));
		
		Laptop laptop = new Laptop(lid,name,cost);
		
		laptopDao.addLaptop(laptop);	
	}
}
	