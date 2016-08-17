package Lab2;

public class GrantWithdrawalStrategyBalance implements GrantWithdrawalStrategy{

	public static final double WITHDRAWAL_THRESHOLD = 100;

	@Override
	public boolean verifyWithdrawal(int freqTransaction, double bal, double amt,double overdarft) {
		if(bal>amt+overdarft){
			return true;
		}
		else{
			return false;
		}
		
	}

}
