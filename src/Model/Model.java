package Model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import Controller.Controller;
import component.InputLeaveDataFormat;

public class Model {
	private InputLeaveDataFormat inputLeaveData;
	private JSONObject jsonObject;
	private JSONArray jsonArray;

	private Model() {
		initModel();
	}
	
	public static Model getModelObject() {
		return new Model();
	}
	
	private void initModel() {
		jsonArray=new JSONArray();
	}
	
	private void parseLeaveJSONFile() {
		try {
			JsonReader bufferedReader = new JsonReader
					(new BufferedReader(new InputStreamReader(
		            new FileInputStream("json/leave.json"),"UTF-8")));

			inputLeaveData= new Gson().fromJson(bufferedReader,InputLeaveDataFormat.class);
					new ArrayList<InputLeaveDataFormat>();
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public InputLeaveDataFormat getInputLeaveData() {
		return inputLeaveData;
	}

	public void pressEnterButtonState(JSONObject jsonObject,JSONObject calendarJSONobject) {
		this.jsonObject=jsonObject;
		this.jsonObject.putAll(calendarJSONobject);
	}

	public void pressInsertButtonState(JSONObject jsonObject) {
		this.jsonArray.add(jsonObject);
	}
	public void pressFinishButtonState() {
		jsonObject.put("agentData", jsonArray);
		
		System.out.println(jsonObject);
		clearJSONAndInitLayout();
	}
	
	public void clearJSONAndInitLayout() {
		jsonObject.clear();
		jsonArray.clear();
	}
}
