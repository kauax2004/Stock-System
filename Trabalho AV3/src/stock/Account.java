package stock;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class Account {
	private String email;
	private String password;
	private Stock stock;
	
	public Account(String email, String password) {
		
		this.email = email;
		this.password = password;
		this.stock = new Stock();
		
		String filename = "DadosConta.txt";                     
		
		File f = new File(filename);                    
		try {
			FileWriter fw = new FileWriter(f,true);
			fw.write(email + " " + password + "\n");
			fw.close();
		}
		catch(IOException e){
			System.out.println("Erro de leitura/escrita.");
		}
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Stock getStock() {
		return stock;
	}
	
	@Override
	public String toString() {
		return "Account [email=" + email + ", password=" + password + ", stock=" + stock + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, password, stock);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(email, other.email) && Objects.equals(password, other.password)
				&& Objects.equals(stock, other.stock);
	}
	
	
}