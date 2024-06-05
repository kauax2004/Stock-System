package stock;

public interface Security {
	boolean isPasswordValid(String password);
	boolean isEmailValid(String email);
	boolean isAccountValid(String email, String password);
}