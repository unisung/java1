package ch07.ch02;

public class A {
	//접근제한 default
	void method1() {}

}
//
class B extends A{
	//오버로딩된 메소드는 부모클래스의 접근제한 보다는 넓은 접근제한을 사용해야한.
	@Override//메소드를 재정의 했다는 표시
	public void method1() {
		System.out.println("재정의");
	}
	//메소드 오버로딩
	private void method1(int x){}
}
