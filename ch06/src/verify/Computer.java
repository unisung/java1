package verify;

public class Computer {
	
	int sum1(int[] values) {
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
 //매개변수로 넘어오는 값의 갯수를 모를때 
 // 매개변수 타입 선언 (타입 ... 변수)
 // 넘어오는 매개값은 타입[] 변수 형태의 배열로 넘어옴.
	int sum2(int ... values) {
		int sum=0;
		for(int i=0;i<values.length;i++)
			 sum+=values[i];
		return sum;
	}
	
	/*
	 * int sum2(int values) { int sum=0; for(int i=0;i<values.length;i++)
	 * sum+=values[i]; return sum; }
	 * 
	 * int sum2(int a1,int a2, int a3, int a4, int a5, int a6) { int sum=0; for(int
	 * i=0;i<values.length;i++) sum+=values[i]; return sum; }
	 */
	
}
