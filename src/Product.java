
public class Product {

	private long productId;
	private String productName;
	private double productPrice;
	public Product(long productId, String productName,
			double productPrice) {
		
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public long getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getProductPrice() {
		return productPrice;
	}

	
	
	
}
