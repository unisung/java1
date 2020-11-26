package ch13;

public class ValuePassing {
	public static void main(String[] args) {
		int n=10;
		
		//call by value
		increase(n);//기본타입의 매개변수 값은 실값이 복사 되어서 전달됨.
		
		System.out.println(n);//원본값은 변하지 않음.
	}
	
	//메소드
	static void increase(int m) {
		m=m+1;
	}
}
