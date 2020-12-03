package ch03;

public class C implements InterC {
	@Override
	public void method2() {
		System.out.println("실체메소드2");
	}
	@Override
	public void method1() {
		System.out.println("실체메소드1");
	}
	@Override
	public void method3() {
		System.out.println("실체메소드3");
	}
 
	public static void main(String[] args) {
		InterA a=new C();
		a.method1();
		//a.method2();
		//a.method3();
		
		InterB b=new C();
		b.method1();
		b.method2();
		//b.method3();
		
		InterC c=new C();
		c.method1();
		c.method2();
		c.method3();
		
		
	}
}
