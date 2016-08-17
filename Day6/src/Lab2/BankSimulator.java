package Lab2;

public class BankSimulator {
	public static void main(String args[]) {
		Account myAccount1 = new Account(10000, new GrantWithdrawalStrategyBalance(), new ApplyFeesStrategyBalance(), 1, 100, 10, 20);
		Account myAccount2 = new Account(100, new GrantWithdrawalStrategyFrequncy(), new ApplyFeesStrategyFrequency(), 1, 100, 10, 20);
		
		myAccount1.deposit(1000);
		myAccount1.withdraw(11000);
		myAccount1.deposit(1000);
		myAccount1.deposit(1000);


		myAccount2.deposit(1000);
		myAccount2.withdraw(11000);

		
	}

}
