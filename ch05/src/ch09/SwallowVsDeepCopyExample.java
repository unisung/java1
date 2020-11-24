package ch09;

public class SwallowVsDeepCopyExample {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		//arr이 참조하고있는 배열객체의 주소만 arr2로 전달
		//변수arr과 arr2가 동일 객체를 공유
		int[] arr2 = arr;
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]+" ");
		//arr1변경
		arr[0]=9; arr[1]=8; arr[2]=7;
		
		System.out.println();
		//arr2의 내용도 연동
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]+" ");
		

	}

}
