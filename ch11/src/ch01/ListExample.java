package ch01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample {
	public static void main(String[] args) {
		//List list = new List();
		//List list = new ArrayList();
		//List list = new LinkedList();
		List list = new Vector();
		
		//����Ʈ�� ��ü ���� add(��ü)
		list.add("ȫ�浿");
		list.add("������");
		list.add("ȫ�浿");
		list.add("�Ӳ���");
		
		//size() ����� ����� ����
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));//����� index��ȣ�� ��
		
		
	}
}
