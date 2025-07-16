

public class CurrentAccount extends BankAccount {

	private double interestRate;
	
	public CurrentAccount (int accountNumber, double balance, double interestRate) {
		
		super(accountNumber, balance);
		this.interestRate = interestRate;
		
	}

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		
		
		double interest = getBalance() * interestRate;
		deposit_amount(interest);
		System.out.println("Interest Added : "+interest);
		
	}
	
	
}
