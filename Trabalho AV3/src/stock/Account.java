package stock;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Account implements Security {
	private String email;
	private String password;
	private Stock stock;
	
	public Account(String email, String password) {
		while(!isEmailValid(email) && !isPasswordValid(password)){
		this.email = email;
			if(!isPasswordValid(password)) {
				throw new IllegalArgumentException("A sua senha contém caracteres especiais, redigite"); 
			}
			if(!isEmailValid(email)) {
				throw new IllegalArgumentException("O seu email está digitado no formato errado, redigite");
			}
			this.email = email;
			this.password = password;
		}
			
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
	public boolean isPasswordValid(String password) {
		return password.matches("[a-zA-Z0-9]");
	}

	@Override
	public boolean isEmailValid(String email) {
		return email.matches("(.*)@gmail.com");	
		}

	@Override
	public boolean isAccountValid(String email, String password) {
		return false;
	}

	
}