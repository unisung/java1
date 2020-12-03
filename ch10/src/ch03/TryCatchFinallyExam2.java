package ch03;

public class TryCatchFinallyExam2 {
	public static void main(String[] args) {
		try {
			System.out.println("예외발생");
			throw new Exception("강제 발생");
		} catch (Exception e) {
			System.out.println("예외발생시 실행 ");
		}finally {
			System.out.println("종료전 반드시 실행");
		}
	}
}
