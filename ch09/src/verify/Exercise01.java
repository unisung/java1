package verify;

public class Exercise01 {
	int field;//인스턴스 필드
	class B{
		void method() {
		field=10;
		}
	}//인스턴스 맴버
	static class C{
		void method() {
		//	field=2;//static맴버에서는 외부 instance접근불가
		}
		
	}//static맴버
	
public static void main(String[] args) {
	//인스턴스맴버 클래스 생성 
	Exercise01  a=new Exercise01();
	//외부객체 생성 후 생성
	Exercise01.B b=a.new B();
	
	//static맴버 클래스 생성
	//외부객체 생성 없이 외부클래스명.내부클래스명();
	Exercise01.C c=new Exercise01.C();
	
}
}
