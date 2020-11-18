package ch02;

public class ArithmaticOpExample2 {

	public static void main(String[] args) {
		//ÀÚ¿¬¼öÀÇ °ª Â¦¼ö /È¦¼ö ¿©ºÎ È®ÀÎÇÏ±â
	/*	for(int i=1;i<=100;i++) {
			if(i%2==0)System.out.println(i+"´Â Â¦¼ö");
			else System.out.println(i+"´Â È¦¼ö");
		}
  */
	/*	for(int i=10;i<100;i++) {
			if(i/10%2==0)System.out.println(i+"ÀÇ ½ÊÀÚ¸®´Â Â¦¼ö");
			if((i%10)%2==0) System.out.println(i+"ÀÇ ÀÏÀÇÀÚ¸®´Â Â¦¼ö");
		}
	*/	
		for(int i=1;i<100;i++) {
			String str="";
			if(i/10%3==0 & i>10 ) str="Â¦";
			if((i%10)%3==0 & (i%10)!=0)str=str+"Â¦";//"Â¦Â¦"
			System.out.println(i+":"+str);
		}
	}

}
