package ch06;

public class Button {
	OnClickListener listener;
	
	//메소드의 매개변수 - 다형성
	void setOnClickListener(OnClickListener listener) {
		this.listener=listener;
	}
	
	void touch() {
		listener.onClick();//구현 객체의 onClick() 메소드 호출
	    //listener.method();-부모타입에 없던 메소드는 접근 불가
	}
	//내부 인터페이스 선언
	interface OnClickListener{
		void onClick();
	}
}
