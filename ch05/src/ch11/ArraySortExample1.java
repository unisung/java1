package ch11;

//배열의 정렬
public class ArraySortExample1 {
	public static void main(String[] args) {
	 int[] scores= {76,45,34,89,100,50,90,92};
	 int temp;
	 int sum=0;
	 
	 for(int i=0;i<scores.length;i++) {
		 for(int j=i+1;j<scores.length;j++) {
			 //비교로직
			 if(scores[i]>scores[j]) {//왼쪽이 오른쪽보다 크면
				 temp=scores[i];//먼저 임시 변수에 왼쪽값 저장
				 scores[i]=scores[j];//오른쪽값을 왼쪽에 저장
				 scores[j]=temp;//임시변수의 값을 오른쪽에 저장
			 }
		 }//안쪽 for문
		 //총합 로직
		 sum+=scores[i];
	 }//바깥쪽 for문
	 System.out.println("합: "+sum+",평균: "+(double)sum/scores.length);
	 
	 for(int k:scores) {
		 System.out.println(k);
	 }
	 
	}
}
