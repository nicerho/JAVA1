package sec02.exam04;

public interface DataAccessObject {

	void select();

	void insert();

	void update();

	void delete();
}

class OracleDao implements DataAccessObject {

	public void select() {
		System.out.println("OracleDB에서 검색");
	}

	public void insert() {
		System.out.println("OracleDB에서 삽입");
	}

	public void update() {
		System.out.println("OracleDB에서 수정");
	}

	public void delete() {
		System.out.println("OracleDB에서 삭제");
	}

}

class MysqlDao implements DataAccessObject {

	public void select() {
		System.out.println("MysqlDB에서 검색");
	}

	public void insert() {
		System.out.println("MysqlDB에서 삽입");
	}

	public void update() {
		System.out.println("MysqlDB에서 수정");
	}

	public void delete() {
		System.out.println("MysqlDB에서 삭제");
	}

}
