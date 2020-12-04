package ch03;
//java 1.5 이후 추가 -autoBoxing,autoUnBoxing
public class AutoBoxingAutoUnBoxingExample {
	public static void main(String[] args) {
	  // Wrapper타입에 기본타입을 바로 대입
	  // AutoBoxing
      Integer iValue = 10;
      
      //기본타입 ->객체타입 
      Byte b = 10;
      Short s=10;
      Long l=10l;
      Float f=10.0f;
      Double d=10.0;
      Boolean bool=true;
      
      //Wrapper타입을 기본타입으로 바로 변환
      //AutoUnBoxing
      int i = iValue;
	  byte b1=b;
	  short s1=s;
	  long l1=l;
	  float f1=f;
	  double d1=d;
	  boolean bool1=bool;
	  
	  
		

	}

}
