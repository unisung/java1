package ch16;

public class SingleTonMainExample {

	public static void main(String[] args) {
		//생성자 호출로 객체 생성 불가
		/* SingleTon obj1 = new SingleTon();
		 SingleTon obj2 = new SingleTon(); */
		
		//외부에서 접근가능한 public 접근자의 getInstance()메소드로 접근
		SingleTon obj1 = SingleTon.getInstance();
		SingleTon obj2 = SingleTon.getInstance();
		
		//참조변수가 가리키는 인스턴스의 주소가 같은지 비교
		if(obj1==obj2) {
			System.out.println("같은 SingleTon 객체 입니다.");
		}else {
			System.out.println("다른 SingleTon 객체 입니다.");
		}

	}

}
