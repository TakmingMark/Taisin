package Calendar;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import org.json.simple.JSONObject;

public class CalendarController {
	private CalendarModel calendarJSONModel;
	private CalendarView calendarView;
	
	private CalendarController() {
	}
	
	public static CalendarController getCalendarControllerObject() {
		return new CalendarController();
	}
	
	public void initCalendarController() {
		initCalendarJSONToLayout();
	}
	
	private void initCalendarJSONToLayout() {
		readJSONToComboBox(calendarView.getStartYearComboBox(),calendarJSONModel.getYearList());
		readJSONToComboBox(calendarView.getStartMonthComboBox(),calendarJSONModel.getMonthList());
		readJSONToComboBox(calendarView.getStartDayComboBox(),calendarJSONModel.getDayList());
		readJSONToComboBox(calendarView.getStartHourComboBox(),calendarJSONModel.getHourList());
		readJSONToComboBox(calendarView.getStartMinuteComboBox(),calendarJSONModel.getMinuteList());
		readJSONToComboBox(calendarView.getStartSecondComboBox(),calendarJSONModel.getSecondList());

		readJSONToComboBox(calendarView.getEndYearComboBox(),calendarJSONModel.getYearList());
		readJSONToComboBox(calendarView.getEndMonthComboBox(),calendarJSONModel.getMonthList());
		readJSONToComboBox(calendarView.getEndDayComboBox(),calendarJSONModel.getDayList());
		readJSONToComboBox(calendarView.getEndHourComboBox(),calendarJSONModel.getHourList());
		readJSONToComboBox(calendarView.getEndMinuteComboBox(),calendarJSONModel.getMinuteList());
		readJSONToComboBox(calendarView.getEndSecondComboBox(),calendarJSONModel.getSecondList());
	}
	
	private void readJSONToComboBox(JComboBox<String> jComboBox,List<String> list) {
		for(String element:list)
			jComboBox.addItem(element);
	}
	
	public void disableLayout() {
		calendarView.disable();
	}
	
	public void enableLayout() {
		calendarView.enable();
	}
	public String getCalendarJSON() {
		
		jsonObject=calendarView.getStartCalendarJSON();
		jsonObject.putAll(calendarView.getEndCalendarJSON());
		
		return jsonObject;
	}
	
	public void setCalendarJSONModel(CalendarModel calendarJSONModel) {
		this.calendarJSONModel = calendarJSONModel;
	}

	public void setCalendarView(CalendarView calendarView) {
		this.calendarView = calendarView;
	}
	
	public JPanel getCalendarView() {
		return calendarView;
	}
	
}
