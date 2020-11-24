package verify;

//4x+5y=60
// 1<= x <=10,  1<= y <=10
public class Exercise05 {
	public static void main(String[] args) {
		for(int x=1;x<=10;x++) {//  1<=  x <=10
			for(int y=1;y<=10;y++) { // 1<= y <=10
				if(4*x+5*y==60) {
				 System.out.println(x+","+y);
				}
			}//¾ÈÂÊfor
		}//¹Ù±ùfor
	}
}
