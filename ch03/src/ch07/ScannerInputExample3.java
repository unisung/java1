package ch07;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ScannerInputExample3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸을 분리하여입력하세요");
		
		//토큰단위가 아닌 라인 단위로 입력받는 메소드 nextLine();
		String str =scanner.nextLine();
		
		StringTokenizer st=new StringTokenizer(str);
		//추출하기
		String name=st.nextToken();

		String city=st.nextToken();

		int age=Integer.parseInt(st.nextToken());

		double weight=Double.parseDouble(st.nextToken());
		
		boolean single=Boolean.parseBoolean(st.nextToken());
		
		System.out.println("이름:"+name+",거주지:"
                +city+",나이:"+age+",몸무게:"
	            +weight+",독신여부:"+(single?"싱글":"기혼"));
    //자원해제
     scanner.close();
		
		
		

	}

}
