package verify.ch18;

public class ShopServiceExample {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();

//참조변수가 가리키는 인스턴스의 주소가 같은지 비교
		if (obj1 == obj2) {
			System.out.println("같은 SingleTon 객체 입니다.");
		} else {
			System.out.println("다른 SingleTon 객체 입니다.");
		}
	}
}
//싱글톤
class ShopService{
	//자신타입의 필드
	private static ShopService instance=new ShopService();
	private ShopService() {}//생성자 접근 막기 private
	//객체는 getInstance로 제공
	public static ShopService getInstance() {
		return instance;
	}
	
	
	
}