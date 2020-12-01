package ch11;

public class BMainExample {
	public static void main(String[] args) {
	 //사용자 정의 생성자가 소스코드에 존재하면
	 //컴파일러는 기본 생성자를 추가하지 않음
	 //그래서, 클래스파일에 기본생성자가 없으므로 호출불가.
		 //B b=new B();
		 B b1=new B(10);

	}
}
