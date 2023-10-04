package in.mindcraft.pojos;

public class Product {

	private int productNo;
	private String productName;
	private int productPrice;
	private int quantity;
	private float discount;
	
	public Product() {
		super();
	}
	
	public Product(int productNo, String productName, int productPrice, int quantity, float discount)
	{
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.productPrice = productPrice;
		this.quantity = quantity;
		this.discount = discount;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", quantity=" + quantity + ", discount=" + discount + "]";
	}
	
	
}
