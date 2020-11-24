package ch07;

public class TwoDimensionArrayLength {

	public static void main(String[] args) {
		//1차원배열이 두개이상 모인 2차원배열 선언
		int[][] arr = new int[2][3];
		//이차원배열의 길이 length의 값
		System.out.println(arr.length);//2차원을 구성하는 1차원 배열의 갯수
		
		//이차원배열의 첫번째 1차원배열의 요소의 갯수
		//arr[0].length
		System.out.println(arr[0].length);//첫번째 1차원배열의 요소갯수
		
		//이차원배열의 두번째 1차원배열의 요소 갯수
		//arr[1].length
		System.out.println(arr[1].length);//두번째 1차원배열의 요소 갯
		

	}

}
