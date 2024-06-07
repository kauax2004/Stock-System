package company;

import stock.Account;
import stock.Stock;

public class Company {
	protected String name;
	protected String cnpj;
	protected String endereco;
	private int quantityEmployee;
	private Account account;
	
	public Company(String name, String cnpj, String endereco, int quantityEmployee, String email, String password,Stock stock) {
		this.name = name;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.quantityEmployee = quantityEmployee;
		this.account = new Account(email, password);
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", cnpj=" + cnpj + ", endereco=" + endereco + ", quantityEmployee="
				+ quantityEmployee + ", account=" + account + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getQuantityEmployee() {
		return quantityEmployee;
	}

	public void setQuantityEmployee(int quantityEmployee) {
		this.quantityEmployee = quantityEmployee;
	}
	
	
}