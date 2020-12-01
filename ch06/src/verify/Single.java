package verify;

public class Single {
  private static Single instance;
  //생성자를 외부에서 호출할수 없도록 만들기
  private Single() {}
  
public static Single getInstance() {
	if(instance==null) new Single();
	return instance;
}
  

}
