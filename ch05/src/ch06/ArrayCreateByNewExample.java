package ch06;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
	 //int타입 배열의 각 요소들은 0으로 초기화됨 [0][0][0]
	 int[] arr1 = new int[3];
	 for(int i=0;i<arr1.length;i++) {
		 System.out.println("arr1["+i+"]:"+arr1[i]);
	 }
	 System.out.println(arr1[1]+10);//0+10=>10
	 
	 //double타입 배열의 각 요소들은 0.0으로 초기화됨[0.0][0.0][0.0]
	 double[] arr2 = new double[3];
	 for(int i=0;i<arr2.length;i++)
		 System.out.println("arr2["+i+"]:"+arr2[i]);
	 
	 System.out.println(arr2[1]+10);//0.0+10=>10.0
	 
	 //boolean타입 배열의 각 요소들은 false로 초기화됨[false][false][false]
	 boolean[] arr3=new boolean[3];
	 for(int i=0;i<arr3.length;i++)
		 System.out.println("arr3["+i+"]"+arr3[i]);
	 
	 System.out.println(arr3[1]| true);//false | true =>true
	 
	 //참조타입의 배열은 각 요소들이 null로 초기화 됨[null][null][null]
	 String[] arr4=new String[3];
	 for(int i=0;i<arr4.length;i++)
		 System.out.println("arr4["+i+"]:"+arr4[i]);
	 //참조타입의 요소에 접근
	 //System.out.println(arr4[1].length());
	 arr4[1]="hello";//[null]["hello"][null]
	 System.out.println(arr4[1].length());
	 
	 if(arr4[0]==null) {
		 System.out.println("해당요소가 값이 없어서 연산불가합니다.");
	 }else {
		 System.out.println(arr4[0]);
	 }

	}

}
