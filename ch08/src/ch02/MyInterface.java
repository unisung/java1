package ch02;

//인터페이스 선언
public interface MyInterface {
	//상수 선언
   /* final static */int const1=0;//
	//추상메소드 선언
	void method();
}
//실체 클래스를 구현하면 인터페이스에서 추상메소드로
//선언된 메소드는 재정의 해야함.
class MyClass implements MyInterface{
	@Override
	public void method() {
       System.out.println("재정의한 메소드");	
	}
}