package ch10_01;

public class AFiledsMainExample {
	public static void main(String[] args) {

		A a = new A();
   //기본데이타 타입이 필드일때는 기본값인 0이나 0.0,false로
   //값이 초기화되어서 오류 안남.
		System.out.println(a.a);//int
		System.out.println(a.b);//byte
		System.out.println(a.c);//char
		System.out.println(a.d);//double
		System.out.println(a.s);//short
		System.out.println(a.l);//long
		System.out.println(a.f);//float
		System.out.println(a.bool);//boolean
		
		System.out.println(a.str);//String
		System.out.println(a.bb);//B
		//필드가 참조타입일때는 null로 초기화되기 때문에
		//해당필드 접근시 오류 발생
		//객체 생성하여 초기화 후 접근해야됨.
		System.out.println(a.str.length());//String
		
	}
}
