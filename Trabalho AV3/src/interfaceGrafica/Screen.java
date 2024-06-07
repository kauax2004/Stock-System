package interfaceGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import stock.Account;
import stock.Security;

@SuppressWarnings("serial")
public class Screen extends JFrame implements ActionListener,Security{
	
	JTextField emailBox;
	JPasswordField passwordBox;
	
	JFrame stockScreen;
	public Screen() {
		
		
		stockScreen = new JFrame();
		stockScreen.setVisible(true);
		stockScreen.setSize(1200,800);
		stockScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		stockScreen.setResizable(false);
		stockScreen.setLocationRelativeTo(null);
		stockScreen.setLayout(null);
		 	
	    //button SIGN UP
		JButton buttonUp = new JButton("SIGN UP");
		buttonUp.setBounds(510,420,100,30);
		buttonUp.setFont(new Font("Arial", Font.BOLD, 15));
		buttonUp.setForeground(new Color(255,250,250));
		buttonUp.setBackground(new Color(00,80,00));
		buttonUp.addActionListener(this);
		stockScreen.add(buttonUp);	 
		
		//button SIGN IN
		JButton buttonIn = new JButton("SIGN IN");
		buttonIn.setBounds(660,420,100,30);
		buttonIn.setFont(new Font("Arial", Font.BOLD, 15));
		buttonIn.setForeground(new Color(255,250,250));
		buttonIn.setBackground(new Color(00,80,00));
		buttonIn.addActionListener(this);
		stockScreen.add(buttonIn);
		
		//TEXTOEmail
		JLabel labelEmail = new JLabel("Email: ");	
		labelEmail.setBounds(380,250, 300,30);
		labelEmail.setFont(new Font("Arial", Font.BOLD, 22));
		stockScreen.add(labelEmail);
        
		//TEXTOsenha
		JLabel labelSenha = new JLabel("Senha: ");
        labelSenha.setBounds(380,350, 300,30);
        labelSenha.setFont(new Font("Arial", Font.BOLD, 22));
        stockScreen.add(labelSenha);
       
        //caixaEmail
        emailBox = new JTextField();
        emailBox.setBounds(490,250, 300,30);
        stockScreen.add(emailBox);
        
        //caixaSenha
        passwordBox = new JPasswordField();
        passwordBox.setBounds(490,350, 300,30);
        stockScreen.add(passwordBox);
         
	}
	
	@Override
	public boolean isPasswordValid(String password) {
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[A-Za-z0-9]{8,}$";
        return password.matches(regex);
	}

	@Override
	public boolean isEmailValid(String email) {
		return email.matches("(.*)@gmail.com");	
		}
	
	@Override
	public boolean isAccountValid(Account acc) {
		Scanner input = new Scanner(System.in);
		String filename = "DadosConta.txt";
		
		try {
			File f = new File(filename);
			input = new Scanner(f);
			while(input.hasNext()) {
				String email1 = input.next();
				String password1 = input.next();
				Account account = new Account(email1, password1);
				accounts.add(account);
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
		}
		if(accounts.contains(acc)) {
			return true;
		}
		return false;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(!isEmailValid(emailBox.getText())) {
			Error errorEmail = new Error();
			errorEmail.showEmailSignUpError(stockScreen);
		}
		if(!isPasswordValid(new String(passwordBox.getPassword()))) {
			Error errorPassword = new Error();
			errorPassword.showPasswordSignUpError(stockScreen);
		}
		else if(isAccountValid(new)) {
			Error accRegistered = new Error();
			accRegistered.AccountRegistered(stockScreen);
			openStockScreen();
		}
		else {
			new Account(emailBox.getText(),new String(passwordBox.getPassword()));
			Error error= new Error();
			error.AccountRegistered(stockScreen);
		}
	}

	private static void openStockScreen() {
		JFrame stockScreen = new JFrame("Stock");
		stockScreen.setVisible(true);
		stockScreen.setSize(1200,800);
		stockScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		stockScreen.setResizable(false);
		stockScreen.setLocationRelativeTo(null);
		stockScreen.setLayout(null);
	}
	
	
}