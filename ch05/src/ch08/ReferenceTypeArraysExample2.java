package ch08;

public class ReferenceTypeArraysExample2 {
	public static void main(String[] args) {
		//참조타입 배열선언
		String[] arr =new String[4];
		
		//참조타입배열인 경우
		//배열의 각요소가 하나의 객체를 참조할수 있음.
		arr[0]="Java";
		arr[1]="Java";
		arr[2]="Java";
		arr[3]=new String("Java");
		
		
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		System.out.println(System.identityHashCode(arr[3]));
		

	}
}
