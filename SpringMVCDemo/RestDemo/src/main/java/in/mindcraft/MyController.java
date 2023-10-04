package in.mindcraft;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	private List<Product> list = new ArrayList<>();
	
	public MyController() {
		list.add(new Product(101,"Marker",50));
		list.add(new Product(102,"Pen",20));
		list.add(new Product(103,"Bottle",70));
	}
	
	@RequestMapping(value="products", method=RequestMethod.GET)
	public List<Product> getProducts() {
		System.out.println("get all products...");
		return list;
	}
	
	@RequestMapping(value="products/{id}", method=RequestMethod.GET)
	public Product getProduct(@PathVariable int id) {
		for(Product p:list) {
			if(p.getPid()==id) {
				return p;
			}
		}
		return null;
	}
	
	@RequestMapping(value="products", method=RequestMethod.POST)
	public List<Product> addProducts(@RequestBody Product p) {
		list.add(p);
		return list;
	}
	
	@RequestMapping(value="products/{id}", method=RequestMethod.PUT)
	public List<Product> updateProduct(@PathVariable int id,@RequestBody Product p) {
		for(Product p1:list) {
			if(p1.getPid()==id) {
				String name =p1.setName("maggi");
			}
		}
		return list;
	}
	
	@RequestMapping(value="products/{id}", method=RequestMethod.DELETE)
	public List<Product> deleteProduct(@PathVariable int id) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getPid()==id) {
				list.remove(i);
			}
		}
		return list;
	}
}
