package ch10;

public class AdvancedForExample5 {
	public static void main(String[] args) {
		String[] sArr = { "홍길동", "일지매", "임꺽정" };

		for (int i = 0; i < sArr.length; i++)
			System.out.println(sArr[i]);

		// 향상된 for문으로 출력해보세요
		for (String s : sArr) {
			System.out.println(s);
		}
		
		//향상된 for문 내의 연산
		int[] intArr= {1,2,3,4,5,6,7};
		int sum=0;
		for(int i:intArr) {
			sum+=i;
		}
		System.out.println("합계:"+sum);
		
	}
}
