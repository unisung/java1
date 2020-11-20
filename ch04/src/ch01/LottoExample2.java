package ch01;

import java.util.HashSet;
import java.util.Set;

public class LottoExample2 {
	public static void main(String[] args) {
		//1~45
		int score;
		Set set=new HashSet();
		
		while(set.size()<6) {
			score=(int)(Math.random()*45)+1;
			set.add(score);
		}
		
		System.out.println(set);
		
	}

}
