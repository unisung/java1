package ch01;

import java.util.Scanner;

public class GradeExample2 {
	public static void main(String[] args) {
		char grade;
		
		//0~99까지의 점수를 random하게 출력
		int score=(int)(Math.random()*100);
		//if~else if~else :각 if단계별 조건 확인, 나머지는 마지막 else에서 처리
		if(score>=90) {
			grade='A';
		}else if(score>=80) {
			grade='B';
		}else if(score>=70) {
			grade='C';
		}else if(score>=60) {
			grade='D';
		}else {
			grade='F';
		}
		System.out.println("점수는 "+score+",학점은 "+grade+"입니다.");
		

		

	}

}
