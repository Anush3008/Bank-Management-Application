import java.util.*;
import java.awt.*;



public abstract class BankAccount {
	
	// attributes
	
	private int accountNumber;
	private double balance;

	public BankAccount(int accountNumber, double initialBalance) {
		
		//keyword-> this
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
		
	}
	
	// Getters
	 
	/* public int getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;	
	}
	
	//Setters
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber; 
	}
	public void setBalance(double balance) {
		this.balance = balance;
	} */
	
	
	//Methods
    public void deposit_amount(double amount) {
    	
    	if (amount > 0) {
    		
    		balance = balance + amount;
    		System.out.println("Amount deposited.New balance: "+balance);
    		
    	}
    	else {
    		System.out.println("Invalid amount.");
    		
    	}
    	
    }
    
    public void withdraw_amount(double amount) {
    	
    	if(amount > 0 && amount<=balance) {
    		
    		balance = balance-amount;
    		System.out.println("Withdraw done. New balance :"+balance);
    		
    		
    	}
    	else {
    		System.out.println("Insufficient bunds or invalid amount");
    		
    	}
    }
	
    public void check_balance() {
    	
    	System.out.println("Your current balance is :"+balance);
    }

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public abstract void calculateInterest();

    void withdrawl(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void deposit(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	

}
