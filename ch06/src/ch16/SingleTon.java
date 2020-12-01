package ch16;

public class SingleTon {
	//자신의 타입 필드 선언 및 초기화
	private static SingleTon instance=new SingleTon();
	//생성자를 외부에서 호출할수 없도록 캡슐화
	private SingleTon() {}
	//객체를 호출하는 메소드 선언
	public static SingleTon getInstance() {
		//if(instance==null) instance=new SingleTon();//Lazy init
		return instance;
	}
	
	
	

}
