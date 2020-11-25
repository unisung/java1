package ch05_new;

public class CopyExam2 extends CopyExam{
	//String job;
	//int seq;
	//double d;
	//속성확장(필드 추가)
    boolean ys;
    
	void method1() {
		System.out.println(seq+","+d);
	}
	//기능 확장(추가)
	void method2() {
		System.out.println(seq+","+ys);
	}
}
