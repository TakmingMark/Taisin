package MVC;

import java.security.PrivilegedActionException;
import java.util.ArrayList;

import javax.management.loading.PrivateClassLoader;
import javax.swing.JComboBox;

import Calendar.CalendarJSONModel;
import Calendar.CalendarView;
import Model.LeaveJSONModel;
import Model.Model;
import View.View;

public class Controller {
	private LeaveJSONModel leaveJSONModel;
	private View view;
	
	private Controller() {
	}
	
	public static Controller getControllerObject() {
		return new Controller();
	}
	
	public void initController() {
		initLeaveJSONToLayout();
	}

	public void setJSONModel(LeaveJSONModel leaveJSONModel) {
		this.leaveJSONModel = leaveJSONModel;
	}

	public void setView(View view) {
		this.view = view;
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
	
	private void readJSONToComboBox(JComboBox<String> jComboBox,ArrayList<String> arrayList) {
		for(String element:arrayList)
			jComboBox.addItem(element);
	}
}
