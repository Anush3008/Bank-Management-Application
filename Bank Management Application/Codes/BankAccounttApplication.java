public class BankAccounttApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating a shared bank account
		
		BankAccountt account = new BankAccountt(10000.00) {};
		
		//Creating multiple threads
		
		Thread withdrawThread = new Thread( () -> {account.withdrawl(2000);});
		Thread depositThread = new Thread(() -> { account.deposit(5000);});
		Thread balanceThread = new Thread(() -> {double balance = account.getBalance();
												 System.out.println("Current Balance is :" + balance);

	    });
	
		//Start() method
	    withdrawThread.start();
	    depositThread.start();
	    balanceThread.start();
	    
	
	}

}
