package verify;
import java.util.Scanner;//스캐너 java.util패키지의 Scanner API

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;//계속 진행 여부 확인 변수
		int studentNum = 0;//학생수 입력 변수
		int[] scores = null;//학생 점수 저장 배열
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4.분석 | 5. 종료 ");
			System.out.println("-------------------------------------------------------------");
			System.out.print("선택>");
			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				// 작성위치
  //작성위치
			System.out.println("학생수>");
			studentNum = scanner.nextInt();//스캐너로 학생수 입력받기
			scores =new int[studentNum];//입력받은 학생수로 1차원 배열 생성
		    //System.out.println(scores.length);//배열이 안 만들어젔으면 Nullpoint오류 발생
			} else if (selectNo == 2) {
			 		// 작성위치
			  if(scores==null) {
				  System.out.println("먼저 배열 생성 후 입력하세요!");
				  continue;
			  }
			  for(int i=0;i<scores.length;i++) {
				  System.out.println("score["+i+"]>");
				  scores[i]=scanner.nextInt();
			  }

			} else if (selectNo == 3) {
				// 작성위치
				int i=0;
				for(int s:scores) System.out.println("score["+i++ +"]:"+s);
			} else if (selectNo == 4) {
				// 작성위치
			 int max=0; int min=200;int sum=0; double avg=0.0;
			 for(int i=0;i<scores.length;i++)
				 if(max < scores[i]) max=scores[i];
			 
			 for(int i=0;i<scores.length;i++)
				 if(min > scores[i]) min=scores[i];
			 
			 for(int i=0;i<scores.length;i++)
				  sum+=scores[i];

			 //오름차순 정렬
			 int temp=0;//임시 저장 변수
			 for(int i=0;i<scores.length;i++)
				 for(int j=i+1;j<scores.length;j++) {
					  if(scores[i] < scores[j]) {//오름차순이면 왼쪽이 작은값이어야하는데 큰값이면 바꿔치기
						  temp=scores[i];
						  scores[i]=scores[j];
						  scores[j]=temp;
					  }
				 }
			  //오름차순 끝.
			 System.out.println("최고점수:"+max);
			 System.out.println("최고점수:"+scores[0]);
			 System.out.println("최저점수:"+min);
			 System.out.println("최저점수:"+scores[scores.length-1]);
			 System.out.println("평균점수:"+(double)sum/scores.length);
			 System.out.println("점수리스트:");
			 for(int i=0;i<scores.length;i++) {
				 System.out.println((i+1)+"등:"+scores[i]);
			 }
				 
			  
			} else if (selectNo == 5) {
				run = false;
			}
		}//while문 끝.
		System.out.println("프로그램 종료");
	}
}