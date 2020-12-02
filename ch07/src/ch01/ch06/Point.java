package ch01.ch06;

public class Point {
	private int x,y;//좌표//상속에서 제외,자식클래스에서 직접 접근불가
	public void set(int x, int y) {
		this.x=x; this.y=y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point{
	private String color;
	public void setColor(String color) {
		this.color=color;
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint();//부모클래스의 public 메소드 호출
	}
}

