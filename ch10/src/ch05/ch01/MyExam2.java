package ch05.ch01;

public class MyExam2 {
	void method1() {
		try {
		method2();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	void method2() throws Exception {
		//강제 예외 발생 시키기
		// throw new 예외객체 생성자();
		throw new Exception("m2예외발생");
	}
	
	public static void main(String[] args) {
		MyExam2 m=new MyExam2();
		m.method1();
	}
}

