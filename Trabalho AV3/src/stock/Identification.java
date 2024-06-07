package stock;

public class Identification {
	
	public Identification() {
		
	}
	
	public boolean passwor(String text) {
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[A-Za-z0-9]{8,}$";
        return text.matches(regex);
	}
}
