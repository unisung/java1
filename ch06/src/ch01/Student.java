package ch01;

public class Student {
	//속성(필드)
	int seq;//this.seq는 이 seq필드를 가리킴
	String name;
	int kor;
	
	//기능(메소드)
	void setSeq(int seq) {
		this.seq=seq;//this 클래스로 부터 생성된 객체 자신을 가리키는 키워드
	}
	void setName(String name) {
		this.name=name;
	}
	void setKor(int kor) {
		this.kor=kor;
	}
	
	public String toString() {
		return seq+","+name+","+kor;
	}
}
