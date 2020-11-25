package ch04;

//캡슐화
public class Member {
	//속성-외부차단된 데이타 private
	private int sno;//회원번호
	private String name;//회원명
	private String jumin;//주민번호
	
	//기능-외부에 노출된 메소드-public
	public void setSno(int sno) {this.sno = sno;}
	public void setName(String name) {this.name = name;}
	public void setJumin(String jumin){this.jumin = jumin;}

	//기능-외부에 노출된 메소드-public
	public void getInfo(int grade) {
	   getGrade(grade);
	}
	
	//기능부분-외부에 차단된 메소드-private
   private void getGrade(int grade) {
	   if(grade==1)System.out.println(sno+","+name+","+jumin); 
	   else
		   System.out.println(sno);
   }
    
}
