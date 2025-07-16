

public class SavingsAccountFromInterface implements BankAccountInterface {

	private double balance;
	
	public SavingsAccountFromInterface(double initialBalance) {
		
		balance = initialBalance;
		
	}
	
	public void deposit(double amount) {
		// TODO Auto-generated method stub
	
		if (amount > 0) {
			balance +=amount;
			System.out.println("Deposited Amount : "+amount);
			System.out.println("New Balance :"+balance);
			
		}
		else {
			System.out.println("Invalid deposit amount");
			
		}
	}

        @Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount > 0 && amount <=balance) {
			balance -= amount;
			System.out.println("Withdraw Amount :"+amount);
			System.out.println("New Balance : "+balance);
		}
		else {
			System.out.println("Invalid withdrawl amount or insufficient balance");
		}
	}

        @Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	
	
}
