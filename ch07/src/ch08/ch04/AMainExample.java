package ch08.ch04;

public class AMainExample {
   public static void main(String[] args) {
	   B b= new B();
	   //자식개체에서는 모두 접근가능
	   b.field1=0;
	   b.field2=0;
	   b.method1();
	   b.method2();
	   
	   
	   //자식클래스의 객체(B)가 
	   //부모타입의 A타입으로 형변환(promotion)
	   A a = b;
	   a.field1=0;
	   a.method1();
	   //원래 A클래스에 없던 맴버이므로 접근 불가
	   //a.field2=0;
	   //a.method2();
	   
	   //A타입으로 변환한 객체를
	   //다시 원래의 B타입으로 변환(casting)
	   B b2 =(B) a;
	   b2.field1=0;
	   b2.field2=0;
	   b2.method1();
	   b2.method2();
	   
	   
	   
}
	
}
