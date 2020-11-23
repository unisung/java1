package ch02;

public class NullPointExample2 {

	public static void main(String[] args) {
		//참조타입 중 배열타입의 변수 선언
		//타입[] 변수=배열객체;
		int[] arr1 =null;
		
		//arr1[0] = 10;//NullPointerException발생
		
		//변수 = new 타입[값을 저장할 길이];
		arr1=new int[5];//int타입의 값 5개를 저장할 공간 생성후 번지를 참조
		arr1[0] =10;//heap영역의 저장공간에 값 순서대로 저장
		//생성된 배열의 길이(저장할수 있는 공간)
		System.out.println(arr1.length);
		
		arr1=null;//강제로 연결 해제
		System.out.println(arr1.length);//NullPointerException
		
		
		
		

	}

}
