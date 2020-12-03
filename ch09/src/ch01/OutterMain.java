package ch01;

public class OutterMain {
public static void main(String[] args) {
	//내부클래스B가 A의 인스턴스맴버
	//이므로, A객체 생성 후 B객체 생성
	A a=new A();
	//바깥클래스.안쪽클래스타입 변수=바깥참조변수.new 안쪽클래스();
	A.B b=a.new B();
	
	//안쪽클래스의 맴버 접근
	//안쪽 참조변수.필드, 안쪽 참조변수.메소드
	b.field1=3;
	b.method1();
}
}
