package verify;

//최대값 구하기
public class Exercise07{
	 public static void main(String[] args){

	 int max=0;

	int[] array={1,5,3,8,2};

	 //작성 위치
	 for(int i=0;i<array.length;i++) {
		//최대값이야하는 값이 배열의 요소값보다 작으면 max에 저장하여 max값을 크게.
		 if(max < array[i]) max=array[i];
	 }

	 System.out.println("max: "+ max);
	}

	}
