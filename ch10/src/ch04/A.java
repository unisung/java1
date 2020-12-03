package ch04;

public class A {
  void close() {
	  System.out.println("자동해제");
  }
  public static void main(String[] args) {
	A a=null;
	try {
		a=new A();
	}catch(Exception e) {
		
	}finally {
	  a.close();
	}
}
}
