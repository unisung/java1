package ch22;

public class AccountArrayExample {

	public static void main(String[] args) {
		int i=0;
		Account[] accountArray=new Account[10];
		accountArray[i++]=new Account("홍길동", 1000); 
		accountArray[i++]=new Account("일지매", 5000); 
		accountArray[i++]=new Account("임꺽정", 6000); 
		accountArray[i++]=new Account("이순신", 1000); 
		accountArray[i++]=new Account("유관순", 9000);
		
		
		//참조타입의 배열선언후 비어있는 요소는 null로 초기화되어있기때문에
		//참조index요소값이 null인지 여부를 확인 해야함.
		for(int j=0;j<accountArray.length;j++) {
			if(accountArray[j] !=null)
			System.out.println(accountArray[j].getAccountNo()+","
		      +accountArray[j].getOwner()+","+accountArray[j].getBalance());
		}
		
		Account acc=null;
		//홍길동의 계좌 정보 읽기
		for(int k=0;k<accountArray.length;k++) {
			if(accountArray[k]!=null) {
				acc=accountArray[k];
				//객체의 필드값으로 동등여부를 확인
				if(acc.getOwner().equals("홍길동")) break;
			}
		}
    System.out.println(acc.getAccountNo()+","
		                 +acc.getOwner()+","+acc.getBalance());
		
		
		
	}

}
