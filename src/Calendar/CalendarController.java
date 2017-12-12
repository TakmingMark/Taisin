package Calendar;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class CalendarController {
	private CalendarJSONModel calendarJSONModel;
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
	
	private void readJSONToComboBox(JComboBox<String> jComboBox,ArrayList<String> arrayList) {
		for(String element:arrayList)
			jComboBox.addItem(element);
	}

	public void setCalendarJSONModel(CalendarJSONModel calendarJSONModel) {
		this.calendarJSONModel = calendarJSONModel;
	}

	public void setCalendarView(CalendarView calendarView) {
		this.calendarView = calendarView;
	}
	
	public JPanel getCalendarView() {
		return calendarView;
	}
	
}
