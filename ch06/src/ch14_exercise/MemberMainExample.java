package ch14_exercise;

public class MemberMainExample {
	public static void main(String[] args) {
		Member m1=
		new Member("È«±æµ¿", "hong@naver.com");
		Member m2=
		new Member("ÀÏÁö¸Å", "ilji@naver.com");
		Member m3=
		new Member("ÀÓ²©Á¤", "im@naver.com");

		m1.info(); 
		m2.info();
		m3.info();
		
		Member.total();
		
		
		
	}

}
