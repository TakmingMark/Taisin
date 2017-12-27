package Table;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.security.KeyStore.PrivateKeyEntry;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import Component.OutputLeaveDataComponent;
import Component.OutputLeaveDataComponent.AgentData;
import Component.TextContent;

public class Table extends TableController{
	
	private String[] columnNames=TextContent.columnNames;
	private Object[] row;
	private Table() {
		initTable();
	}
	
	public static Table getTableObject() {
		return new Table();
	}
	
	private void initTable() {
		TableView view=TableView.getViewObject();
		TableModel model=TableModel.getModelOject(columnNames);
		
		this.setView(view);
		this.setModel(model);

		view.setTableModell(this.getModel());
		
		int condition = JComponent.WHEN_FOCUSED;
		InputMap inputMap = view.getTable().getInputMap(condition);
		ActionMap actionMap = view.getTable().getActionMap();

		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0), TextContent.DELETE);
		actionMap.put( TextContent.DELETE, new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				int seletedRow=view.getTable().getSelectedRow();
				System.out.println(seletedRow);
				if(seletedRow!=-1)
					model.removeRow(seletedRow);
			}
		});
	}
	
	public void insertLeaveData(OutputLeaveDataComponent outputLeaveDataComponent) {
		this.getModel().insertRow(outputLeaveDataComponent);
	}
}
