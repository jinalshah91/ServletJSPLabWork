package Lab2;

public class Account {
	private ApplyFeesStrategy appFees = null;
	private GrantWithdrawalStrategy grantWith = null;
	private double balance = 0;
	private int freqTransaction = 0;
	private double amt = 0;
	private double overdarft = 0;
	private int days = 0;

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getFreqTransaction() {
		return freqTransaction;
	}

	public void setFreqTransaction(int freqTransaction) {
		this.freqTransaction = freqTransaction;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

	public double getOverdarft() {
		return overdarft;
	}

	public void setOverdarft(double overdarft) {
		this.overdarft = overdarft;
	}

	Account(double balance, GrantWithdrawalStrategy grantWith, ApplyFeesStrategy appFees, int freqTransaction,
			double amt, double overdarft, int days) {
		this.balance = balance;
		this.grantWith = grantWith;
		this.appFees = appFees;
		this.freqTransaction = freqTransaction;
		this.amt = amt;
		this.overdarft = overdarft;
		this.days = days;
	}

	public void deposit(double amt) {
		System.out.println("Balance before deposite " + getBalance());
		setBalance(getBalance() + amt);
		System.out.println("Balance after deposite " + getBalance());

	}

	public ApplyFeesStrategy getAppFees() {
		return appFees;
	}

	public void setAppFees(ApplyFeesStrategy appFees) {
		this.appFees = appFees;
	}

	public GrantWithdrawalStrategy getGrantWith() {
		return grantWith;
	}

	public void setGrantWith(GrantWithdrawalStrategy grantWith) {
		this.grantWith = grantWith;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amt) {
		System.out.println("Balance before withdrawal " + getBalance());

		if (getGrantWith().verifyWithdrawal(getFreqTransaction(), getBalance(), getAmt(), getOverdarft())) {
			double fees = this.getAppFees().calculateFees(getFreqTransaction(), getBalance(), getDays());
			System.out.println("Calulated Fees on this transaction is: " + fees);
			setBalance(getBalance() - fees);

		}
		System.out.println("Balance after withdrawal " + getBalance());

	}

	
}
