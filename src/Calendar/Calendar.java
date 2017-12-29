package Calendar;

public class Calendar extends CalendarController{

	private Calendar(){
		super();
	}
	
	public static Calendar getCalendarObject() {
		return new Calendar();
	}

}
