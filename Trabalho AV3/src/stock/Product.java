package stock;

import java.util.Objects;

import company.Supplier;

public class Product {
	private String name;
	private String id;
	private double price;
	private int stockQuantity;
	private Supplier supplier;
	
	public Product(String name, String id, double price, int stockQuantity, Supplier supplier) {
		this.name = name;
		this.id = id;
		this.price = price;
		this.stockQuantity = stockQuantity;
		this.supplier = supplier;
	}
	
	public double priceValue(String demand, String competition , String receiptOfValue, double inflation) {
		double value = 0;
		if(demand.equalsIgnoreCase("alto") && competition.equalsIgnoreCase("alto") && receiptOfValue.equalsIgnoreCase("alto") && inflation > 0) {
			value = (price*0.3)*(inflation/100);
			return value;
		}
		if(demand.equalsIgnoreCase("media") && competition.equalsIgnoreCase("alto") && receiptOfValue.equalsIgnoreCase("alto") && inflation > 0) {
			value = (price*0.3)*(inflation/100);
			return value;
		}
		if(demand.equalsIgnoreCase("baixa") && competition.equalsIgnoreCase("alto") && receiptOfValue.equalsIgnoreCase("alto") && inflation > 0) {
			value = (price*0.3)*(inflation/100);
			return value;
		}
		if(demand.equalsIgnoreCase("baixa") && competition.equalsIgnoreCase("alto") && receiptOfValue.equalsIgnoreCase("alto") && inflation > 0) {
			value = (price*0.3)*(inflation/100);
			return value;
		}
		if(demand.equalsIgnoreCase("alto") && competition.equalsIgnoreCase("medio") && receiptOfValue.equalsIgnoreCase("alto") && inflation > 0) {
			value = (price*0.3)*(inflation/100);
			return value;
		}
		return 0;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public void setNameSupplier(String switchSupplier) {
		supplier.setName(switchSupplier);
	}
	
	public void entryStock(int entry) {
		stockQuantity += entry;
	}
	
	public void exitStock(int exit) {
		stockQuantity -= exit;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", price=" + price + ", stockQuantity=" + stockQuantity
				+ ", provider=" + supplier + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, price, supplier, stockQuantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(supplier, other.supplier) && stockQuantity == other.stockQuantity;
	}
	
}