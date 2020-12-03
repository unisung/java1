package ch02;

public class OutterMain {
public static void main(String[] args) {
	//바깥타입.안쪽타입 변수=new 바깥클래스.안쪽클래스();
	A.B b=new A.B();
	
	b.field1=3;//인스턴스 필드
	b.method1();//인스턴스 메소드
	
	//static맴버
	A.B.field2=3;
	A.B.method2();
	
	
	
}
}
