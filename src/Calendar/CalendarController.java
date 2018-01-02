package Calendar;

import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import org.json.simple.JSONObject;

public class CalendarController {
	private CalendarModel calendarModel;
	private CalendarView calendarView;
	
	protected CalendarController() {
		initCalendarController();
	}
	
	public static CalendarController getCalendarControllerObject() {
		return new CalendarController();
	}
	
	public void initCalendarController() {
		calendarView=CalendarView.getCalendarViewObject();
		calendarModel=CalendarModel.getCalendarModelObject();
		initCalendarJSONToLayout();
	}
	
	private void initCalendarJSONToLayout() {
		calendarModel.readJSONToComboBox(calendarView.getStartYearComboBox(),calendarModel.getInputCalendarDataFormat().getYear())
		.readJSONToComboBox(calendarView.getStartMonthComboBox(),calendarModel.getInputCalendarDataFormat().getMonth())
		.readJSONToComboBox(calendarView.getStartDayComboBox(),calendarModel.getInputCalendarDataFormat().getDay())
		.readJSONToComboBox(calendarView.getStartHourComboBox(),calendarModel.getInputCalendarDataFormat().getHour())
		.readJSONToComboBox(calendarView.getStartMinuteComboBox(),calendarModel.getInputCalendarDataFormat().getMinute())
		.readJSONToComboBox(calendarView.getStartSecondComboBox(),calendarModel.getInputCalendarDataFormat().getSecond())

		.readJSONToComboBox(calendarView.getEndYearComboBox(),calendarModel.getInputCalendarDataFormat().getYear())
		.readJSONToComboBox(calendarView.getEndMonthComboBox(),calendarModel.getInputCalendarDataFormat().getMonth())
		.readJSONToComboBox(calendarView.getEndDayComboBox(),calendarModel.getInputCalendarDataFormat().getDay())
		.readJSONToComboBox(calendarView.getEndHourComboBox(),calendarModel.getInputCalendarDataFormat().getHour())
		.readJSONToComboBox(calendarView.getEndMinuteComboBox(),calendarModel.getInputCalendarDataFormat().getMinute())
		.readJSONToComboBox(calendarView.getEndSecondComboBox(),calendarModel.getInputCalendarDataFormat().getSecond());
	}
	
	public void enabledLayout(boolean bool) {
		calendarView.setEenabled(bool);
	}
	public JSONObject getCalendarViewJSON() {
		return calendarView.getCalendarViewJSON();
	}
	

	public void setCalendarView(CalendarView calendarView) {
		this.calendarView = calendarView;
	}
	
	public JPanel getCalendarView() {
		return calendarView;
	}
	
}
