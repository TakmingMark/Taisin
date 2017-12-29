package Leave;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import Component.InputLeaveDataComponent;
import Component.OutputLeaveDataComponent;


public class LeaveModel {
	private InputLeaveDataComponent inputLeaveData;
	private OutputLeaveDataComponent outputLeaveData;
	private JSONObject leaveDataJSONObject;
	private JSONArray agentDataJSONArray;
	
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
	
	@SuppressWarnings("unchecked")
	public void pressEnterButtonState(JSONObject jsonObject,JSONObject calendarJSONobject) {
		this.leaveDataJSONObject=jsonObject;
		this.leaveDataJSONObject.putAll(calendarJSONobject);
	}

	@SuppressWarnings("unchecked")
	public void pressInsertButtonState(JSONObject jsonObject) {
		this.agentDataJSONArray.add(jsonObject);
		leaveDataJSONObject.put("agentData", agentDataJSONArray);
		outputLeaveData= new Gson().fromJson(leaveDataJSONObject.toJSONString(), OutputLeaveDataComponent.class);
	}
	
	@SuppressWarnings("unchecked")
	public void pressFinishButtonState() {
		clearJSONAndInitLayout();
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
