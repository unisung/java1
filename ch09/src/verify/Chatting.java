package verify;

public class Chatting {
 void startChat(final String chatId) {
	 final String nickName=null;
	 //nickName=chatId;
	 Chat chat = new Chat() {
		 @Override
		 public void start() {
			 while(true) {
				 String inputData="�ȳ��ϼ���";
				 String message="["+nickName+"]"+inputData;
				 sendMessage(message);
			 }
		 }
	 };
 }
 
 class Chat{
	 void start() { }
	 void sendMessage(String message) {}
 }
}
