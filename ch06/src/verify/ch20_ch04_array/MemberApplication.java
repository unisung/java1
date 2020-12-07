package verify.ch20_ch04_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberApplication {
	//���̰� ����, null����Ȯ�� ����
	private static List<Member> memberArray = new ArrayList<Member>();
	private static Scanner scanner = new Scanner(System.in);
	
 public static void main(String[] args){
	  boolean run=true;
	while(run){
	    printMenu();
	   int selectNo = scanner.nextInt();
	if(selectNo==1){
	  createMember();
	}else if(selectNo==2){
	  memberList();
	}else if(selectNo==3){
	 deposit();
	}else if(selectNo==4){
	 withdraw();
	}else if(selectNo==5){
	  changePassword();
	}else if(selectNo==6){
		  run=false;
	}
	}
	System.out.println("���α׷� ����");
	}
 
 //��� �����ϱ�
private static void changePassword() {
	String id=null;
	 //id�Է�
	 System.out.println("id>");
	   id=scanner.next();
	   Member member = findMember(id);
	   
      if(member!=null) {
    	 do {
    		//ȸ����й�ȣ
    		  System.out.println("��й�ȣ>");
    		  String password=scanner.next();
    		  if(password.equals(member.getPassword())) {
    			  System.out.println("������ ��й�ȣ>");
        		  String newPassword=scanner.next();
        		  member.setPassword(newPassword);
        		  System.out.println("��й�ȣ�� ����Ǿ����ϴ�.");
        		  break;
    		  }else {
    			  System.out.println("��������� �ƴմϴ�.");
    		  }
    	 }while(true);
      }
}

//ȸ�� �����ϱ�
private static void createMember() {
		String id=null;
		//ȸ��id
		do {  
			//id�Է�
		     System.out.println("id>");
		     id=scanner.next();
		     if(findMember(id)!=null)
		    	 System.out.println("�̹� �����ϴ� id�Դϴ�.");
		     else
		    	 break;
		  }while(true); 
		
		//ȸ����й�ȣ
		  System.out.println("��й�ȣ>");
		  String password=scanner.next();
	 
		//ȸ���̸�
		  System.out.println("�̸�>");
		  String name=scanner.next();
	     //ȸ���߰�
		  memberArray.add(new Member(id, password, name));
}
	//ȸ������Ʈ ����
	private static void memberList() {
	 //�ۼ���ġ
		for(Member m:memberArray) {
	    	  System.out.println(m);
	    }
	}

	//����Ʈ ����
	private static void deposit(){
	  //ȸ�� ã��		
		  System.out.println("id>"); 
		  String id=scanner.next(); //�԰�
		  System.out.println("��������Ʈ>"); 
		  double point =scanner.nextDouble();
		  Member member=findMember(id);
		  if(findMember(id)!=null) {
		     member.setPoint(member.getPoint()+point); 
		  }else { 
			 System.out.println("�ش� ȸ���� �����ϴ�."); 
		 }
	}

	//����Ʈ ����
	private static void withdraw(){
		//ȸ�� ã��		
		  System.out.println("id>"); 
		  String id=scanner.next(); //�԰�
		  System.out.println("��������Ʈ>"); 
		  double point =scanner.nextDouble();
		  Member member=findMember(id);
		  if(findMember(id)!=null) {
			  if(member.getPoint() - point<0) {
				  System.out.println("����Ʈ�� �����Ҽ� �����ϴ�.");
			  }else {
		         member.setPoint(member.getPoint() - point);
			  }
		  }else { 
			 System.out.println("�ش� ȸ���� �����ϴ�."); 
		 }
	}

	
	
	  //StockArray �迭���� itemCode�� ������ Item ��ü ã��
	private static Member findMember(String id){
      for(Member member:memberArray) {
    		  if(member.getId().equals(id)) return member;
      }
	 //�ۼ���ġ
      return null;
	}	
	
	//�޴����
  static void printMenu() {
	System.out.println("------------------------------------------------------");
	System.out.println("1.ȸ����� | 2.ȸ����� | 3.����Ʈ����| 4.����Ʈ����|5.������� | 6.����");
	System.out.println("------------------------------------------------------");
  }

	 
}
