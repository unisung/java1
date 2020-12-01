package ch20.r;

//맴버가 protected이면 동일 패키에서는 
//default접근제한자와 같은 성질
public class B {
 private int k;//접근불가(상속관계라도 접근불가)
 protected int n;
 protected void g() {
	 n=5;
	 k=9;//동일클래스내에서는 접근 가능
 }
}

//
class C{
	public void k() {
		B b =new B();//
		b.n=7;//동일패키지에서 접근가능
		b.g();//동일패키지에서 접근가능
	//	k=10;//동일패키지에서도 접근불가(private)
	}
}
