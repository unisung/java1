package ch02;

public class StringExample {

	public static void main(String[] args) {
		String name1="신용권";
		String name2="신용권";
		String name3=new String("신용권");
		
		//번지비교
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name3));
		
		//내용비교
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
	    System.out.println(name1.hashCode());
	    System.out.println(name3.hashCode());
		

	}

}
