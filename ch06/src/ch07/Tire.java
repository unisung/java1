package ch07;

//인터페이스 구현체들은 자식클래스로 사용됨, 인터페이스 참조변수에 대입가능
public interface Tire {}
class HankookTire implements Tire{}
class KumhoTire implements Tire{}