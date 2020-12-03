package ch07;

public class MainExample {
	public static void main(String[] args) {
		InterfaceA a=new B();
		a=new C();
		
		//static메소드는
		//인터페이스명.메소드로 접근
		InterfaceA.method3();
	}
}
