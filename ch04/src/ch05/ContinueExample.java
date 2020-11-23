package ch05;

public class ContinueExample {
	public static void main(String[] args) {
	 for(int i=1;i<=10;i++) {
		 if(i%2!=0) {
			 continue;//반복문에서  continue문을 만나면 아래 문장은 실행하지 않음
		 }
		 System.out.println(i);
	 }//for문

	}

}
