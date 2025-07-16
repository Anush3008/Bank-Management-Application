import java.util.*;
import java.awt.*;


public class BankAccountApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//BankAccount rbsAccount1 = new BankAccount(101,10000.00);
		
	/* System.out.println(rbsAccount1.getBalance());
		
		rbsAccount1.deposit_amount(15000.00);
		 
		rbsAccount1.withdraw_amount(10000.00);
		
		rbsAccount1.check_balance();
	
	BankAccount rbsAccount2 = new BankAccount(201,50000);

	rbsAccount2.withdraw_amount(5000.00); */

	/*SavingsAccount s_account1 = new SavingsAccount(301, 50000.00, 0.07);
	
	s_account1.deposit_amount(10000.00);
	s_account1.check_balance();
	s_account1.calculateInterest();*/
	
	CurrentAccount c_account1 = new CurrentAccount(601,15000.00,0.04);
	c_account1.calculateInterest();
	c_account1.check_balance();
	
	}
}
