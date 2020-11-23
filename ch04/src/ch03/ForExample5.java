package ch03;

public class ForExample5 {
	public static void main(String[] args) {
		//for문은 시작,종료시점이 명확할때 주로 사용
		int sum=0;//초기화
		for(int i=1;i<=10;i++) {//1~10
			sum+=i;//sum=sum+i;
		}
		System.out.println("합계:"+sum);
		
		sum=0;//초기화
		for(int i=1;i<=10;i++) {
			if(i%2==0) sum+=i;
		}
		System.out.println("짝수의 합계:"+sum);
		
		sum=0;//초기화
		for(int i=10;i>=1;i--) {
			sum+=i;
		}
		System.out.println("합계:"+sum);

	}

}
