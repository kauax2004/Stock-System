package stock;

public interface Security {
	boolean isPasswordValid(String password);
	boolean isEmailValid(String email);
	//boolean isAccountValid(Account acc, ArrayList<Account> accounts);
}