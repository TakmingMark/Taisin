package Table;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

import Component.OutputLeaveDataComponent;
import Component.TextContent;

public class TableController {
	private TableView tableView;
	private TableModel tableModel;

	protected TableController() {
		initTableController();
		initKeyBinding();
	}
	
	public static TableController getTableControllerObject() {
		return new TableController();
	}
	
	private void initTableController() {
		tableView=TableView.getViewObject();
		tableModel=TableModel.getModelOject();
		
		this.setTableView(tableView);
		this.setTableModel(tableModel);

		tableView.setTableModel(this.getTableModel());
	}
	
	public void initKeyBinding() {
		int condition = JComponent.WHEN_FOCUSED;
		InputMap inputMap = tableView.getTable().getInputMap(condition);
		ActionMap actionMap = tableView.getTable().getActionMap();

		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0), TextContent.DELETE);
		actionMap.put( TextContent.DELETE, new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				int seletedRow=tableView.getTable().getSelectedRow();
				System.out.println(seletedRow);
				if(seletedRow!=-1)
					tableModel.removeRow(seletedRow);
			}
		});
	}
	
	public void insertLeaveData(OutputLeaveDataComponent outputLeaveDataComponent) {
		this.getTableModel().insertRow(outputLeaveDataComponent);
	}
	
	public TableView getTableView() {
		return tableView;
	}

	public TableModel getTableModel() {
		return tableModel;
	}

	public void setTableView(TableView tableView) {
		this.tableView = tableView;
	}
	
	public void setTableModel(TableModel tableModel) {
		this.tableModel = tableModel;
	}
}
