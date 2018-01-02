package Leave;

import java.awt.event.WindowAdapter;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.synth.SynthSeparatorUI;

import org.json.simple.JSONObject;

import Calendar.Calendar;
import Component.Excel;
import Component.ListenerBuilder;
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
		enabledLeftButtomPanel(false);
	}
	
	private void initLeaveJSONToLayout() {
		model.readJSONToComboBox(view.getJobTitleComboBox(),model.getInputLeaveData().getJobTitle())
			.readJSONToComboBox(view.getFillInPeopleComboBox(), model.getInputLeaveData().getEmployeeName())
			.readJSONToComboBox(view.getBusinessAgentComboBox(),model.getInputLeaveData().getEmployeeName())
			.readJSONToComboBox(view.getLeaveStateComboBox(), model.getInputLeaveData().getLeaveState())
			.readJSONToComboBox(view.getCourseAgentComboBox(), model.getInputLeaveData().getEmployeeName())
			.readJSONToComboBox(view.getClassNameComboBox(), model.getInputLeaveData().getClassName())
			.readJSONToComboBox(view.getClassTimeComboBox(), model.getInputLeaveData().getClassTime())
			.readJSONToComboBox(view.getClassTeacherComboBox(), model.getInputLeaveData().getClassTeacherName())
			.readJSONToComboBox(view.getCourseNameComboBox(), model.getInputLeaveData().getCourseName());
	}
	
	private void initViewListener() {
		view.getFrame().addWindowListener(new ListenerBuilder()
			    .сlosing(e ->pressExitButton())
			    .build());
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
	
	private void pressExitButton() {
		model.pressExitButtonState(view);
	}
	
	private void pressEnterButton() {
		model.pressEnterButtonState(view.pressEnterButtonState(),calendar.getCalendarViewJSON());
		table.insertLeftTopDataRow(model.getOutputLeaveData());
		enabledLeftTopAndMiddlePanel(false);
		enabledLeftButtomPanel(true);
		writeExcel();
	}	
	
	private void pressInsertButton() {
		model.pressInsertButtonState(view.pressInsertButtonState());
		table.insertLeftButtomDataRow(model.getOutputLeaveData());
		enabledFinishButton(true);
		writeExcel();
	}

	private void pressFinishButton() {
		model.pressFinishButtonState();
		enabledLeftTopAndMiddlePanel(true);
		enabledLeftButtomPanel(false);
		enabledFinishButton(false);
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
	
	public void writeExcel() {
		excel.writeExcel(table.getTableModel().getTableDataArrayList());
	}
	public JSONObject getCalendar() {
		return calendar.getCalendarViewJSON();
	}
	
	public void enabledLeftTopAndMiddlePanel(boolean bool) {
		if(bool) {
			calendar.enabledLayout(bool);
			view.enabledLeftTopAndMiddlePanel(bool);
		}
		else {
			calendar.enabledLayout(bool);
			view.enabledLeftTopAndMiddlePanel(bool);
		}	
	}
	
	public void enabledLeftButtomPanel(boolean bool) {
		view.enabledLeftButtomPanel(bool);
	}
	
	public void enabledFinishButton(boolean bool) {
		view.enabledFinishButton(bool);
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
