package ch06;
public class CllListener implements Button.OnClickListener{
	@Override
	public void onClick() {
	System.out.println("전화를 겁니다.");
	}
	
	//메소드추가
	public void method() {
		System.out.println("추가된메소드");
	}
}
