package ch13_01;

public class B2 {
	public static void main(String[] args) {
		//참조타입객체(배열)
		int[] array= {1,2,3,4,5};
		
		increase(array);
		
		for(int i=0;i<array.length;i++)
		System.out.print(array[i]);
	}
	//깊은 복사
	static void increase(int[] arr) {
		int[] newArr=new int[arr.length];
		System.arraycopy(arr, 0, newArr, 0, arr.length);
		newArr[0]=99;
	}

}
