package stock;

import java.util.ArrayList;


public class Stock {
	private ArrayList<Product> products;
	
	public Stock(ArrayList<Product> products) {
		super();
		products = new ArrayList<Product>();
	}

	public Stock() {
		// TODO Auto-generated constructor stub
	}

	public void addProducts(Product product) {
		products.add(product);
	}
	
	public void removeProducts(Product product) {
		products.remove(product);
	}
	
	public int quantityProducts() {
		return products.size();
	}

	public void changeInformationsProducts(Product product, String atribute, String name, String switchName, double switchValue, int switchStockQuatity, String switchSupplier) {
		for (int i = 0; i < products.size(); i++) {
			if(products.get(i).getName().equalsIgnoreCase(name)) {
				Product prod = (Product)products.get(i);
					if(atribute.equalsIgnoreCase("name")) {
						prod.setName(switchName);
					}
					if(atribute.equalsIgnoreCase("price")) {
						prod.setPrice(switchValue);
					}
					if(atribute.equalsIgnoreCase("stock quatity")) {
						prod.setStockQuantity(switchStockQuatity);
					}
					if(atribute.equalsIgnoreCase("supplier")){
						prod.setNameSupplier(switchSupplier);
					}
			}
		}
	}
}