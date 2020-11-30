package ch15_01;

public class Television {
	static String company="Samsong";
	static String model="LCD";
	static String info;
	
	//static 초기화 블럭 {}
	//인스턴스 맴버는 올수 없음,static맴버만 올수 있음.
	static {
		info=company+"-"+model;
	}

	@Override
	public String toString() {
		return "Television [info=" 
	            + info + "]";
	}
	
}
