package company;

import stock.Account;
import stock.Stock;

public class Company {
	protected String name;
	private String cnpj;
	private String endereco;
	private int quantityEmployee;
	private Account account;
	
	public Company(String name, String cnpj, String endereco, int quantityEmployee, String email, String password,Stock stock) {
		this.name = name;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.quantityEmployee = quantityEmployee;
		//this.account = new Account(email, password, stock);
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", cnpj=" + cnpj + ", endereco=" + endereco + ", quantityEmployee="
				+ quantityEmployee + ", account=" + account + "]";
	}

	public String getName() {
		return name;
	}
	
	
}