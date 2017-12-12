package Model;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.lang.model.element.Element;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LeaveJSONModel {
	 ArrayList<String> classStateList,teachNameList,leaveStateList,leaveList,
			jobTitleList,courseList,classNameList,classTimeList;

	private LeaveJSONModel() {
		initLeaveJSONModel();
	}
	
	public static LeaveJSONModel getJosnModelObject() {
		return new LeaveJSONModel();
	}
	
	public void initLeaveJSONModel() {
		 classStateList=new ArrayList<String>();
		 teachNameList=new ArrayList<String>();
		 leaveStateList=new ArrayList<String>();
		 leaveList=new ArrayList<String>();
		 jobTitleList=new ArrayList<String>();
		 courseList=new ArrayList<String>();
		 classNameList=new ArrayList<String>();
		 classTimeList=new ArrayList<String>();
		 
		parseJSON();
	}
	
	private void parseJSON() {

			JSONParser parser = new JSONParser();
			JSONObject jsonObject = null;
			JSONArray jsonArray=null;
			try {
				jsonObject = (JSONObject) parser.parse(new BufferedReader(new FileReader("json/leave.json" )));
				
				jsonArray=(JSONArray) jsonObject.get("classState");
				for(Object element:jsonArray) 
					classStateList.add((String)element);
				jsonArray=(JSONArray) jsonObject.get("teachName");
				for(Object element:jsonArray) 
					teachNameList.add((String)element);
				jsonArray=(JSONArray) jsonObject.get("leaveState");
				for(Object element:jsonArray) 
					leaveStateList.add((String)element);
				jsonArray=(JSONArray) jsonObject.get("leave");
				for(Object element:jsonArray) 
					leaveList.add((String)element);
				jsonArray=(JSONArray) jsonObject.get("jobTitle");
				for(Object element:jsonArray) 
					jobTitleList.add((String)element);
				jsonArray=(JSONArray) jsonObject.get("course");
				for(Object element:jsonArray) 
					courseList.add((String)element);
				jsonArray=(JSONArray) jsonObject.get("className");
				for(Object element:jsonArray) 
					classNameList.add((String)element);
				jsonArray=(JSONArray) jsonObject.get("classTime");
				for(Object element:jsonArray) 
					classTimeList.add((String)element);
			} catch (IOException | ParseException e) {
				e.printStackTrace();
			}	
	}

	public ArrayList<String> getClassStateList() {
		return classStateList;
	}

	public ArrayList<String> getTeachNameList() {
		return teachNameList;
	}

	public ArrayList<String> getLeaveStateList() {
		return leaveStateList;
	}

	public ArrayList<String> getLeaveList() {
		return leaveList;
	}

	public ArrayList<String> getJobTitleList() {
		return jobTitleList;
	}

	public ArrayList<String> getCourseList() {
		return courseList;
	}

	public ArrayList<String> getClassNameList() {
		return classNameList;
	}

	public ArrayList<String> getClassTimeList() {
		return classTimeList;
	}
}
