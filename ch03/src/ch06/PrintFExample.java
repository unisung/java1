package ch06;

import java.util.Date;

// System.out.printf(format,값);
//%n:줄바꿈
//%s:String형식
//%d:integer형식
//%f:float형식
//%0:8진수형식
//%x:16진수형식
//%b:boolean형식
//%e:지수형식
public class PrintFExample {
	public static void main(String[] args) {
	  System.out.printf("%b%n",null);
	  System.out.printf("%b%n",true);
	  
	  System.out.printf("Hello %s %n", "길동");
	  
	  System.out.printf("%15s%n","하이");
	  System.out.printf("%-15s%n","하이");
	  System.out.printf("%2.4s %n", "Hello World!");//.4s출력할 문자 갯수
	  
	  System.out.printf("%d%n", 100L);
	  System.out.printf("%f%n", 123.456);
	  System.out.printf("%5.2f%n", 123.456);//소수점 2자리
	  System.out.printf("%5.2e%n", 123.456);//e지수표현
	  
	  Date date = new Date();
	  System.out.printf("hours: %tH, minute:%tM, second:%tS %n",date,date,date);
	  System.out.printf("%tA,%tB %tY %n", date,date,date);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	}

}
