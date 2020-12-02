package ch01.ch04;

public class A {
	private int x;//private이기 때문에 외부에서 접근불가
	public int getX() {//public이므로 외부에서 getX()접근가능, getX()에서 x에 접근가능
		return x;
	}

  public static void main(String[] args) {
	 A a=new A();
	 //a.x;//외부에서 직접 접근 불가
	 a.getX();//
			 
}
}
