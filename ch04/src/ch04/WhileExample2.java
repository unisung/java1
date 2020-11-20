package ch04;

import java.util.Scanner;

public class WhileExample2 {
	public static void main(String[] args) {
		int count=0;//숫자가 입력된 갯수 저장하는 변수
		int sum=0;//입력된 숫자들의 값의 합 저장하는 변수
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요");
		
		int n=scanner.nextInt();
		
		while(n!=-1) {
			sum+=n;//sum=sum+n;
			count++;//count=count+1;
			n=scanner.nextInt();
		}
		if(count==0) System.out.println("입력된 수가 없습니다.");
		else {
			System.out.println("정수의 개수는 "+count+"개이며");
			System.out.println("평균은 "+(double)sum/count+"입니다.");
		}
		
		scanner.close();
	}
}
