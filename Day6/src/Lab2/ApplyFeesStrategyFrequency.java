package Lab2;

public class ApplyFeesStrategyFrequency implements ApplyFeesStrategy {
	private static final int MONTHLY_LIMIT_FINE = 15;
	private static final int WITHDRAWAL_LIMIT = 5;
	private static final int WITHDRAWAL_LIMIT_DAYS = 30;

	@Override
	public double calculateFees(int freqTransaction, double bal, int days) {
		// TODO Auto-generated method stub
		if (WITHDRAWAL_LIMIT_DAYS >= days && WITHDRAWAL_LIMIT >= freqTransaction) {
			return 0;
		} else {
			return MONTHLY_LIMIT_FINE;
		}

	}

}
