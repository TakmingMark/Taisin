package MVC;

import Calendar.CalendarController;
import Calendar.CalendarJSONModel;
import Calendar.CalendarView;
import Model.LeaveJSONModel;
import Model.Model;
import View.View;

public class Activity {

	public static void main(String[] args) {
		new Activity().initTaisin();
	}

	private void initTaisin() {
		View view=View.getViewObject();
		LeaveJSONModel leaveJSONModel=LeaveJSONModel.getJosnModelObject();
		Controller controller=Controller.getControllerObject();
		
		view.setCalendarPanel(initCalendar().getCalendarView());
		view.initView();
		controller.setJSONModel(leaveJSONModel);
		controller.setView(view);
		controller.initController();
	}
	
	public CalendarController initCalendar() {
		CalendarView calendarView=CalendarView.getCalendarViewObject();
		CalendarJSONModel calendarJSONModel=CalendarJSONModel.getCalendarJSONMOdel();
		CalendarController calendarController=CalendarController.getCalendarControllerObject();
		
		calendarController.setCalendarJSONModel(calendarJSONModel);
		calendarController.setCalendarView(calendarView);
		calendarController.initCalendarController();
		
		return calendarController;
	}
}
