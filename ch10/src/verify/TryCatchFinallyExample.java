package verify;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		String[] strArray= {"10","2a"};
		int value=0;
		
		for(int i=0;i<=2;i++) {
			try {
				value=Integer.parseInt(strArray[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 오류");
			}catch(NumberFormatException e) {
				System.out.println("숫자오류");
			}finally {
				System.out.println(value);
			}
		}
	}
}
