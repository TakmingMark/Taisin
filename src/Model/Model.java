package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import Controller.Controller;

public class Model {
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
