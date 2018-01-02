package Table;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import org.apache.poi.ss.usermodel.CellType;

import Component.OutputLeaveDataComponent;
import Component.OutputLeaveDataComponent.AgentData;
import Component.TextContent;

public class TableModel extends DefaultTableModel{
	private int counter=0;
	private TableModel() {
		super(null,TextContent.columnNames);
		initTableModel();
	}
	
	public static TableModel getModelOject() {
		return new TableModel();
	}
	
	private void initTableModel() {
	}
	
	@Override
	public boolean isCellEditable(int rowIndex,int columnIndex) {
		return true;
	}
	
	@Override
	public void removeRow(int selectedRow) {
		counter--;
		super.removeRow(selectedRow);
	}
	
	public Class getColumnClass(int columnIndex) {
        return String.class;
	}
	
	public void insertLeftTopDataRow(OutputLeaveDataComponent outputLeaveDataComponent) {
		String jobTitle=outputLeaveDataComponent.getJobTitle();
		String leaveState=outputLeaveDataComponent.getLeaveState();
		String fillInPeople=outputLeaveDataComponent.getFillInPeople();
		String businessAgent=outputLeaveDataComponent.getBusinessAgent();
		String startCalendar=outputLeaveDataComponent.getStartCalendar();
		String endCalendar=outputLeaveDataComponent.getEndCalendar();
		String leaveCalendar=startCalendar+"¦Ü\n"+endCalendar+"¤î";
		String eventDescription=outputLeaveDataComponent.getEventDescription();
		this.setValueAt(jobTitle, counter, 0);
		this.setValueAt(leaveState, counter, 1);
		this.setValueAt(fillInPeople, counter, 2);
		this.setValueAt(businessAgent, counter, 3);
		this.setValueAt(leaveCalendar, counter, 4);
		this.setValueAt(eventDescription, counter, 5);
		
	}
	
	public void insertLeftButtomDataRow(OutputLeaveDataComponent outputLeaveDataComponent) {
		AgentData agentData=outputLeaveDataComponent.getAgentData().get(outputLeaveDataComponent.getAgentData().size()-1);
		String courseAgent=agentData.getCourseAgent();
		String classTeacher=agentData.getClassTeacher();
		String classTime=agentData.getClassTime();
		String className=agentData.getClassName();
		String courseName=agentData.getCourseName();
		
		this.setValueAt(courseAgent, counter, 6);
		this.setValueAt(classTeacher, counter, 7);
		this.setValueAt(classTime, counter, 8);
		this.setValueAt(className, counter, 9);
		this.setValueAt(courseName, counter, 10);
		counter++;
		this.addRow(new Object[]{null});
	}
	
	public ArrayList<ArrayList<String>> getTableDataArrayList() {
		ArrayList<ArrayList<String>> tableDataArrayList=new ArrayList<>();
		ArrayList<String> rowDataArrayList;
		for (int row = 0; row < this.getRowCount(); row++){
			rowDataArrayList=new ArrayList<>();
			for(int column=0;column<this.getColumnCount();column++) {
				if(this.getValueAt(row, column)==null) 
					rowDataArrayList.add(null);
				else
					rowDataArrayList.add(this.getValueAt(row, column).toString());	
			}	
			tableDataArrayList.add(rowDataArrayList);
			}
		return tableDataArrayList;
	}
	
	public void setTableDataArrayList(ArrayList<ArrayList<String>> tableDataArrayList) {	   
		if(tableDataArrayList!=null)
			for(ArrayList<String> rowDataArrayList:tableDataArrayList) 
				this.insertRow(this.getRowCount(),rowDataArrayList.toArray());
		counter=this.getRowCount();
		if(counter==0)
			this.addRow(new Object[]{null});
		else
			counter--;
	}
}
