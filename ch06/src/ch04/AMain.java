package ch04;

public class AMain {

	public static void main(String[] args) {
	  Member m1 = new Member();
	  //Member객체의 필드에 직접접근불가
	  //m1.sno=1;
	  //m1.name="홍길동";
	  //m1.jumin="200101-1001111";
	  m1.setSno(1);
	  m1.setName("홍길동");
	  m1.setJumin("200101-1001111");
	  
	  m1.getInfo(2);
	  //m1.getGrade(1);//직접접근 불가
	  
	  //m1.jumin="200101-2001111";
	  

	}

}
