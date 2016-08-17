package Lab2;

public class ApplyFeesStrategyBalance implements ApplyFeesStrategy {
	private static final int LOW_BAL_FINE = 10;
	private static final int MIN_BALANCE = 100;

	@Override
	public double calculateFees(int freqTransaction, double bal, int days) {
		// TODO Auto-generated method stub
		if (bal < MIN_BALANCE) {
			return LOW_BAL_FINE;
		} else {
			return 0;
		}

	}

}
