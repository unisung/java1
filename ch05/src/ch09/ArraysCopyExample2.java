package ch09;

import java.util.Arrays;

public class ArraysCopyExample2 {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		//int타입의 배열을 새로운 배열을 생성후 복사
		int[] newArr=Arrays.copyOf(intArr, intArr.length);
		
		for(int i=0;i<newArr.length;i++)
			System.out.println(newArr[i]);
        
		// int[] 새로운 배열객체 생성후 값을 복사 
		newArr[0]=9;
		
		System.out.println(intArr[0]);
		
		

	}

}
