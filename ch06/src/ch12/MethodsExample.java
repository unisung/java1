package ch12;

public class MethodsExample {
	//매개변수 받고, 결과를 리턴하는 메소드
	double method(int x, double y) {
		return x+y;//return 값;
	}
	
	//매개변수 받고, 결과를 리턴하지 않는 메소드
	void method1(double x, double y) {
		System.out.println(x+y);
	}
	
	void method1_1(double x, double y) {
		if(x>0)
		  return;//void타입메소드에서 return문은 실행 종료 의미;
	    System.out.println(x+y);//return문 아래의 명령은 실행 안함.	
	}
	
	//매개변수 안받고 , 결과만 리턴하는 메소드
	double method2() {
		return 10.0;//return 값;
	}
	
	//매개변수 안받고, 결과도 되돌려 주지 않는 메소드
	void method3() {
		System.out.println(55);
	}
	
  public static void main(String[] args) {
	  MethodsExample m=new MethodsExample();
	  //선언된 메소드 호출시는 실제값을 매개값으로 넘겨줌. result=메소드명(값1,값2);
	  double result=m.method(10, 20);
	  //void타입 메소드는 호출만하고 리턴값을 받지않음 - 메소드명(값1,값2);
	  m.method1(10, 20);
	  // 매개값 없고 결과만 리턴하는 메소드 호출 result=메소드();
	  result = m.method2();
	  //매개값 없고, 결과도 리턴하지 않는 메소드 호출  메소드();
	  m.method3();
	  
	  
	  
}

}
