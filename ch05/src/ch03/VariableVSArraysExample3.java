package ch03;

public class VariableVSArraysExample3 {
	public static void main(String[] args) {
	  //배열선언후 나중에 배열객체를 생성해서 대입시는 new 배열[]{초기값}으로 생성 
	  int[] arr1;
	  arr1=new int[]{10,20,30,40,50};//1차원배열 [10][20][30][40][50]
	  
	  //전체 합
	  int sum=0;
	  for(int i=0;i<5;i++) {
		  sum+=arr1[i];//sum+=arr1[0];sum+=arr1[1];
		               //sum+=arr1[2];sum+=arr1[3];sum+=arr1[4];
	  }
	  
	  System.out.println(sum);
	  System.out.println((double)sum/5);
	  
	  
	  
	  
	  
	  

	}
}
