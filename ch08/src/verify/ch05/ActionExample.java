package verify.ch05;

public class ActionExample {

	public static void main(String[] args) {
		Action actio =new A();
		Action action=new Action(){
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}};
		
		action.work();

	}

}
