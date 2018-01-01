package Table;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import javax.xml.soap.Text;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import Component.OutputLeaveDataComponent;
import Component.TextContent;
import Component.OutputLeaveDataComponent.AgentData;

public class TableModel extends DefaultTableModel{
	
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
		super.removeRow(selectedRow);
	}
	
	public Class getColumnClass(int columnIndex) {
        return String.class;
	}
	
	public void insertRow(OutputLeaveDataComponent outputLeaveDataComponent) {
		String jobTitle=outputLeaveDataComponent.getJobTitle();
		String leaveState=outputLeaveDataComponent.getLeaveState();
		String fillInPeople=outputLeaveDataComponent.getFillInPeople();
		String businessAgent=outputLeaveDataComponent.getBusinessAgent();
		String startCalendar=outputLeaveDataComponent.getStartCalendar();
		String endCalendar=outputLeaveDataComponent.getEndCalendar();
		String leaveCalendar=startCalendar+"¦Ü\n"+endCalendar+"¤î";
		String eventDescription=outputLeaveDataComponent.getEventDescription();
		AgentData agentData=outputLeaveDataComponent.getAgentData().get(outputLeaveDataComponent.getAgentData().size()-1);
		String courseAgent=agentData.getCourseAgent();
		String classTeacher=agentData.getClassTeacher();
		String classTime=agentData.getClassTime();
		String className=agentData.getClassName();
		String courseName=agentData.getCourseName();
		Object[] row= {jobTitle,leaveState,fillInPeople,businessAgent,leaveCalendar,eventDescription,
				courseAgent,classTeacher,classTime,className,courseName};
		
		this.insertRow(this.getRowCount(),row);
	}
	
	public ArrayList<ArrayList<String>> getTableDataArrayList() {
		ArrayList<ArrayList<String>> tableDataArrayList=new ArrayList<>();
		ArrayList<String> rowDataArrayList;
		for (int row = 0; row < this.getRowCount(); row++){
			rowDataArrayList=new ArrayList<>();
			for(int column=0;column<this.getColumnCount();column++)
				rowDataArrayList.add(this.getValueAt(row, column).toString());
			tableDataArrayList.add(rowDataArrayList);
			}
		return tableDataArrayList;
	}
	
	public void setTableDataArrayList(ArrayList<ArrayList<String>> tableDataArrayList) {	   
		for(ArrayList<String> rowDataArrayList:tableDataArrayList) {
			this.insertRow(this.getRowCount(),rowDataArrayList.toArray());
        }
	}
}
