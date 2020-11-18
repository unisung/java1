package ch03;

//문자 리터럴
//문자한개의 값
public class LiteralExample3 {

	public static void main(String[] args) {
		//문자타입(char) 변수에 문자타입 리터럴 저장
		char a='A';
		char b='글';
		//특수문자 \다음오는 코드는 기능성문자이다.
		char c='\u0041';//unicode 0041에 해당하는 값 A가 저장
		char d='\uae00';//unicode ae00에 해당하는 값 글이 저장
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		char fName='\uD64D';//성
		char midName='\uAE38';//중간이름
		char lName='\uB3D9';//마지막이름
		
		System.out.println("성:"+fName);
		System.out.println("중간:"+midName);
		System.out.println("끝:"+lName);
		
		//문자리터럴로 생성한 문자 배열 을 arr변수에 저장
		char[] arr= {'\uD64D','\uAE38','\uB3D9'};//저장시{'홍','길','동'} 
		//문자배열을 이용하여 문자열객체를 생성
		String myName=new String(arr);
		
		System.out.println(myName);
		
		
	}
}
