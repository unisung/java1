package verify;

public class SingleMainExample {

	public static void main(String[] args) {
		//Single클래스의 생성자를 private로 막음.
		//Single s=new Single();
		Single s=Single.getInstance();

	}

}
