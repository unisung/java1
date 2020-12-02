package ch08.ch05.ch05;

public class Parent {

	
	public static void main(String[] args) {
	   //처음부터 부모객체를 자식참조변수에 대입불가
	  //Child child = new Parent();
	  
		//자식 ->부모 ->원래 자식으로 형변환 가능
		Parent p=new Child();
		Child c=(Child)p;
}
  
}

class Child extends Parent{
	
}