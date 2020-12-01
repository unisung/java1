package verify.ch19;

public class AccountExample {
	public static void main(String[] args) {
			    Account account=new Account();
			   account.setBalance(10000);
			   System.out.println("현재잔고:"+account.getBalance());
			    account.setBalance(-100);
			   System.out.println("현재잔고:"+account.getBalance());

			   account.setBalance(2000000);
			   System.out.println("현재잔고:"+account.getBalance());
			 
			  account.setBalance(300000);
			   System.out.println("현재잔고:"+account.getBalance());
	}
}
class Account{
	final static int MIN_BALANCE=0; 
	final static int MAX_BALANCE=1000000;
	int balance;
	public int getBalance() {	return balance;	}
	
	
	public void setBalance(int balance) {
		//논리연산 논리합 왼쪽이 true이면 오른쪽은 연산 안함.
	  if(balance < MIN_BALANCE || balance >MAX_BALANCE) return;
		this.balance = balance;
	}
}