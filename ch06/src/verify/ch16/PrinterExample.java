package verify.ch16;

public class PrinterExample {
	public static void main(String[] args) {

		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("ȫ�浿");
	}
}
//�޼ҵ� �����ε�
class Printer{
void println(int x) {System.out.println(x);}	
void println(boolean x) {System.out.println(x);}	
void println(double x) {System.out.println(x);}	
void println(String x) {System.out.println(x);}		
}