package in.mindcraft;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
		
		@RequestMapping("/add")
		public ModelAndView add(HttpServletRequest req, HttpServletResponse res) {
			System.out.println("add is called...");
			int a = Integer.parseInt(req.getParameter("num1"));
			int b = Integer.parseInt(req.getParameter("num2"));
			int c = a + b;
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("result.jsp");	
			mv.addObject("c", c);
			return mv;
		}
}

