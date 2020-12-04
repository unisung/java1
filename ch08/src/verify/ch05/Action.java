package verify.ch05;

public interface Action {
  public void work();
}
class A implements Action{
	@Override
	public void work() {
	System.out.println("복사를 합니다.");
	}
}