package ch11;

//최대값 구하기
public class MinValueInArrayExample2 {
	public static void main(String[] args) {
		int[] scores= {76,45,34,89,100,50,90,92};
		//최대값 구하기
		//최대값을 저장할 변수의 값을 배열의 최소값 이하의 값을 저장
		int max=1;
		//배열의 처음부터 끝까지 반복하면서 max값과 각요소의 값을 비교
		//max의 값이 각 요소의 값보다 작으면 max값과 바꿔치기를 반복.
		for(int i=0;i<scores.length;i++) {
			if(max < scores[i]) {
				max=scores[i];
			}//if끝
		}//for끝.
       System.out.println("최대값:"+max);
       
       //향상된 for문
       max=1;
       for(int s : scores) {
    	   if(max<s) max=s;
       }
       System.out.println("최대값:"+max); 
	}
}
