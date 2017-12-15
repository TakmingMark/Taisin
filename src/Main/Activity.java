package Main;

import Calendar.CalendarController;
import Calendar.CalendarJSONModel;
import Calendar.CalendarView;
import Controller.Controller;
import Model.LeaveJSONModel;
import Model.Model;
import View.View;

public class Activity {

	public static void main(String[] args) {
		new Activity().initTaisin();
	}

	private void initTaisin() {
		View view=View.getViewObject();
		Model model=Model.getModelObject();
		LeaveJSONModel leaveJSONModel=LeaveJSONModel.getJSONModelObject();
		Controller controller=Controller.getControllerObject();
		
		
		controller.setJSONModel(leaveJSONModel);
		controller.setModel(model);
		controller.setView(view);
		controller.setCalendarController(initCalendar());
		
		view.setCalendarPanel(controller.getCalendarView());

		view.initView();
		controller.initController();
	}
	
	public CalendarController initCalendar() {
		CalendarView calendarView=CalendarView.getCalendarViewObject();
		CalendarJSONModel calendarJSONModel=CalendarJSONModel.getCalendarJSONModelObject();
		CalendarController calendarController=CalendarController.getCalendarControllerObject();
		
		calendarController.setCalendarJSONModel(calendarJSONModel);
		calendarController.setCalendarView(calendarView);
		
		calendarController.initCalendarController();
		
		return calendarController;
	}
}
