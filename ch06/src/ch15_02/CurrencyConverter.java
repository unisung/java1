package ch15_02;

public class CurrencyConverter {
	private static double rate; //  한국 원화에 대한 환율-외부에서 접근불가 필드
	
	public static double toDollar(double won) {
		return won/rate; // 한국 원화를 달러로 변환
	}
	public static double toKWR(double dollar) {
		return dollar * rate; // 달러를 한국 원화로 변환
	}
	public static void setRate(double r) {
		rate = r; // 환율 설정. KWR/$1
	}
}
