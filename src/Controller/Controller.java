package Controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import org.json.simple.JSONObject;

import Calendar.CalendarController;
import Model.LeaveJSONModel;
import Model.Model;
import View.View;

public class Controller {
	private Model model;
	private LeaveJSONModel leaveJSONModel;
	private View view;
	
	private CalendarController calendarController=null;

	private Controller() {
	}
	
	public static Controller getControllerObject() {
		return new Controller();
	}
	
	public void initController() {
		initLeaveJSONToLayout();
		initViewListener();
	}
	
	
	private void initLeaveJSONToLayout() {
		readJSONToComboBox(view.getJobTitleComboBox(),model.getInputLeaveData().getJobTitle());
		readJSONToComboBox(view.getFillInPeopleComboBox(), model.getInputLeaveData().getTeacherName());
		readJSONToComboBox(view.getBusinessAgentComboBox(),model.getInputLeaveData().getTeacherName());
		readJSONToComboBox(view.getLeaveStateComboBox(), model.getInputLeaveData().getLeaveState());
		readJSONToComboBox(view.getCourseAgentComboBox(), model.getInputLeaveData().getTeacherName());
		readJSONToComboBox(view.getClassNameComboBox(), model.getInputLeaveData().getClassName());
		readJSONToComboBox(view.getClassTimeComboBox(), model.getInputLeaveData().getClassTime());
		readJSONToComboBox(view.getClassTeacherComboBox(), model.getInputLeaveData().getClassTeacherName());
		readJSONToComboBox(view.getCourseNameComboBox(), model.getInputLeaveData().getCourse());
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
		model.pressEnterButtonState(view.pressEnterButtonState(),calendarController.getCalendarJSON());
	}	
	
	private void pressInsertButton() {
		model.pressInsertButtonState(view.pressInsertButtonState());
	}

	private void pressFinishButton() {
		model.pressFinishButtonState();
	}
	
	public JSONObject getCalendar() {
		return calendarController.getCalendarJSON();
	}
	
	public void disableTopAndMiddlePanel() {
		calendarController.disableLayout();
		view.disableTopAndMiddlePanel();
	}
	
	public void enableTopAndMiddlePanel() {
		calendarController.enableLayout();
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
	
	public void setJSONModel(LeaveJSONModel leaveJSONModel) {
		this.leaveJSONModel = leaveJSONModel;
	}

	public void setView(View view) {
		this.view = view;
	}
	
	public void setCalendarController(CalendarController calendarController) {
		this.calendarController=calendarController;
	}
	
	public JPanel getCalendarView() {
		return calendarController.getCalendarView();
	}
}
