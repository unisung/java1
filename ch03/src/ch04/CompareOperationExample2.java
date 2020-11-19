package ch04;

public class CompareOperationExample2 {
	public static void main(String[] args) {
		int age=25;
		boolean result1 = age>=20 && age <30;
		System.out.println("결과:"+result1);
		
		int x=10,y=20;
		boolean result2 = (x>=0 & y>=0) & (x<=50 & y<=50);
		System.out.println("결과:"+result2);
		
		//
		char c='D';//69
		boolean result3 = c>='A' & c<='Z';// 69>=65 & 69<=90
		System.out.println((int)'A'+","+(int)'Z');
		System.out.println("결과:"+result3);//"결과:"+true-> "결과:"+"true"-> "결과:true"
		

	}

}
