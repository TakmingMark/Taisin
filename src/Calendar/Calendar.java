package Calendar;

public class Calendar extends CalendarController{

	private Calendar(){
		initCalendar();
	}
	
	public static Calendar getCalendarObject() {
		return new Calendar();
	}
	
	private  void initCalendar() {
		CalendarView calendarView=CalendarView.getCalendarViewObject();
		CalendarJSONModel calendarJSONModel=CalendarJSONModel.getCalendarJSONModelObject();
		
		this.setCalendarJSONModel(calendarJSONModel);
		this.setCalendarView(calendarView);
		
		this.initCalendarController();
	}
}
