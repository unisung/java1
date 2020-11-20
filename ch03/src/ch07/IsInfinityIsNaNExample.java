package ch07;

public class IsInfinityIsNaNExample {
	public static void main(String[] args) {
	 try {
		 int x=5;
		 int y=0;
		// int z=x/y;//값을 0으로 나눈 오류
		 int z= x%y;
		 System.out.println("z:"+z);
	 }catch(Exception e) {
		 System.out.println("0으로 나눌수 없습니다."+e.getMessage());
	 }

	}

}
