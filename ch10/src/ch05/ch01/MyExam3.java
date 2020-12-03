package ch05.ch01;

public class MyExam3 {
	void method1() throws Exception {
		method2();
	}

	void method2() throws Exception {
		//강제 예외 발생 시키기
		// throw new 예외객체 생성자();
		throw new Exception("m2예외발생");
	}
	
	public static void main(String[] args) throws Exception {
		MyExam3 m=new MyExam3();
		//try {MyExam2.java
		m.method1();
		//}catch(Exception e) {}
	}
}

