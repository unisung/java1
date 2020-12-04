package ch05.generic;

import java.util.ArrayList;
import java.util.List;

public class MyGenericMainEx {

	public static void main(String[] args) {
		//생성시 <>부분에 실체 클래스의 타입 적용
		//컴파일시 해당타입으로 변환 
	    MyClass<Integer> mc = new MyClass<Integer>();

	    MyClass<String> mc2 = new MyClass<String>();
	    
	    MyClass<Account> mc3 = new MyClass<Account>();
	    
	    List<Account> list = new ArrayList<Account>();
	}
}
class Account{}
/*
 //List객체의 메소드가 Account타입으로 컴파일시 변환
 Account Account[] toArray(Account[] a);
 */
/*
public class MyClass<Account> {
	Account val;
	
	void set(Account a) {
		val=a;
	}
	
	Account get() {
		return val;
	}
} 

 */
/*
public class MyClass<Integer> {
	Integer val;
	
	void set(Integer a) {
		val=a;
	}
	
	Integer get() {
		return val;
	}
}
 */
/*
public class MyClass<String> {
String val;

void set(String a) {
	val=a;
}

String get() {
	return val;
 }
} 
*/