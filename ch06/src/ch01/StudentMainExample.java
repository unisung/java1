package ch01;

public class StudentMainExample {
	public static void main(String[] args) {
		//선언된 한 개의 클래스를 바탕으로 여러개의 객체를 생성할수 있음.
		//클래스는 속성만 표시됨.
		//Student객체 생성 - 객체는 속성에 실제 값들이 저장됨.
		Student s1=new Student();//객체 생성: new 클래스명();
		s1.setSeq(1);//객체가 참조하는 메소들 호출로 작업 처리-호출시 메세지 전달.
		s1.setName("홍길동");
		s1.setKor(88);
		
		System.out.println(s1.toString());
		
		Student s2=new Student();//객체 생성: new 클래스명();
		s2.setSeq(2);
		s2.setName("일지매");
		s2.setKor(90);
		
		Student s3=new Student();//객체 생성: new 클래스명();
		s3.setKor(3); s3.setName("임꺽정"); s3.setKor(75);

	}

}
