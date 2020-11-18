package ch01;

public class DenyLogicOperationExample {
	public static void main(String[] args) {
		boolean play=true;
		System.out.println(play);
		
		play=!play;
		System.out.println(play);
		
		play=!play;
		System.out.println(play);
		
		int i=1;
		while(play) {
			System.out.println("let's play");
			if(i==5) play=!play;
			i++;
		}

	}

}
