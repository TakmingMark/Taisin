package Leave;

import java.security.PrivilegedActionException;
import java.util.ArrayList;
import java.util.List;

import javax.management.loading.PrivateClassLoader;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import org.json.simple.JSONObject;

import Calendar.Calendar;
import Calendar.CalendarController;
import Component.Excel;
import Table.Table;

public class LeaveController {
	private LeaveModel model;
	private LeaveView view;
	
	private Calendar calendar;
	private Table table;
	private Excel excel;
	
	private LeaveController() {
	}
	
	public static LeaveController getControllerObject() {
		return new LeaveController();
	}
	
	public void initController() {
		initLeaveJSONToLayout();
		initViewListener();
		initExcelDataToTableView();
		enabledButtomPanel(false);
	}
	
	private void initLeaveJSONToLayout() {
		model.readJSONToComboBox(view.getJobTitleComboBox(),model.getInputLeaveData().getJobTitle());;
		model.readJSONToComboBox(view.getFillInPeopleComboBox(), model.getInputLeaveData().getEmployeeName());
		model.readJSONToComboBox(view.getBusinessAgentComboBox(),model.getInputLeaveData().getEmployeeName());
		model.readJSONToComboBox(view.getLeaveStateComboBox(), model.getInputLeaveData().getLeaveState());
		model.readJSONToComboBox(view.getCourseAgentComboBox(), model.getInputLeaveData().getEmployeeName());
		model.readJSONToComboBox(view.getClassNameComboBox(), model.getInputLeaveData().getClassName());
		model.readJSONToComboBox(view.getClassTimeComboBox(), model.getInputLeaveData().getClassTime());
		model.readJSONToComboBox(view.getClassTeacherComboBox(), model.getInputLeaveData().getClassTeacherName());
		model.readJSONToComboBox(view.getCourseNameComboBox(), model.getInputLeaveData().getCourseName());
	}
	
	private void initViewListener() {
		view.getEnterButton().addActionListener(e ->pressEnterButton());
		view.getInsertButton().addActionListener(e ->pressInsertButton());
		view.getFinishButton().addActionListener(e ->pressFinishButton());
		view.getJobTitleComboBox().addActionListener(e ->autoFillinPeopleComboBox());
		view.getFillInPeopleComboBox().addActionListener(e ->autoBusinessAgentComboBox());
		view.getClassNameComboBox().addActionListener(e ->autoClassTeacherComboBox());
	}
	
	private void initExcelDataToTableView() {
		table.getTableModel().setTableDataArrayList(excel.readExcel());
	}
	
	private void pressEnterButton() {
		model.pressEnterButtonState(view.pressEnterButtonState(),calendar.getCalendarViewJSON());
		enabledTopAndMiddlePanel(false);;
		enabledButtomPanel(true);
	}	
	
	private void pressInsertButton() {
		model.pressInsertButtonState(view.pressInsertButtonState());
		table.insertLeaveData(model.getOutputLeaveData());
	}

	private void pressFinishButton() {
		model.pressFinishButtonState();
		enabledTopAndMiddlePanel(true);
		enabledButtomPanel(false);
		excel.writeExcel(table.getTableModel().getTableDataArrayList());
	}
	
	private void autoFillinPeopleComboBox() {
		model.autoFillinPeopleComboBox(view.getFillInPeopleComboBox(),view.getJobTitleComboBox().getSelectedIndex());
	}
	
	private void autoBusinessAgentComboBox() {
		System.out.println("atuoBusinessAgent");
	}
	
	private void autoClassTeacherComboBox() {
		model.autoClassTeacherComboBox(view.getClassTeacherComboBox(), view.getClassNameComboBox().getSelectedIndex());
	}
	
	public JSONObject getCalendar() {
		return calendar.getCalendarViewJSON();
	}
	
	public void enabledTopAndMiddlePanel(boolean bool) {
		if(bool) {
			calendar.enabledLayout(true);
			view.enableLeftTopAndMiddlePanel();
		}
		else {
			calendar.enabledLayout(false);
			view.disableLeftTopAndMiddlePanel();
		}	
	}
	
	public void enabledButtomPanel(boolean bool) {
		
		view.enabledLeftButtomPanel(bool);
	}
	
	public void setModel(LeaveModel model) {
		this.model=model;
	}
	
	public void setView(LeaveView view) {
		this.view = view;
	}
	
	public void setCalendar(Calendar calendar) {
		this.calendar=calendar;
	}
	
	public JPanel getCalendarView() {
		return calendar.getCalendarView();
	}

	public Table getTable() {
		return table;
	}
	
	public JPanel getTableView() {
		return table.getTableView();
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public Excel getExcel() {
		return excel;
	}

	public void setExcel(Excel excel) {
		this.excel = excel;
	}
	
}
