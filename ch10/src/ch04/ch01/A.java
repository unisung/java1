package ch04.ch01;

//AutoCloseable기능을 추가하면(AutoCloseable인터페이스로 구현)
//try-with-resources로 사용가능
//finally절 없이 자동으로 자원해제 가능
public class A implements AutoCloseable{
  public void close() throws Exception{
	  System.out.println("자동해제");
  }
  public static void main(String[] args) {
	try(A a=new A()) {
		
	}catch(Exception e) {
	}
	/*
	 finally {
	  a.close();
	}
	*/
}
}
