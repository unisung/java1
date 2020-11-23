package ch03;

public class VariableVSArraysExample5 {
	public static void main(String[] args) {
	  //배열선언후 나중에 배열객체를 생성해서 대입시는 new 배열[]{초기값}으로 생성 
	  int[] arr1;
	  arr1=new int[]{10,20,30,40,50};//1차원배열 [10][20][30][40][50]
	  //배열내의 값 접근은 index번호로 접근
	  System.out.println(arr1[2]);
	  
      //arr1이 가리키는(참조하는)배열의 두번째 값과 네번째 값을 더한 결과를 세번째 공간에 저장
	  arr1[2]=arr1[1]+arr1[3];//arr1[1](20)+arr1[3](40)=>60 ->arr1[2];
	  System.out.println(arr1[2]);
	  
	  
	  //
	  int i=0;
	  System.out.println(++arr1[i]);//배열의내의 값 증가
	  System.out.println(arr1[++i]);//배열의 index접근
	 
	  
	  
	  
	  
	  
	  

	}
}
