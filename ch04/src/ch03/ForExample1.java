package ch03;

public class ForExample1 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum=sum+i;
		}
		System.out.println("1~100까지의 합:"+sum);
		
		//for(초기화 문에서 선언된 변수는){블럭내에서만 사용가능}
		for(int i=1,sum2=0;i<=100;i++) {
			sum2=sum2+i;
			System.out.println("1~"+i+"까지의 합:"+sum2);
		}
		
		int j=1;
		int sum3=0;
		for(;j<=100;j++) {
			sum3+=j;
		}
		System.out.println("1~100까지의 합:"+sum3);
		
		int k=1;
		int sum4=0;
		for(;k<=100;) {
			sum4+=k;
			k++;
		}
		System.out.println("1~100까지의 합:"+sum4);
		
		//
	   int m=1;
	   int sum5=0;
	   for(;;) {
		   sum5+=m;
		   if(m==100) break;
		   m++;
	   }
	   System.out.println("1~100까지의 합:"+sum5);
	   
	   int sum6=0;
	  for(int n=1;n<=100;n++) {
		  sum6+=n;
	  }
	  System.out.println("1~100까지의 합:"+sum6); 
		
	}

}
