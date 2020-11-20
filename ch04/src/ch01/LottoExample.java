package ch01;

public class LottoExample {
	public static void main(String[] args) {
		//1~45
		int score;
		
		int count=0;
		while(true) {
			if(count==5) break;
			score=(int)(Math.random()*45)+1;
			System.out.println(score);
			count++;
		}
		
	}

}
