package company;

public class Supplier {
	private String name;
	private String cnpj;
	private String address;
	
	public Supplier(String name, String cnpj, String address) {
		super();
		this.name = name;
		this.cnpj = cnpj;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Supplier [name=" + name + ", cnpj=" + cnpj + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}