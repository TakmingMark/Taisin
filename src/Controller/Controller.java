package Controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import org.json.simple.JSONObject;

import Calendar.Calendar;
import Calendar.CalendarController;

import Model.Model;
import View.View;

public class Controller {
	private Model model;
	private View view;
	
	private Calendar calendar=null;

	private Controller() {
	}
	
	public static Controller getControllerObject() {
		return new Controller();
	}
	
	public void initController() {
		initLeaveJSONToLayout();
		initViewListener();
		disableButtomPanel();
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
		model.pressEnterButtonState(view.pressEnterButtonState(),calendar.getCalendarJSON());
		disableTopAndMiddlePanel();
		enableButtomPanel();
	}	
	
	private void pressInsertButton() {
		model.pressInsertButtonState(view.pressInsertButtonState());
		
	}

	private void pressFinishButton() {
		model.pressFinishButtonState();
		enableTopAndMiddlePanel();
		disableButtomPanel();
	}
	
	public JSONObject getCalendar() {
		return calendar.getCalendarJSON();
	}
	
	public void disableTopAndMiddlePanel() {
		calendar.disableLayout();
		view.disableTopAndMiddlePanel();
	}
	
	public void enableTopAndMiddlePanel() {
		calendar.enableLayout();
		view.enableTopAndMiddlePanel();
		
	}
	
	public void disableButtomPanel() {
		view.disableButtomPanel();
	}
	
	public void enableButtomPanel() {
		view.enableButtomPanel();
	}
	
	public void setModel(Model model) {
		this.model=model;
	}
	

	public void setView(View view) {
		this.view = view;
	}
	
	public void setCalendar(Calendar calendar) {
		this.calendar=calendar;
	}
	
	public JPanel getCalendarView() {
		return calendar.getCalendarView();
	}
}
