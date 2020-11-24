package ch07;

public class TwoDimensionArrayExample2 {

	public static void main(String[] args) {
		//초기값으로 이차원 배열 생성
		//[0]행의 1차원배열 [1][2][3]
		//[1]행의 1차원배열 [4][5][6][7]
		//[2]행의 1차원배열 [8][9]
		int[][] arr= {{1,2,3},{4,5,6,7},{8,9}};
		//int[][] arr1;
		//arr1=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<arr.length;i++) {//바깥for문행의갯수
			 for(int j=0;j<arr[i].length;j++) {//안쪽for문 각행의 열(요소)의 갯수
				 System.out.print(arr[i][j]);
			 }
			 System.out.println();
		}

	}

}
