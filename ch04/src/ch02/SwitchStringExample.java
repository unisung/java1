package ch02;

public class SwitchStringExample {

	public static void main(String[] args) {
		String position="과장";
	/* java 1.7 이후 부터 switch의 case값으로 문자열을 사용할수 있음 */	
	  switch(position) {
	  case "부장":
		  System.out.println("700만원");
		  break;
	  case "과장":
		  System.out.println("500만원");
		  break;
	  default:
		  System.out.println("300만원");
	  }

	}

}
