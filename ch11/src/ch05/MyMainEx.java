package ch05;

public class MyMainEx {
	public static void main(String[] args) {
		MyClass mc=new MyClass();
		mc.set("ȫ�浿");// String -> Object 
		System.out.println(mc.get());// Object ->String
		
		mc.set(10);//Integer -> Object
		System.out.println(mc.get());// Object -> Integer
		
		
	}

}
