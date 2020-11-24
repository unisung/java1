package ch09;

public class SwallowVsDeepCopyExample2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		//복사할 새로운 배열을 만들고 내용을 복사한후 사용(깊은복사)
		int[] arr2 = new int[arr.length];
		//각 요소 복사하기
		for(int i=0;i<arr.length;i++)
			 arr2[i]=arr[i];
				
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
