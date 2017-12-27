package Main;

import Calendar.Calendar;
import Calendar.CalendarController;
import Calendar.CalendarJSONModel;
import Calendar.CalendarView;
import Leave.LeaveController;
import Leave.LeaveModel;
import Leave.LeaveView;
import Table.Table;

public class Activity {

	public static void main(String[] args) {
		new Activity().initTaisin();
	}

	private void initTaisin() {
		LeaveView view=LeaveView.getViewObject();
		LeaveModel model=LeaveModel.getModelObject();
		LeaveController controller=LeaveController.getControllerObject();
		
		controller.setModel(model);
		controller.setView(view);
		controller.setCalendar(Calendar.getCalendarObject());
		controller.setTable(Table.getTableObject());
		
		view.setCalendarPanel(controller.getCalendarView());
		view.setTablePanel(controller.getTableView());
		view.initView();
		controller.initController();
	}
}
