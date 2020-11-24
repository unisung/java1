package ch06;
//실행시 java Calc 10 - 20
public class Calc {
	//main메소드의 매개변수 String[] args는
	//길이가 정해져있지않은 배열, 명령프롬프터에서 실행시 아규먼트입력할때 
	//배열로 생성되어져 main() 메소드로 전달됨.
	// java Calc 10 + 20 
	public static void main(String[] args) {//["10"]["-"]["20"]
		if(args.length>=3) {
			switch(args[1]) {
			case "+": System.out.println(
					  Integer.parseInt(args[0])+Integer.parseInt(args[2]));
			          break;
			case "-":
				System.out.println(
						  Integer.parseInt(args[0])-Integer.parseInt(args[2]));
				break;
			case "x":
				System.out.println(
						  Integer.parseInt(args[0])*Integer.parseInt(args[2]));
				break;
			}
		}
		
	}

}
