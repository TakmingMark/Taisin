package Controller;

import java.util.ArrayList;

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
		readJSONToComboBox(view.getJobTitleComboBox(),leaveJSONModel.getJobTitleList());
		readJSONToComboBox(view.getFillInPeopleComboBox(), leaveJSONModel.getTeachNameList());
		readJSONToComboBox(view.getBusinessAgentComboBox(),leaveJSONModel.getTeachNameList());
		readJSONToComboBox(view.getLeaveStateComboBox(), leaveJSONModel.getLeaveStateList());
		readJSONToComboBox(view.getCourseAgentComboBox(), leaveJSONModel.getTeachNameList());
		readJSONToComboBox(view.getClassNameComboBox(), leaveJSONModel.getClassNameList());
		readJSONToComboBox(view.getClassTimeComboBox(), leaveJSONModel.getClassTimeList());
		readJSONToComboBox(view.getClassTeacherComboBox(), leaveJSONModel.getTeachNameList());
		readJSONToComboBox(view.getCourseNameComboBox(), leaveJSONModel.getCourseList());
	}
	
	private void initViewListener() {
		view.getEnterButton().addActionListener(e ->pressEnterButton());
		view.getInsertButton().addActionListener(e ->pressInsertButton());
		view.getFinishButton().addActionListener(e ->pressFinishButton());
	}
	
	private void readJSONToComboBox(JComboBox<String> jComboBox,ArrayList<String> arrayList) {
		for(String element:arrayList)
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
