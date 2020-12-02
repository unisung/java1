package ch08.ch03;

public class MainExam2 {
  public static void main(String[] args) {
	//교차 변환 불가
	//java.lang.ClassCastException: 
	//ch08.ch03.B cannot be cast to ch08.ch03.C  
	A a=new B();
	//C c = (C)a;
	
	
	a=new C();
	//B b = (B)a;
	
	
	  
	}
}
