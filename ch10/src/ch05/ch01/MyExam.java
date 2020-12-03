package ch05.ch01;

public class MyExam {
	void method1() {
		method2();
	}

	void method2() {
		//강제 예외 발생 시키기
		// throw new 예외객체 생성자();
		try {
		throw new Exception("m2예외발생");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		MyExam m=new MyExam();
		m.method1();
	}
}

