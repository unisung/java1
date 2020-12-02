package ch08.ch02;

public class MainExam {
  public static void main(String[] args) {
	//최초 생성된 객체참조 시점까지 
	 //되돌아갈수는 있음
	A a=new B();
	B b=(B)a;
	
	//자식객체까지 변환 불가
	//D d = (D)b;
	
	C c=new C();
	 a=c;
	C c2=(C)a;
	
	//최초 생성된 객체 보다 자식의 클래스타입으로 변환 불가
	//E e=(E)c2;
	
	//시작점이 D이므로 A까지 변환했다가 다시 D까지 변환 가능.
	a=new D();
	b=(B)a;
	D d=(D)b;
	
	
	
	
	
	
	
	
	
	
	
	  
	}
}
