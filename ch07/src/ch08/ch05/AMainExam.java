package ch08.ch05;
public class AMainExam {
	public static void main(String[] args) {
		//상속받은 자식클래스에서
		//부모메소드를 재정의하면 실행시 재정의 된 내용으로 실행됨.
		//메소드 실행시에 재정의된 메소드실행이 결정됨.(동적바인딩)
		A a =new B();
		 a.method1();
		 //a.method2();//접근불가
		 
		 B b=(B)a;
		 a.method1();

	}

}
