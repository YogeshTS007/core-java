class AccountTester{

	public static void main(String a[]){
	
		SavingsAccount sa = new SavingsAccount(4.00);
		sa.deposit(500.00);
		sa.withDraw(500.00);
		sa.periodicInterest();
	
	
		SavingsAccount other = new SavingsAccount(0.3);
		
		
		sa.transfer(3000.00, other);
		
		double totalAmount = other.getBalance();
		System.out.println("Balance of Other Account : "+totalAmount);
	}


}