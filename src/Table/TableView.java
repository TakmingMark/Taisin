package Table;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Component.MultiLineTableCellRenderer;

public class TableView extends JPanel{
	JTable table;
	MultiLineTableCellRenderer multiLineTableCellRenderer;
	private TableView() {
		initView();
	}
	
	public static TableView getViewObject() {
		return new TableView();
	}
	
	private void initView() {
		table=new JTable();
		multiLineTableCellRenderer=new MultiLineTableCellRenderer();
		table.setDefaultRenderer(String.class, multiLineTableCellRenderer);
		table.setRowHeight(table.getRowHeight() * 3);
		this.add(new JScrollPane(table));
	}
	
	public void setTableModel(TableModel model) {
		table.setModel(model);

		table.setPreferredScrollableViewportSize(new Dimension(790, 370));
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);
		table.getColumnModel().getColumn(2).setPreferredWidth(120);
		table.getColumnModel().getColumn(3).setPreferredWidth(150);
		table.getColumnModel().getColumn(4).setPreferredWidth(300);
		table.getColumnModel().getColumn(5).setPreferredWidth(400);
		table.getColumnModel().getColumn(6).setPreferredWidth(150);
		table.getColumnModel().getColumn(7).setPreferredWidth(80);
		table.getColumnModel().getColumn(8).setPreferredWidth(80);
		table.getColumnModel().getColumn(9).setPreferredWidth(80);
		table.getColumnModel().getColumn(10).setPreferredWidth(80);
		table.setFillsViewportHeight(true);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
	}

	public JTable getTable() {
		return table;
	}
}
