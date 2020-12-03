package ch03;

public class TryCatchFinallyExam {
	public static void main(String[] args) {
		try {
			System.out.println("정상처리");
			
		} catch (Exception e) {
			System.out.println("예외발생 하지않음.");
		}finally {
			//프로그램 종료전 필수 실행해야하는 명령은
			//finally절에 기술
			System.out.println("종료전 반드시 실행");
		}
	}
}
