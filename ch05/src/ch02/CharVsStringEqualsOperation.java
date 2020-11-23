package ch02;

public class CharVsStringEqualsOperation {

	public static void main(String[] args) {
		//기본타입 변수 선언 및 값 초기화
		char c1='A';
		char c2='A';
		
		//기본타입에서의 ==연산은 변수에 저장된 값의 비교
		if(c1==c2) System.out.println("c1의 값과 c2의 값이 같다");
		
		//참조타입의 변수 선언 및 값 초기화
		String s1=new String("hello");
		String s2=new String("hello");
		if(s1==s2) System.out.println("s1과 s2가 가리키는 주소가 같다.");
		else System.out.println("s1과 s2가 가리키는 주소가 다르다");
		
		//s1의 값과 s2의 값이 같은지 비교
		if(s1.equals(s2))System.out.println("s1과 s2는 값이 같다");
		else System.out.println("s1과 s2는 값이 다르다");

	}

}
