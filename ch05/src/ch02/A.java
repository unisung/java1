package ch02;

public class A/* extends Object */{
  int i=0;

@Override//부모클래스의 메소드를 재정의(자식클래스에 맞게 수정)
public boolean equals(Object obj) {
	return i==((A)obj).i;
}
 
  
  
}
