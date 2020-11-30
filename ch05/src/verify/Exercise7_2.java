package verify;

//최대값 구하기
public class Exercise7_2{
	 public static void main(String[] args){

	 int min=100;

	int[] array={1,5,3,8,2};

	 //작성 위치
	 for(int i=0;i<array.length;i++) {
		//최소값이야하는 값이 배열의 요소값보다 크면 min에 요소값을 저장하여 min값을 작게 만듦.
		 if(min > array[i]) min=array[i];
	 }

	 System.out.println("min: "+ min);
	}

	}
