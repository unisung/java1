package ch11_01;

public class MemberMainExample {

	public static void main(String[] args) {
		Member defaultMember = new Member();
		System.out.println(defaultMember.name+","
		                   +defaultMember.age+","+defaultMember.address);
		
		Member gildong=new Member("길동", 14, "서울시");
		Member iljimae=new Member("일지매", 20, "수원시", "ilji@naver.com");
		iljimae.phone="010-111-1234";
		Member kkokjung=new Member("꺽정", 25,"서울시", "kk@naver.com","010-3297-0000");

	}

}
