package ch10;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores= {95,71,84,93,87};
		
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			sum=sum+scores[i];
		}
		System.out.println("����:"+sum+",���:"+(double)sum/scores.length);
		
		sum=0;
		//���� for��
		for (int i : scores) {
			sum =sum+i;
		}
		System.out.println("����:"+sum+",���:"+(double)sum/scores.length);
		
	}

}
