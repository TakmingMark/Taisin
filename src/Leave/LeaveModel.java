package Leave;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import Component.InputLeaveDataComponent;
import Component.OutputLeaveDataComponent;
import Component.TextContent;


public class LeaveModel {
	private InputLeaveDataComponent inputLeaveData;
	private OutputLeaveDataComponent outputLeaveData;
	private JSONObject leaveDataJSONObject;
	private JSONArray agentDataJSONArray;
	private Boolean isExit=true;
	private LeaveModel() {
		initLeaveModel();
	}
	
	public static LeaveModel getModelObject() {
		return new LeaveModel();
	}
	
	private void initLeaveModel() {
		agentDataJSONArray=new JSONArray();
		parseJSONFromLeaveFile();
	}
	
	private void parseJSONFromLeaveFile() {
		JsonReader bufferedReader = null;
		try {
			bufferedReader = new JsonReader
			(new BufferedReader(new InputStreamReader(
			new FileInputStream("json/leave.json"),"UTF-8")));
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			e.printStackTrace();
		}
		inputLeaveData= new Gson().fromJson(bufferedReader,InputLeaveDataComponent.class);
	}
	
	public LeaveModel readJSONToComboBox(JComboBox<String> jComboBox,List<String> list) {
		for(String element:list)
			jComboBox.addItem(element);
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public void pressEnterButtonState(JSONObject jsonObject,JSONObject calendarJSONobject) {
		this.leaveDataJSONObject=jsonObject;
		this.leaveDataJSONObject.putAll(calendarJSONobject);
		outputLeaveData= new Gson().fromJson(leaveDataJSONObject.toJSONString(), OutputLeaveDataComponent.class);
		isExit=false;
		System.out.println(isExit);
	}

	@SuppressWarnings("unchecked")
	public void pressInsertButtonState(JSONObject jsonObject) {
		this.agentDataJSONArray.add(jsonObject);
		leaveDataJSONObject.put("agentData", agentDataJSONArray);
		outputLeaveData= new Gson().fromJson(leaveDataJSONObject.toJSONString(), OutputLeaveDataComponent.class);
		clearJSONAndInitLayout();
	}
	
	@SuppressWarnings("unchecked")
	public void pressFinishButtonState() {
		clearJSONAndInitLayout();
		isExit=true;
	}
	
	public void pressExitButtonState(LeaveView leaveView) {
		System.out.println(isExit);
		if(isExit)
			System.exit(0);
		JOptionPane.showMessageDialog(leaveView.getFrame(), 
	            TextContent.exitTips, "Really Closing?", 
	            JOptionPane.WARNING_MESSAGE);   

	}
	
	public void autoFillinPeopleComboBox(JComboBox<String> fillInPeopleCombox,int selection) {
		int start=0;
		int end=0;
		switch (selection) {
		case 0:
			start=0;
			end=2;
			break;
		case 1:
			start=2;
			end=4;
			break;
		case 2:
			start=4;
			end=10;
			break;
		default:
			start=10;
			end=inputLeaveData.getEmployeeName().size();
			break;
		}
		fillInPeopleCombox.removeAllItems();
		for(int index=start;index<end;index++)
			fillInPeopleCombox.addItem(inputLeaveData.getEmployeeName().get(index));
	}
	
	public void autoClassTeacherComboBox(JComboBox<String> classTeacherCombox,int selection) {
		classTeacherCombox.setSelectedIndex(selection);
	}
	public void clearJSONAndInitLayout() {
		leaveDataJSONObject.clear();
		agentDataJSONArray.clear();
	}

	public InputLeaveDataComponent getInputLeaveData() {
		return inputLeaveData;
	}
	
	public OutputLeaveDataComponent getOutputLeaveData() {
		return outputLeaveData;
	}
}
