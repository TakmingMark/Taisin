package Table;

public class Table extends TableController{
	private Table() {
		super();
	}
	
	public static Table getTableObject() {
		return new Table();
	}
}
