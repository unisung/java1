package verify;

public class Exercise01 {
	int field;//�ν��Ͻ� �ʵ�
	class B{
		void method() {
		field=10;
		}
	}//�ν��Ͻ� �ɹ�
	static class C{
		void method() {
		//	field=2;//static�ɹ������� �ܺ� instance���ٺҰ�
		}
		
	}//static�ɹ�
	
public static void main(String[] args) {
	//�ν��Ͻ��ɹ� Ŭ���� ���� 
	Exercise01  a=new Exercise01();
	//�ܺΰ�ü ���� �� ����
	Exercise01.B b=a.new B();
	
	//static�ɹ� Ŭ���� ����
	//�ܺΰ�ü ���� ���� �ܺ�Ŭ������.����Ŭ������();
	Exercise01.C c=new Exercise01.C();
	
}
}
