package sec01.exam07.pack02;

public class Account {

	private int balance;
	static int minBal=0;
	static int maxBal=1000000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
		if( balance<Account.minBal || balance>Account.maxBal) {
			return;
			
		}
	}
	
}
