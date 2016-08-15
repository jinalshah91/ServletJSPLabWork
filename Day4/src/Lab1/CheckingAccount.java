package Lab1;

public class CheckingAccount extends Account {

	private long authOverdraftAmount;

	public CheckingAccount(String holderName, long authOverdraftAmount) {
		super(holderName);
		this.authOverdraftAmount = authOverdraftAmount;
	}

	@Override
	public boolean deposit(long amount) {
		super.executeTransaction("Checking Deposit", amount);
		return true;
	}

	@Override
	public boolean withdraw(long amount) {
		long availableBal = super.getBalance() - amount;
		if (availableBal > authOverdraftAmount) {
			super.executeTransaction("Checking Withdrawal", (-1 * amount));
			return true;
		} else {
			System.out.println("Insufficiant funds");
			return false;
		}
	}

}