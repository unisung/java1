package ch11;

public class MinValueInArrayExample1 {

	public static void main(String[] args) {
		int[] scores= {76,45,34,89,100,50,90,92};
		//최소값 구하기
		//최소값을 저장할 변수의 값을 배열의 최대값 이상의 값을 저장
		int min=1000;
		//배열의 처음부터 끝까지 반복하면서 min값과 각요소의 값을 비교
		//min의 값이 각 요소의 값보다 크면 min값과 바꿔치기를 반복.
		for(int i=0;i<scores.length;i++) {
			if(min>scores[i]) {
				min=scores[i];
			}//if끝
		}//for끝.
       System.out.println("최소값:"+min);
       
       min=100;
       //향상된 for문
       for(int s:scores) {
			if(min>s) {
				min=s;
			}//if끝
		}//for끝.
       System.out.println("최소값:"+min);
	}
}
