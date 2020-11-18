package ch01;

public class IncreaseOpExample3 {
	public static void main(String[] args) {
	 int x=0;
	 int y=10;
	 int z;
	 
	 System.out.println("----------------");
	 x++;
	 ++x;
	 System.out.println("x="+x);
	 
	 System.out.println("------------------");
	 y--;
	  --y;
	 System.out.println("y="+y);

	 System.out.println("------------------");
	 z=x++;
	 
	 System.out.println("z="+z);
	 System.out.println("x="+x);
	 
	 System.out.println("------------------");
	 
	 z = ++x + y++;
	 System.out.println("z="+z);
	 System.out.println("x="+x);
	 System.out.println("y="+y);
	 
	 //
	 int family=150;
	 System.out.println("홍길동의 가족은 모두 "+ ++family+"명이다.");
	 //System.out.println("홍길동의 가족은 모두 "+ family++ +"명이다.");
	 System.out.println("family:"+family);
	 
	 
	 
	}
}
