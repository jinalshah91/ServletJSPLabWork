package Lab1;

public class Bank {
	public static void main(String[] args) {
		Account[] accounts = new Account[3];
		accounts[0] = new MortgageAccount("Jinal", 100000);
		accounts[1] = new CheckingAccount("Jenil", 200);
		accounts[2] = new CheckingAccount("Rohith", 1000);
		for (Account account : accounts) {
			System.out.println("============== Transactions for: "+account.getHolderName()+"===============");

			System.out.println("Deposit 100: " + account.deposit(100));
			System.out.println("Balance: " + account.getBalance());
			System.out.println("====================================");
			
			System.out.println("Withdraw 500: " + account.deposit(500));
			System.out.println("Balance: " + account.getBalance());
			System.out.println("====================================");

			System.out.println("Withdraw 1000: " + account.withdraw(1000));
			System.out.println("Balance: " + account.getBalance());
			System.out.println("====================================");

			System.out.println("Withdraw 2000: " + account.withdraw(2000));
			System.out.println("Balance: " + account.getBalance());
			
		}
	}
}
