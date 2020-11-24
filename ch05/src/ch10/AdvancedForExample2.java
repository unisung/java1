package ch10;

public class AdvancedForExample2 {

	public static void main(String[] args) {
		int[][] scores= {{10,20,30},{40,50,60},{70,80,90}};
		
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			 for(int j=0;j<scores[i].length;j++)
			     sum=sum+scores[i][j];
		}
		System.out.println("총합:"+sum+",평균:"+(double)sum/9);
		
		sum=0;
		
		//향상된 for문
		for (int[] s : scores) {
			 for(int i:s) {
				sum=sum+i; //i는 전체 요소의 처음부터 끝까지 한번씩 순회하면서 값을 가져옴.
			 }
		}
		System.out.println("총합:"+sum+",평균:"+(double)sum/9);
		
	}

}
