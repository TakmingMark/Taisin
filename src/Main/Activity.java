package Main;

import Calendar.Calendar;
import Component.Excel;
import Leave.LeaveController;
import Leave.LeaveModel;
import Leave.LeaveView;
import Table.Table;

public class Activity {

	public static void main(String[] args) {
		new Activity().initTaisin();
	}

	private void initTaisin() {
		LeaveView leaveView = LeaveView.getLeaveViewObject();
		LeaveModel leaveModel = LeaveModel.getModelObject();
		LeaveController leaveController = LeaveController.getControllerObject();

		leaveController.setModel(leaveModel);
		leaveController.setView(leaveView);
		
		leaveController.setCalendar(Calendar.getCalendarObject());
		leaveController.setTable(Table.getTableObject());
		leaveController.setExcel(Excel.getExcelObeject());
		
		leaveView.setCalendarPanel(leaveController.getCalendarView());
		leaveView.setTablePanel(leaveController.getTableView());

		leaveView.initLeaveView();
		leaveController.initController();
	}
}
