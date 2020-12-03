package ch07.ch01;

public class A {
	//Parent field = new Parent();
	//무명클래스-생성시 바깥클래스$순번.class
	Parent field = new Parent() {};
	void method() {
		field.chidleField=0;
		//field.newField=0;
	}
	//무명클래스의 선언은 상속을 한것과 같다.
	//new Parent(){}로 선언된 객체는 상속받은 객체와 동일한 효과발생
	//자식객체를 생성하여 부모참조변수에 대입한 것과 동일한 결과
	Parent field2=new Parent() {
		int newField;//추가된 필드
		@Override
		void childMethod() {
	     System.out.println("자식메소드");
		}
		void newMethod() {}//추가된 메소드
	};
    void method2() {
    	field2.childMethod();
    	field2.chidleField=0;
    	
    	//자식객체에서 추가된 메소드로 인식하므로 접근불가
    	//field2.newField=0;
    	//field2.newMethod();//추가된 메소드로 인식하므로 접근불가
    }
}

//추상클래스
abstract class Parent{
	int chidleField;
	void childMethod() {}
}
//상속객체
class Child extends Parent{
	int newField;//추가된 필드
	@Override
	void childMethod() {
     System.out.println("자식메소드");
	}
	void newMethod() {}//추가된 메소드
	
}