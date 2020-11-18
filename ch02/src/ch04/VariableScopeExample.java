package ch04;
//변수는 선언된 블럭내에서만 사용가능
public class VariableScopeExample {

	public static void main(String[] args) {
		int var1=0;
		
		if(true) {
			int var2=0;
			System.out.println(var1);
			System.out.println(var2);
		}
		System.out.println(var1);
		//main메소드보다 아래의 if블럭내에서 선언된 변수는 if블럭을 벗어나면 사용불가
		//System.out.println(var2);
		
		for(int i=0;i<5;i++) {
			int var3=0;
			System.out.println(var1);//상위레벨의 var1은 사용가능
			System.out.println(var3);
			//동일 레벨의 다른 블럭에서 사용하던 var2는 사용불가
			//System.out.println(var2);
		}
		
		System.out.println(var1);//사용가능
	//System.out.pritln(var3);//하위레벨의 블럭에서 선언한 var3블 블럭을 벗어나 사용불가
		

	}

}
