package ch03;
//리터러로 사용되는 문자중 \로 시작하는 문자는 특수기능
public class LiteralExampleEscapeExample {

	public static void main(String[] args) {
		//이중 인용부호 사용시 \"로 사용
		String st1="홍길등은 \"안녕하세요\"라고 말했다";
		System.out.println(st1);
		//단일 인용부호 사용시 \'로 사용
		String str2="\'java\'는 재밌다";
		System.out.println(str2);
		
		//백스페이스 \b
		String str3="앞으로 갔다가\b  뒤로 한칸 간다.";
		System.out.println(str3);
		
		//다음줄 \r, \n, \r\n
		String str4="다음줄로 이동 \r\n 다음줄출력";
		System.out.println(str4);
        
		//탭만큼 공백 \t
		String str5="탭 폭만큼\t 건너뛰기";
		System.out.println(str5);
		
		// \문자 표시 \\
		String str6="c:\\temp";
		System.out.println(str6);
	}

}
