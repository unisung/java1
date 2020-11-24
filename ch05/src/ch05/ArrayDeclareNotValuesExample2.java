package ch05;

import java.util.Scanner;

public class ArrayDeclareNotValuesExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//타입[] 변수 =new 타입[길이];
		int[] intArr = new int[5];
		
		//5개의 정수를 입력하여 평균을 구하는 프로그램
	    for(int i=0;i<intArr.length;i++) {
	    	System.out.println((i+1)+"번째 값을 입력하세요");
	    	intArr[i]=scanner.nextInt();//배열에 저장됨.
	    }
		
	     int sum=0;
		 //값 출력
		 for(int i=0;i<intArr.length;i++) {
			  sum+=intArr[i];
		 }
		 System.out.println("평균:"+sum/intArr.length);
	}
}
