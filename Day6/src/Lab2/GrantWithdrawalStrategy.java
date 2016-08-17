package Lab2;

public interface GrantWithdrawalStrategy {
	public boolean verifyWithdrawal(int freqTransaction, double bal, double amt,double overdarft);
}
