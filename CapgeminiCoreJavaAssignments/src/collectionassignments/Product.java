package collectionassignments;

public class Product {

	String productName;
	String productType;

	public Product(String productName, String productType) {
		super();
		this.productName = productName;
		this.productType = productType;
	}

	public Product() {
		super();
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productType=" + productType + "]";
	}
	
	

}
