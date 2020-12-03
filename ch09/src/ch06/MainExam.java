package ch06;

public class MainExam {
	public static void main(String[] args) {
		Button button =new Button();
		
		button.setOnClickListener(new CllListener());
		button.touch();
		
		button.setOnClickListener(new MessageListener());
		button.touch();
		
	}

}
