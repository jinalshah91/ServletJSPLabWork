package Lab1;

public class MortgageAccount extends Account {

    private long initBorroedAmount;

    public MortgageAccount(String holderName, long amount) {
        super(holderName);
        this.setInitBorroedAmount(amount);
        super.executeTransaction("Initial Borrowed Amount" , -1 * amount);
    }

    @Override
    public boolean deposit(long amount) {
        super.executeTransaction("Mortgage Payment", amount);
        return true;
    }

    @Override
    public boolean withdraw(long amount) {
        System.out.println("You can't withdraw with Mortgage Account");
        return false;
    }

	public long getInitBorroedAmount() {
		return initBorroedAmount;
	}

	public void setInitBorroedAmount(long initBorroedAmount) {
		this.initBorroedAmount = initBorroedAmount;
	}
}