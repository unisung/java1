package ch01;

public class ClassJVMExample {
	//런타입 상수 "hello"
	//필드 msg1, msg2
    static String msg1 = "hello";
    String msg2 = "hello";
    //필드 age
    int age=10;
    
    //메소드
    public void method() {
    	//메소드 데이터-local 변수
    	double d=10.2;
    	System.out.println("hi");
    }
    //기본 생성자 코드
    ClassJVMExample(){
    	System.out.println("기본 생성자 실행");
    }
      //main()메소드는 ClassJVMExample객체 생성을 위한 별도의 실행코드
	public static void main(String[] args) {
        new ClassJVMExample();
	}
}
