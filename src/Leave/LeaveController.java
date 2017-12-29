package Leave;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import org.json.simple.JSONObject;

import Calendar.Calendar;
import Calendar.CalendarController;
import Table.Table;

public class LeaveController {
	private LeaveModel model;
	private LeaveView view;
	
	private Calendar calendar;
	private Table table;
	
	private LeaveController() {
	}
	
	public static LeaveController getControllerObject() {
		return new LeaveController();
	}
	
	public void initController() {
		initLeaveJSONToLayout();
		initViewListener();
		enabledButtomPanel(false);
	}
	
	private void initLeaveJSONToLayout() {
		readJSONToComboBox(view.getJobTitleComboBox(),model.getInputLeaveData().getJobTitle());;
		readJSONToComboBox(view.getFillInPeopleComboBox(), model.getInputLeaveData().getEmployeeName());
		readJSONToComboBox(view.getBusinessAgentComboBox(),model.getInputLeaveData().getEmployeeName());
		readJSONToComboBox(view.getLeaveStateComboBox(), model.getInputLeaveData().getLeaveState());
		readJSONToComboBox(view.getCourseAgentComboBox(), model.getInputLeaveData().getEmployeeName());
		readJSONToComboBox(view.getClassNameComboBox(), model.getInputLeaveData().getClassName());
		readJSONToComboBox(view.getClassTimeComboBox(), model.getInputLeaveData().getClassTime());
		readJSONToComboBox(view.getClassTeacherComboBox(), model.getInputLeaveData().getClassTeacherName());
		readJSONToComboBox(view.getCourseNameComboBox(), model.getInputLeaveData().getCourseName());
	}
	
	private void initViewListener() {
		view.getEnterButton().addActionListener(e ->pressEnterButton());
		view.getInsertButton().addActionListener(e ->pressInsertButton());
		view.getFinishButton().addActionListener(e ->pressFinishButton());
	}
	
	private void readJSONToComboBox(JComboBox<String> jComboBox,List<String> list) {
		for(String element:list)
			jComboBox.addItem(element);
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
	
}
