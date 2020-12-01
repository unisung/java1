package ch22;

public class Account {
    static int seq=0;
	//필드
	private String accountNo;
	private String owner;
	private int balance;
	
	//사용자정의 생성자 - default생성자는 없음.
	public Account(String owner, int balance) {
		this.accountNo = "001-20001-"+ ++seq;
		this.owner = owner;
		this.balance = balance;
	}

	//get메소드/set메소드
	public String getAccountNo() {		return accountNo;	}
	public String getOwner() {		return owner;	}
	public int getBalance() {		return balance;	}
		
	//입급
	void withdraw(int amount) {
	  if(this.balance<amount) {
		  return;
	  }else {
		  this.balance = this.balance - amount;
	  }
	}
	
	//출금
	void deposit(int amount) {
		 this.balance=this.balance+amount;
	}
	
	
	
	

}
