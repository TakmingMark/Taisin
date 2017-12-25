package Main;

import Calendar.Calendar;
import Calendar.CalendarController;
import Calendar.CalendarJSONModel;
import Calendar.CalendarView;
import Leave.Controller;
import Leave.Model;
import Leave.View;

public class Activity {

	public static void main(String[] args) {
		new Activity().initTaisin();
	}

	private void initTaisin() {
		View view=View.getViewObject();
		Model model=Model.getModelObject();
		Controller controller=Controller.getControllerObject();
		
		controller.setModel(model);
		controller.setView(view);
		controller.setCalendar(Calendar.getCalendarObject());
		
		view.setCalendarPanel(controller.getCalendarView());

		view.initView();
		controller.initController();
	}
}
