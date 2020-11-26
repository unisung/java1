package ch15;

public class Television {
	static String company="Samsong";
	static String model="LCD";
	String info;
	
	//초기화 블럭 {}
	//인스턴스 맴버,static맴버 둘다 올수 있음.
	{
		info=company+"-"+model;
	}

	@Override
	public String toString() {
		return "Television [info=" 
	            + info + "]";
	}
	
	
}
