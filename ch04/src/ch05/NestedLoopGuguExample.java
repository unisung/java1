package ch05;

public class NestedLoopGuguExample {
	public static void main(String[] args) {
	  for(int i=1;i<10;i++) {
		  for(int j=1;j<10;j++) {//안쪽for문의 반복횟수=바깥쪽범위*안쪽범위
			  System.out.print(i+"x"+j+"="+i*j+"\t");
		  }//안쪽 for문 블럭
		  System.out.println();//공백출력후 한줄 아래로 내리기
	  }//바깥쪽 for문 블럭
	}
}
