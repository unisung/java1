package ch05;

public interface MyInterFace {
	void action();
}
class B implements MyInterFace{
	@Override
	public void action() {
		System.out.println("B");
	 }
  }
class C implements MyInterFace{
	@Override
	public void action() {
		System.out.println("C");
	}
 }
class D extends B{}
class E extends C{}