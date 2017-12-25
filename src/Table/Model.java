package Table;

import javax.swing.table.DefaultTableModel;
import javax.xml.soap.Text;

public class Model extends DefaultTableModel{
	
	
	private Model(Object[][]cells,String[] columnNames) {
		super(cells,columnNames);
	}
	
	public static Model getModelOject(String[] columnNames,Object[][]cells) {
		return new Model(cells,columnNames);
	}
	
	@Override
	public boolean isCellEditable(int rowIndex,int columnIndex) {
		return true;
	}
}
