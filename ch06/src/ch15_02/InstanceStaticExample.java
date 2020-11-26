package ch15_02;

public class InstanceStaticExample {
  //필드
	int field1;
	void mehtod1() {}
	
	//
	static int field2;
	static void method2() {}
	
	
	//정적블록
	static {
		//field1=10; -인스턴스맴버 불가
		//mehtod1(); -인스턴스 맴버 불가
		field2=10;
		method2();
	}
	
	static void method3() {
		//this.field1=10; -this불가
		//this.method1(); -this불가
		field2=10;
		method2();
	}

	public static void main(String[] args) {
		
	}

}
