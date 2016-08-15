package Lab1;

public abstract class Account {

	private long balance;
	private String holderName;

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public Account() {
	}

	public Account(String holderName) {
		this.holderName = holderName;
	}

	public final void executeTransaction(String message, long amount) {
		System.out.println(
				"Holder: " + holderName + " is performing following operation: \n" + message + " on Amount: " + amount);
		long balance = this.balance + amount;
		this.balance = balance;
	}

	public long getBalance() {
		return this.balance;
	}

	public abstract boolean deposit(long amount);

	public abstract boolean withdraw(long amount);

}