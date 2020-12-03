package ch05;

public class Outter {
	String field="Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field="Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		//皋家靛
	void print() {
	  System.out.println(this.field);//救率干滚 this.干滚
		this.method();//救率干滚 this.干滚
		
		//官冰率 干滚 曼炼 : 官冰率.this.干滚
		System.out.println(Outter.this.field);
		Outter.this.method();
		}
	}//Nested
	
	

}
