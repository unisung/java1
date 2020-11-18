package ch02;

public class ArithmaticOpExample {
	public static void main(String[] args) {
		int v1=5;
		int v2=2;
		
		//µ¡¼À¿¬»ê
		int result1 = v1 + v2;
		System.out.println(result1);
		
		//»¬¼À ¿¬»ê
		int result2 = v1-v2;
		System.out.println(result2);
		
		//°ö¼À ¿¬»ê
		int result3 = v1*v2;
		System.out.println(result3);
		
		//¸ò ¿¬»ê
		int result4 = v1/v2;//int / int -> int
		System.out.println(result4);
		
		//³ª¸ÓÁö ¿¬»ê
		int result5 = v1%v2;
		System.out.println(result5);
		
		//³ª´°¼À
		double result6 = v1/(double)v2;//int/int -> int/double->double/double
		System.out.println(result6);
		
		
		
	}

}
