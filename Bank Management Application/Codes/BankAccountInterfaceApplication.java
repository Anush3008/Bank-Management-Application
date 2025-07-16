

public class BankAccountInterfaceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccountFromInterface s_account = new SavingsAccountFromInterface(10000.00);
		
		
		s_account.deposit(10000);
		s_account.withdraw(5000);
		System.out.print(s_account.getBalance());
		
	}
	

}
