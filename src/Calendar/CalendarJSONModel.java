package Calendar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CalendarJSONModel {
	 ArrayList<String> yearList,monthList,dayList,
	 					hourList,minuteList,secondList;
	 
	 private CalendarJSONModel() {
		 initCalendarJSONModel();
	 }
	 
	 public static CalendarJSONModel getCalendarJSONMOdel() {
		 return new CalendarJSONModel();
	 }
	 
	 private void initCalendarJSONModel() {
		 yearList=new ArrayList<String>();
		 monthList=new ArrayList<String>();
		 dayList=new ArrayList<String>();
		 hourList=new ArrayList<String>();
		 minuteList=new ArrayList<String>();
		 secondList=new ArrayList<String>();
		 
		 parseJSON();
	 }
	 
	 private void parseJSON() {
		 JSONParser parser = new JSONParser();
			JSONObject jsonObject = null;
			JSONArray jsonArray=null;
			try {
				jsonObject = (JSONObject) parser.parse(
				        new BufferedReader(new InputStreamReader(
				            new FileInputStream("json/calendar.json"),"UTF-8")));//don't use BOM
				
				jsonArray=(JSONArray) jsonObject.get("year");
				for(Object element:jsonArray) 
					yearList.add((String)element);
				jsonArray=(JSONArray) jsonObject.get("month");
				for(Object element:jsonArray) 
					monthList.add((String)element);
				jsonArray=(JSONArray) jsonObject.get("day");
				for(Object element:jsonArray) 
					dayList.add((String)element);
				jsonArray=(JSONArray) jsonObject.get("hour");
				for(Object element:jsonArray) 
					hourList.add((String)element);
				jsonArray=(JSONArray) jsonObject.get("minute");
				for(Object element:jsonArray) 
					minuteList.add((String)element);
				jsonArray=(JSONArray) jsonObject.get("second");
				for(Object element:jsonArray) 
					secondList.add((String)element);
			} catch (IOException | ParseException e) {
				e.printStackTrace();
			}	
	 }

	public ArrayList<String> getYearList() {
		return yearList;
	}

	public ArrayList<String> getMonthList() {
		return monthList;
	}

	public ArrayList<String> getDayList() {
		return dayList;
	}

	public ArrayList<String> getHourList() {
		return hourList;
	}

	public ArrayList<String> getMinuteList() {
		return minuteList;
	}

	public ArrayList<String> getSecondList() {
		return secondList;
	}
}
