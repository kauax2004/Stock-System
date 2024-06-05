package company;

import stock.Stock;

public class Supplier extends Company {
	
	public Supplier(String name, String cnpj, String endereco, int quantityEmployee, String email, String password,
			Stock stock) {
		super(name, cnpj, endereco, quantityEmployee, email, password, stock);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
}