package ch14_exercise;

public class Member {
	//번호 자동발번용 static변수 선언
	static int seq;//int타입의 기본값 0으로 초기화
	
	//non-static맴버
	int sno;//0
	String name;//null
	String email;//null
	
	//(기본)생성자
	public Member(String name,String email) {
		sno=++seq;// 객체 생성될때마다 인스턴스변수sno에 증가된 seq값이 저장
		this.name=name;
		this.email=email;		
	}
	
	//인스턴별 실행하는 메소드 non-static메소드
	void info() {
		System.out.println("회원번호:"
	      +this.sno+",이름:"
	      +this.name+",email:"+this.email);
	}
	
	//static맴버
	static void total() {
		System.out.println("총회원수:"+seq);
	}
	
	
	
	
	
	

}
