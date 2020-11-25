package ch10;

public class AdvancedForExample4 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[] a1;//이차원배열의 요소인 1차원배열을 담는 변수
		int num;//1차원 배열의 요소인 기본타입을 담는 변수
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				  num=arr[i][j];
				  System.out.print(num);
			}//안쪽 for문
			System.out.println();
		}//바깥쪽 for문
		
		//향상된 for문
		for(int[] a2:arr) {//int[][] arr
			    for(int k:a2) {
				 System.out.print(k);
			}
		   System.out.println();
		}

	}

}
