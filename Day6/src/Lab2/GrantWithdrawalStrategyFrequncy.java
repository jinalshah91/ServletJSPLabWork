package Lab2;

public class GrantWithdrawalStrategyFrequncy implements GrantWithdrawalStrategy {
	public static final int WITHDRAWAL_LIMIT_FREQ = 1;

	@Override
	public boolean verifyWithdrawal(int freqTransaction, double bal, double amt, double overdarft) {
		if (freqTransaction > WITHDRAWAL_LIMIT_FREQ)
			return false;
		else
			return true;
	}

}
