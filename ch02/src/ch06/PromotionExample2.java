package ch06;

public class PromotionExample2 {
	public static void main(String[] args) {
		int x=5;
		int y=10;
		
		double result = x+y;//int+int->int(15) -> double=int -> 15->15.0
		
		System.out.println(result);
		
		result = 10.0 - x;//10.0(double) - 5(int->double,5.0)=> 10.0-5.0=5.0
		System.out.println(result);

	}

}
