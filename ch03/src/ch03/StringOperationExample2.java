package ch03;

public class StringOperationExample2 {
	public static void main(String[] args) {
		String str1="JDK" + 6.0;//"JDK"+"6.0"결합
		String str2 = str1 + "특징";//"JDK6.0"+"특징"결합
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;//"JDK"+"3"결합 -> "JDK3"+"3.0"결합-> "JDK33.0"
		String str4 = 3 + 3.0 + "JDK";//3.0+3.0-> "6.0" +"JDK" -> "6.0JDK"
		System.out.println(str3);
		System.out.println(str4);
		
String str5 = "JDK" + (3 + 3.0);//(3.0+3.0) -> 6.0-> "JDK"+"6.0"결합-> "JDK6.0"
	System.out.println(str5);
	}

}
