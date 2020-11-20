package ch04;

public class DoWhileExample1 {
	public static void main(String[] args) {
		char c='a';
		//블럭 실행후 블럭 빠져나가는 조건 체크
		do {
			System.out.print(c+" ");
			c=(char)(c+1);// 97+1=>(char)98-> 'b' 
		}while(c<='z');
		
	}
}
