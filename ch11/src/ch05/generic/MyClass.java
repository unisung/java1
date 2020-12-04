package ch05.generic;

public class MyClass<T> {
	T val;
	
	void set(T a) {
		val=a;
	}
	
	T get() {
		return val;
	}
}
