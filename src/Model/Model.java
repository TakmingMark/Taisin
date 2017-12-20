package Model;

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
import component.InputLeaveDataComponent;
import component.OutputLeaveDataComponent;


public class Model {
	private InputLeaveDataComponent inputLeaveData;
	private List<OutputLeaveDataComponent> outputLeaveDataList;
	private JSONObject leaveDataJSONObject;
	private JSONArray agentDataJSONArray;
	
	private Model() {
		initModel();
	}
	
	public static Model getModelObject() {
		return new Model();
	}
	
	private void initModel() {
		agentDataJSONArray=new JSONArray();
		outputLeaveDataList=new LinkedList<>();
		parseJSONFromLeaveFile();
	}
	
	private void parseJSONFromLeaveFile() {
		JsonReader bufferedReader = null;
		try {
			bufferedReader = new JsonReader
			(new BufferedReader(new InputStreamReader(
			new FileInputStream("json/leave.json"),"UTF-8")));
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			// TODO Auto-generated catch block
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
	}
	
	@SuppressWarnings("unchecked")
	public void pressFinishButtonState() {
		leaveDataJSONObject.put("agentData", agentDataJSONArray);
		OutputLeaveDataComponent outputLeaveData= new Gson().fromJson(leaveDataJSONObject.toJSONString(), OutputLeaveDataComponent.class);
		outputLeaveDataList.add(outputLeaveData);
		clearJSONAndInitLayout();
	}
	
	public void clearJSONAndInitLayout() {
		leaveDataJSONObject.clear();
		agentDataJSONArray.clear();
	}

	public InputLeaveDataComponent getInputLeaveData() {
		return inputLeaveData;
	}
	
}
