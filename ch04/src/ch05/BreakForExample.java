package ch05;

public class BreakForExample {

	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			for(int j=1;j<=10;j++) {
				 if(j==10) break;//안쪽 for문 만 빠져나감
				 System.out.print(i+"x"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}

}
