package ch10;

public class AdvancedForExample3 {
	public static void main(String[] args) {
		double[] dArr = {0.1, 0.2, 0.3, 0.4, 0.5};
		double d;
		for(int i=0;i<dArr.length;i++) {
			   d=dArr[i];
			   System.out.println(d);
		}
		
		// JDK 1.5부터 도입 향상된 FOR문
		for(double k:dArr) {
			System.out.println(k);
		}
		
	char[] cArr= {'H','e','l','l','o'};
	char c;
	for(int i=0;i<cArr.length;i++) {
		  c=cArr[i];
		  System.out.println(c);
	}
	
	for(char j:cArr) {
		System.out.println(j);
	}


	}
}
