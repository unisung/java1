package ch01;

public class IncreaseOpExample1 {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		
		int j=0;
		for(;j<10;) {
			System.out.println(j);
			//j++;//1Áõ°¡
			j=j+1;
		}
		
		for(int k=10;k>0;k--) {
			System.out.println(k);
		}
	}

}
