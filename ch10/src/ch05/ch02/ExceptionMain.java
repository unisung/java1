package ch05.ch02;

public class ExceptionMain {

	public static void main(String[] args) {
		Account acc=new Account();
		
		acc.setBalance(10000);
		acc.deposit(10000);
		
		System.out.println(acc.getBalance());
		
		try {
			acc.withdraw(10000);
		} catch (BalanceException e) {
			e.printStackTrace();
		}
		
		System.out.println(acc.getBalance());
		
		try {
			acc.withdraw(50000);
		} catch (BalanceException e) {
			e.printStackTrace();
		}

	}

}
