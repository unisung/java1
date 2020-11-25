package ch06;

public class MainExam {
	public static void main(String[] args) {
		Polygon p=new Polygon();
		  p.shape();	
		//부모타입클래스 참조변수에 자식타입 객체 대입가능 
		p = new Rectangle();
		p.shape();
		
	}
}
