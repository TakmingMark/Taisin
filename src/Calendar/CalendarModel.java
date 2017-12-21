package Calendar;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class CalendarModel {
	
	private InputCalendarDataComponent inputCalendarDataFormat;
	
	private CalendarModel() {
		 initCalendarModel();
	 }
	 
	 public static CalendarModel getCalendarModelObject() {
		 return new CalendarModel();
	 }
	 
	 private void initCalendarModel() {
		
		 
		 parseCalendarJSONFile();
	 }
	 
	 private void parseCalendarJSONFile() {
			try {
				JsonReader bufferedReader = new JsonReader
						(new BufferedReader(new InputStreamReader(
			            new FileInputStream("json/calendar.json"),"UTF-8")));

				inputCalendarDataFormat= new Gson().fromJson(bufferedReader,InputCalendarDataComponent.class);
						new ArrayList<InputCalendarDataComponent>();
				
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}

	public List<String> getYearList() {
		return inputCalendarDataFormat.getYearList();
	}

	public List<String> getMonthList() {
		return inputCalendarDataFormat.getMonthList();
	}

	public List<String> getDayList() {
		return inputCalendarDataFormat.getDayList();
	}

	public List<String> getHourList() {
		return inputCalendarDataFormat.getHourList();
	}

	public List<String> getMinuteList() {
		return inputCalendarDataFormat.getMinuteList();
	}

	public List<String> getSecondList() {
		return inputCalendarDataFormat.getSecondList();
	}
}
