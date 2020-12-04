package verify.ch04;

//public abstract class DatatAccessObject {
interface DatatAccessObject {
	void insert();//public
	void select(); 
	void update();
	void delete();
}

//class OracleDao extends DatatAccessObject{
class OracleDao implements DatatAccessObject{
	@Override
	public void insert() {
		System.out.println("OracleDB에서 입력");
	}
	@Override
	public void select() {
		System.out.println("OracleDB에서 검색");	
	}
	@Override
	public void update() {
		System.out.println("OracleDB에서 수정");	
	}

	@Override
	public void delete() {
		System.out.println("OracleDB에서 삭제");
	}
 }
//class MysqlDao extends DatatAccessObject{
class MysqlDao implements DatatAccessObject{
	@Override
	public void insert() {
		System.out.println("MysqlDB에서 입력");
	}
	@Override
	public void select() {
		System.out.println("MysqlDB에서 검색");	
	}
	@Override
	public void update() {
		System.out.println("MysqlDB에서 수정");	
	}

	@Override
	public void delete() {
		System.out.println("MysqlDB에서 삭제");
	}
	}