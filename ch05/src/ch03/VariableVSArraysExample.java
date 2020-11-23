package ch03;

public class VariableVSArraysExample {
	public static void main(String[] args) {
	  int s1=10;
	  int s2=20;
	  int s3=30;
	  int s4=40;
	  int s5=50;
	  //ÀüÃ¼ ÇÕ
	  int sum=0; int count=0;
	  sum+=s1; count++;
	  sum+=s2; count++;
	  sum+=s3; count++;
	  sum+=s4; count++;
	  sum+=s5; count++;
	  
	  System.out.println(sum);
	  System.out.println((double)sum/count);
	  
	  
	  
	  

	}
}
