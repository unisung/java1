package ch09;

public class SystemApiArrayCopyExample {
	public static void main(String[] args) {
		
		String[] oldStrArray= {"Java","array","copy"};
		String[] newStrArry = new String[5];
		
		/*
		for(int i=0;i<oldStrArray.length;i++) {
			newStrArry[i]=oldStrArray[i];
		}
		
		for(int i=0;i<newStrArry.length;i++)
			System.out.println(newStrArry[i]);
		*/
		//oldStrArry -> new StrArry로 복사
		//arraycopy(소스,소스의 시작index,목적,목적시작index,복사할갯수);
System.arraycopy(oldStrArray, 0, newStrArry, 0, oldStrArray.length);
  
	oldStrArray[0]="spring";
	System.out.println(newStrArry[0]);
	
for(int i=0;i<newStrArry.length;i++)
	System.out.println(newStrArry[i]);
	}

}
