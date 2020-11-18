package ch02;

import java.util.Date;

public class ArithmaticOpExample3 {

	public static void main(String[] args) {
		int time=5000;
		
		int second=time%60;//초
		int minute=(time/60)%60;//분
		int hour =(time/60)/60;//시간
		
		System.out.println(time+"초는");
		System.out.println(hour+"시간,");
		System.out.println(minute+"분,");
		System.out.println(second+"초입니다.");
		
		//날짜정보api를 이용하여  날짜출력
		Date now =new Date();
		System.out.println(now);
		System.out.println(now.getTime());//1970,1,1,0시이후의 밀리세컨드초 값 

	}

}
