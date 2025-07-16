

public class SavingsAccount extends BankAccount {

	
	private double interestRate ;
	
	public SavingsAccount(int accountNumber, double balance, double interestRate) {
		
		super(accountNumber,balance);
		
		this.interestRate = interestRate;
	}
	
	public void calculateInterest() {
		double interest = getBalance() * interestRate;
		deposit_amount(interest);
		System.out.print("Interest Added : "+interest);
	}
	
}
