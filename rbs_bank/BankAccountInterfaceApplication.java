package com.internshala.rbs_bank;

public class BankAccountInterfaceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccountFromInterface s_account = new SavingsAccountFromInterface(10000.00);
		
		
		s_account.deposit(5000);
		s_account.withdraw(2000);
		System.out.print(s_account.getBalance());
		
	}
	

}
