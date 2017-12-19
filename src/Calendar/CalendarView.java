package Calendar;

import java.util.HashMap;
import java.util.Map;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import component.TextContent;

public class CalendarView extends JPanel {

	private JLabel startYearLabel, startMonthLabel, startDayLabel, startHourLabel, startMinuteLabel, startSecondLabel,
			endYearLabel, endMonthLabel, endDayLabel, endHourLabel, endMinuteLabel, endSecondLabel;

	private JComboBox<String> startYearComboBox, startMonthComboBox, startDayComboBox, startHourComboBox, startMinuteComboBox,
			startSecondComboBox, endYearComboBox, endMonthComboBox, endDayComboBox, endHourComboBox, endMinuteComboBox,
			endSecondComboBox;

	private CalendarView() {
		initCalendarView();
	}

	public static CalendarView getCalendarViewObject() {
		return new CalendarView();
	}

	private void initCalendarView() {
		startYearLabel = new JLabel(TextContent.yearText);
		startMonthLabel = new JLabel(TextContent.monthText);
		startDayLabel = new JLabel(TextContent.dayText);
		startHourLabel = new JLabel(TextContent.hourText);
		startMinuteLabel = new JLabel(TextContent.minuteText);
		startSecondLabel = new JLabel(TextContent.secondText);
		endYearLabel = new JLabel(TextContent.yearText);
		endMonthLabel = new JLabel(TextContent.monthText);
		endDayLabel = new JLabel(TextContent.dayText);
		endHourLabel = new JLabel(TextContent.hourText);
		endMinuteLabel = new JLabel(TextContent.minuteText);
		endSecondLabel = new JLabel(TextContent.secondText);

		startYearComboBox = new JComboBox<String>();
		startMonthComboBox = new JComboBox<String>();
		startDayComboBox = new JComboBox<String>();
		startHourComboBox = new JComboBox<String>();
		startMinuteComboBox = new JComboBox<String>();
		startSecondComboBox = new JComboBox<String>();

		endYearComboBox = new JComboBox<String>();
		endMonthComboBox = new JComboBox<String>();
		endDayComboBox = new JComboBox<String>();
		endHourComboBox = new JComboBox<String>();
		endMinuteComboBox = new JComboBox<String>();
		endSecondComboBox = new JComboBox<String>();

		GroupLayout groupLayout = new GroupLayout(this);
		this.setLayout(groupLayout);
		;

		groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup()
				
				.addGroup(groupLayout.createParallelGroup()
						.addComponent(startYearComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endYearComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createParallelGroup()
						.addComponent(startYearLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endYearLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createParallelGroup()
						.addComponent(startMonthComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endMonthComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createParallelGroup()
						.addComponent(startMonthLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endMonthLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createParallelGroup()
						.addComponent(startDayComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endDayComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createParallelGroup()
						.addComponent(startDayLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endDayLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createParallelGroup()
						.addComponent(startHourComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endHourComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createParallelGroup()
						.addComponent(startHourLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endHourLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createParallelGroup()
						.addComponent(startMinuteComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endMinuteComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createParallelGroup()
						.addComponent(startMinuteLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endMinuteLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createParallelGroup()
						.addComponent(startSecondComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endSecondComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createParallelGroup()
						.addComponent(startSecondLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endSecondLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				);
		
		groupLayout.setVerticalGroup(groupLayout.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.CENTER)
						.addComponent(startYearLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(startYearComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(startMonthLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(startMonthComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(startDayLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(startDayComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(startHourLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(startHourComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(startMinuteLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(startMinuteComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(startSecondLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(startSecondComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createParallelGroup(Alignment.CENTER)
						.addComponent(endYearLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endYearComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endMonthLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endMonthComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endDayLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endDayComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endHourLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endHourComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endMinuteLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endMinuteComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endSecondLabel, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endSecondComboBox, 0, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)));
	}
	
	public void disable() {
		startYearComboBox.setEnabled(false);
		startMonthComboBox.setEnabled(false);
		startDayComboBox.setEnabled(false);
		startHourComboBox.setEnabled(false);
		startMinuteComboBox.setEnabled(false);
		startSecondComboBox.setEnabled(false);
		endYearComboBox.setEnabled(false);
		endMonthComboBox.setEnabled(false);
		endDayComboBox.setEnabled(false);
		endHourComboBox.setEnabled(false);
		endMinuteComboBox.setEnabled(false);
		endSecondComboBox.setEnabled(false);
	}
	
	public void enable() {
		startYearComboBox.setEnabled(true);
		startMonthComboBox.setEnabled(true);
		startDayComboBox.setEnabled(true);
		startHourComboBox.setEnabled(true);
		startMinuteComboBox.setEnabled(true);
		startSecondComboBox.setEnabled(true);
		endYearComboBox.setEnabled(true);
		endMonthComboBox.setEnabled(true);
		endDayComboBox.setEnabled(true);
		endHourComboBox.setEnabled(true);
		endMinuteComboBox.setEnabled(true);
		endSecondComboBox.setEnabled(true);
	}
	
	public Map<String,Object> getStartCalendarString() {
		Map<String, Object> jsonObject=new HashMap<>();
		
		String startCalendar=startYearComboBox.getSelectedItem()+"/"+
				 startMonthComboBox.getSelectedItem()+"/"+
				 startDayComboBox.getSelectedItem()+"-"+
				 startHourComboBox.getSelectedItem()+":"+
				 startMinuteComboBox.getSelectedItem()+":"+
				 startSecondComboBox.getSelectedItem();
		
		jsonObject.put("startCalendar", startCalendar);
		
		return jsonObject;
	}
	
	public Map<String, Object> getEndCalendarJSON() {
		Map<String, Object> jsonObject=new HashMap<>();
		
		String endCalendar=endYearComboBox.getSelectedItem()+"/"+
				 endMonthComboBox.getSelectedItem()+"/"+
				 endDayComboBox.getSelectedItem()+"-"+
				 endHourComboBox.getSelectedItem()+":"+
				 endMinuteComboBox.getSelectedItem()+":"+
				 endSecondComboBox.getSelectedItem();
		
		jsonObject.put("endCalendar", endCalendar);
		
		return jsonObject;
	}
	
	public JComboBox<String> getStartYearComboBox() {
		return startYearComboBox;
	}

	public JComboBox<String> getStartMonthComboBox() {
		return startMonthComboBox;
	}

	public JComboBox<String> getStartDayComboBox() {
		return startDayComboBox;
	}

	public JComboBox<String> getStartHourComboBox() {
		return startHourComboBox;
	}

	public JComboBox<String> getStartMinuteComboBox() {
		return startMinuteComboBox;
	}

	public JComboBox<String> getStartSecondComboBox() {
		return startSecondComboBox;
	}

	public JComboBox<String> getEndYearComboBox() {
		return endYearComboBox;
	}

	public JComboBox<String> getEndMonthComboBox() {
		return endMonthComboBox;
	}

	public JComboBox<String> getEndDayComboBox() {
		return endDayComboBox;
	}

	public JComboBox<String> getEndHourComboBox() {
		return endHourComboBox;
	}

	public JComboBox<String> getEndMinuteComboBox() {
		return endMinuteComboBox;
	}

	public JComboBox<String> getEndSecondComboBox() {
		return endSecondComboBox;
	}

	public void setStartYearComboBox(JComboBox<String> startYearComboBox) {
		this.startYearComboBox = startYearComboBox;
	}

	public void setStartMonthComboBox(JComboBox<String> startMonthComboBox) {
		this.startMonthComboBox = startMonthComboBox;
	}

	public void setStartDayComboBox(JComboBox<String> startDayComboBox) {
		this.startDayComboBox = startDayComboBox;
	}

	public void setStartHourComboBox(JComboBox<String> startHourComboBox) {
		this.startHourComboBox = startHourComboBox;
	}

	public void setStartMinuteComboBox(JComboBox<String> startMinuteComboBox) {
		this.startMinuteComboBox = startMinuteComboBox;
	}

	public void setStartSecondComboBox(JComboBox<String> startSecondComboBox) {
		this.startSecondComboBox = startSecondComboBox;
	}

	public void setEndYearComboBox(JComboBox<String> endYearComboBox) {
		this.endYearComboBox = endYearComboBox;
	}

	public void setEndMonthComboBox(JComboBox<String> endMonthComboBox) {
		this.endMonthComboBox = endMonthComboBox;
	}

	public void setEndDayComboBox(JComboBox<String> endDayComboBox) {
		this.endDayComboBox = endDayComboBox;
	}

	public void setEndHourComboBox(JComboBox<String> endHourComboBox) {
		this.endHourComboBox = endHourComboBox;
	}

	public void setEndMinuteComboBox(JComboBox<String> endMinuteComboBox) {
		this.endMinuteComboBox = endMinuteComboBox;
	}

	public void setEndSecondComboBox(JComboBox<String> endSecondComboBox) {
		this.endSecondComboBox = endSecondComboBox;
	}
}
