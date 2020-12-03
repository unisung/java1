package ch07.ch02;

public class MainExam {
	public static void main(String[] args) {
		Button button =new Button();
		
		button.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("전화를 겁니다.");
			}
		});
		button.touch();
		
		button.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
			 System.out.println("메세지를 보냅니다.");
			}
		});
		
		button.touch();
		
	}

}
