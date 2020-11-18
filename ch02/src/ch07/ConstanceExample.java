package ch07;

public class ConstanceExample {
	public static void main(String[] args) {
		//상수 final 한번 초기화 이후 값이 변하지않는 변수
		final double PI;//상수는 대문자로 선언(관례)
		PI=3.141597;
		
		System.out.println(PI);
		
		//상수는 수정불가
		//pi=3.151597;
		
		System.out.println(PI);

	}

}
