package configuration;

import java.util.ArrayList;
import stock.Account;

public class AccountData {
	private ArrayList<Account> accounts = new ArrayList<Account>();

	 public AccountData(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	
	public void addAccounts(Account account) {
		accounts.add(account);
	}
}