package ch07;

public class ThreeConditionOperationExam2 {
	public static void main(String[] args) {
		int score=75;
		//조건?true:(조건?true:(조건?true:false));
		char grade=score>=90?'A':(score>=80?'B':(score>=70?'C':'F'));
		
		System.out.println("점수:"+score+", 학점:"+grade);
	}

}
