package ch08;

public class ReferenceTypeArraysExample {
	public static void main(String[] args) {
		//참조타입 배열선언
		String[] arr =new String[3];
		
		arr[0]="Java";
		arr[1]="C++";
		arr[2]="C#";
		
		
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		
		System.out.println(System.identityHashCode("Java"));
		System.out.println(System.identityHashCode("C++"));
		System.out.println(System.identityHashCode("C#"));

	}

}
