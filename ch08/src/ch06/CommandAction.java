package ch06;

public interface CommandAction {
	void action();
}
class WriteAction implements CommandAction{
	@Override
	public void action(){ 	System.out.println("글등록");	}
}
class ReadAction implements CommandAction{
	@Override
	public void action(){ System.out.println("상세보기"); }
}
class ListAction implements CommandAction{
	@Override
	public void action() { System.out.println("리스트보기"); }
}
class ReplyAction implements CommandAction{
	@Override
	public void action() { System.out.println("댓글작성"); }
}
class UpdateAction implements CommandAction{
	@Override
	public void action() { System.out.println("내용수정"); }
}
class DeleteAction implements CommandAction{
	@Override
	public void action() {	System.out.println("글 삭제");}
}