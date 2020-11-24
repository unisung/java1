package ch06;

public class StringArgsExample {
	public static void main(String[] args) {
		String[] args1= {"hello","hi","goodbye"};
		System.out.println(args1.length);
		
		for(int i=0;i<args1.length;i++)
			System.out.println(args1[i]);//변수[인덱스번호]로 접근

	}

}
