package ch13_01;

public class A {
	public static void main(String[] args) {
		String s1=new String("hello");
		
		increase(s1);
		
		System.out.println(s1);
		
	}
	//
	static void increase(String s) {
		 s=s+"0";
	}
   	

}
