import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class BankAccountt {
     private double balance;
     private final Lock lock = new ReentrantLock();
     
	
     public BankAccountt (double initialBalance) {
    	 this.balance = initialBalance;
    	 
     }
     
     //Synchronized accounts
     
     public  void withdrawl(double amount) {
    	 lock.lock();
    	 try {
    		 if (amount > 0 && amount <= balance) {
        		 balance -= amount;
        	System.out.println("Withdrawal of " + amount + "successful. New balance: "+ balance);
        	} 
        	 else {
      		System.out.println("Withdrawal failed. Insufficient funds.");
        			 }
    	 }
    	finally {
    		lock.unlock();
    	}
    	 }
     
     public  void deposit (double amount) {
    	 lock.lock();
    	 try {
    		 if (amount > 0) {
    	    	 balance += amount;
    	    	 System.out.println("Deposit of " + amount + "successful. New balance: " + balance);
    	    	 } else {
    	    	 System.out.println("Deposit failed. Invalid amount.");
    	    	 }
    	 }
    	 finally {
    		 lock.unlock();
    	 }
    	
   }
   
     public double getBalance() {
    	 lock.lock();
    	 try {
    		 return balance; 
    	 }
    	 finally {
    		 lock.unlock();
    	 }
    	
    	 
     }
}
