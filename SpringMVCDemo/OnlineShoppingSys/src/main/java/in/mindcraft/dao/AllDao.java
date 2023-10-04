package in.mindcraft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.mindcraft.pojos.Customer;
import in.mindcraft.pojos.Product;
import in.mindcraft.pojos.Cart;
import in.mindcraft.utils.DBUtils;

public class AllDao {

	private Connection cn;
	private PreparedStatement pst1;
	private PreparedStatement pst2;
	private PreparedStatement pst3;
	private PreparedStatement pst4;
	private PreparedStatement psmt1;
	private PreparedStatement psmt2;
	private PreparedStatement psmt3;
	private PreparedStatement psmt4;
	private PreparedStatement psmt5;
	private PreparedStatement psmt6;
	private PreparedStatement psmt7;
	private PreparedStatement psmt8;
	
	public void addProduct(Product product) throws SQLException {
		cn = DBUtils.openConnection();
		pst1 = cn.prepareStatement("insert into product values(?,?,?,?,?)");
		pst1.setInt(1, product.getProductNo());
		pst1.setString(2, product.getProductName());
		pst1.setInt(3, product.getProductPrice());
		pst1.setInt(4, product.getQuantity());
		pst1.setFloat(5, product.getDiscount());
		pst1.execute();
		cn.close();
		DBUtils.closeConnection();
	}
	
	public List<Product> showProducts() throws SQLException{
		cn=DBUtils.openConnection();
		List<Product> products = new ArrayList<>();
		pst2 = cn.prepareStatement("select * from product");
		ResultSet rset = pst2.executeQuery();
		while(rset.next()) {
			products.add(new Product(rset.getInt(1),rset.getString(2),rset.getInt(3),rset.getInt(4),rset.getFloat(5)));
		}
		System.out.println("Runnning");
		DBUtils.closeConnection();
		return products;
	}
	
	public void addCustomer(Customer customer) throws SQLException {
		cn = DBUtils.openConnection();
		pst1 = cn.prepareStatement("insert into customer values(?,?,?)");
		pst1.setInt(1, customer.getId());
		pst1.setString(2, customer.getPassword());
		pst1.setDouble(3, customer.getBalance());
		pst1.execute();
		cn.close();
		DBUtils.closeConnection();
	}
	
	public void removeCustomer(int id) throws ClassNotFoundException, SQLException {
		cn = DBUtils.openConnection();
		
		pst3 = cn.prepareStatement("DELETE FROM customer WHERE id = ?");
		
		pst3.setInt(1, id);
		
		pst3.execute();

		DBUtils.closeConnection();
	}
	public boolean checkCustomer(String password) throws ClassNotFoundException, SQLException {
		boolean b = false;
		
		cn = DBUtils.openConnection();
		
		pst4 = cn.prepareStatement("select * from customer where id = ?");
		
		pst4.setString(1, password);
		
		ResultSet resultSet = pst4.executeQuery();
        b = resultSet.next();
        
		DBUtils.closeConnection();

        return b;
	}
		
		public double calculateSum(List<Double> numbers) {
	        return numbers.stream().mapToDouble(Double::doubleValue).sum();
	    }
		
		public void addItems(String username, int pid, String product_name, double product_cost,int quantity ,double discount,String invoiced) throws ClassNotFoundException, SQLException {
			
			cn = DBUtils.openConnection();
			
			psmt1 = cn.prepareStatement("Insert into cart values(?,?,?,?,?,?,?)");
			psmt1.setString(1, username);
			psmt1.setInt(2, pid);
			psmt1.setString(3, product_name);
			psmt1.setDouble(4, product_cost);
			psmt1.setInt(5, quantity);
			psmt1.setDouble(6, discount);
			psmt1.setString(7, invoiced);
			psmt1.execute();
			
			psmt2 = cn.prepareStatement("Update product set quantity = quantity - 1 where pid = ?"); 
			psmt2.setInt(1, pid);
			psmt2.execute();	
			
			psmt7 = cn.prepareStatement("select quantity from product where pid = ?");
			psmt7.setInt(1, pid);
			ResultSet rst =  psmt7.executeQuery();

			while(rst.next()) {
				int quants = rst.getInt(1);
				System.out.println("the items are over!!!");
				if(quants < 1) {
					psmt8 = cn.prepareStatement("delete from product where pid = ?");
					psmt8.setInt(1, pid);
					psmt8.execute();
				}
			}
			
			DBUtils.closeConnection();
		}
		
		public List<Cart> showCart(String username) throws ClassNotFoundException, SQLException {
			cn = DBUtils.openConnection();
			
			List<Cart> cart_list = new ArrayList<>();
			
			psmt2 = cn.prepareStatement("select * from cart where cid = ? and invoiced = 'No'");
			
			psmt2.setString(1, username);
			
			ResultSet rst = psmt2.executeQuery();
			
			while(rst.next()) {
				cart_list.add(new Cart(rst.getString(1), rst.getInt(2), rst.getString(3), rst.getDouble(4),rst.getInt(5), rst.getDouble(6), rst.getString(7)));
			}
			
			DBUtils.closeConnection();
			
			return cart_list;
		}

		public List<Cart> purchased(String username) throws ClassNotFoundException, SQLException {
			cn = DBUtils.openConnection();
			
			List<Cart> cart_list = new ArrayList<>();
			
			psmt2 = cn.prepareStatement("select * from cart where cid = ? and invoiced = 'Yes'");
			
			psmt2.setString(1, username);
			
			ResultSet rst = psmt2.executeQuery();
			
			while(rst.next()) {
				cart_list.add(new Cart(rst.getString(1), rst.getInt(2), rst.getString(3), rst.getDouble(4),rst.getInt(5), rst.getDouble(6), rst.getString(7)));
			}
			
			DBUtils.closeConnection();
			
			return cart_list;
		}

		
		public List<Cart> billPay(String username) throws ClassNotFoundException, SQLException {
			cn = DBUtils.openConnection();
			
			List<Cart> cart_list = new ArrayList<>();
			
//			List<Double> discountAmount = new ArrayList<>();
			
			psmt3 = cn.prepareStatement("select * from cart where cid = ? and invoiced = 'No'");
			
			psmt3.setString(1, username);
			
			ResultSet rst = psmt3.executeQuery();
			
			while(rst.next()) {

				cart_list.add(new Cart(rst.getString(1), rst.getInt(2), rst.getString(3), rst.getDouble(4),rst.getInt(5), rst.getDouble(6), rst.getString(7)));
			}
			
			DBUtils.closeConnection();
			
			return cart_list;
		}
		
		public double billPay1(String username) throws ClassNotFoundException, SQLException {
			cn = DBUtils.openConnection();
				
			List<Double> actual_Amount = new ArrayList<>();
			
			double sum = 0;
			psmt4 = cn.prepareStatement("select * from cart  where cid = ? and invoiced = 'No'");
			psmt4.setString(1, username);
			
			ResultSet rst = psmt4.executeQuery();
			
			while(rst.next()) {
				double actualAmt = rst.getDouble(4);
				actual_Amount.add((double) actualAmt);
				sum = calculateSum(actual_Amount);
				System.out.println("List is" +actual_Amount);
			}
			
			DBUtils.closeConnection();
			
			return sum;
		}
		
		public double billPay2(String username) throws ClassNotFoundException, SQLException {
			cn = DBUtils.openConnection();
				
			List<Double> discount_Amount = new ArrayList<>();
			
			double sum = 0;
			psmt5 = cn.prepareStatement("select * from cart  where cid = ? and invoiced = 'No'");
			psmt5.setString(1, username);

			ResultSet rst = psmt5.executeQuery();
			
			while(rst.next()) {
				double discountAmt = (rst.getDouble(6) / 100) * rst.getDouble(4);
				double actualAmt = rst.getDouble(4);
				double finalAmt = actualAmt - discountAmt;
				discount_Amount.add((double) finalAmt);
				sum = calculateSum(discount_Amount);
				System.out.println("List is" +discount_Amount);
			}
			
			DBUtils.closeConnection();
			
			return sum;
		}
		
		public double billPay3(String username) throws ClassNotFoundException, SQLException {
			cn = DBUtils.openConnection();
				
			List<Double> saved_Amount = new ArrayList<>();
			
			double sum = 0;
			psmt6 = cn.prepareStatement("select * from cart  where cid = ? and invoiced = 'No'");
			psmt6.setString(1, username);

			ResultSet rst = psmt6.executeQuery();
			
			while(rst.next()) {
				double discountAmt = (rst.getDouble(6) / 100) * rst.getDouble(4);
				saved_Amount.add((double) discountAmt);
				sum = calculateSum(saved_Amount);
				System.out.println("List is" +saved_Amount);
			}
			
			DBUtils.closeConnection();
			
			return sum;
		}
		
		
	}


