package MVC;

import java.util.ArrayList;

import javax.swing.JComboBox;

import Model.JsonModel;
import Model.Model;
import View.View;

public class Controller {
	private JsonModel jsonModel;
	private View view;
	
	private Controller() {
	}
	
	public static Controller getControllerObject() {
		return new Controller();
	}
	
	public void initController() {
		initJsonToLayout();
	}

	public void setJsonModel(JsonModel jsonModel) {
		this.jsonModel = jsonModel;
	}

	public void setView(View view) {
		this.view = view;
	}
	
	private void initJsonToLayout() {
		readJsonToComboBox(view.getJobTitleComboBox(),jsonModel.getJobTitleList());
		readJsonToComboBox(view.getFillInPeopleComboBox(), jsonModel.getTeachNameList());
		readJsonToComboBox(view.getBusinessAgentComboBox(),jsonModel.getTeachNameList());
		readJsonToComboBox(view.getLeaveStateComboBox(), jsonModel.getLeaveStateList());
		readJsonToComboBox(view.getCourseAgentComboBox(), jsonModel.getTeachNameList());
		readJsonToComboBox(view.getClassNameComboBox(), jsonModel.getClassNameList());
		readJsonToComboBox(view.getClassTimeComboBox(), jsonModel.getClassTimeList());
		readJsonToComboBox(view.getClassTeacherComboBox(), jsonModel.getTeachNameList());
		readJsonToComboBox(view.getCourseNameComboBox(), jsonModel.getCourseList());
	}
	
	private void readJsonToComboBox(JComboBox<String> jComboBox,ArrayList<String> arrayList) {
		for(String element:arrayList)
			jComboBox.addItem(element);
	}
}
