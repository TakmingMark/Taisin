package Calendar;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.swing.JComboBox;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import Component.InputCalendarDataComponent;

public class CalendarModel {

	private InputCalendarDataComponent inputCalendarDataFormat;

	private CalendarModel() {
		initCalendarModel();
	}

	public static CalendarModel getCalendarModelObject() {
		return new CalendarModel();
	}

	private void initCalendarModel() {
		parseCalendarJSONFromCalendarFile();
	}

	private void parseCalendarJSONFromCalendarFile() {
		try {
			JsonReader bufferedReader = new JsonReader(
					new BufferedReader(new InputStreamReader(new FileInputStream("json/calendar.json"), "UTF-8")));

			inputCalendarDataFormat = new Gson().fromJson(bufferedReader, InputCalendarDataComponent.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public CalendarModel readJSONToComboBox(JComboBox<String> jComboBox,List<String> arrayList) {
		for(String element:arrayList)
			jComboBox.addItem(element);
		return this;
	}
	
	public InputCalendarDataComponent getInputCalendarDataFormat() {
		return inputCalendarDataFormat;
	}
}
