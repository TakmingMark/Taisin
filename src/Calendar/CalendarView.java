package Calendar;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.xml.soap.Text;

import MVC.TextContent;

public class CalendarView extends JPanel{
	
	private JLabel startYearLabel,startMonthLabel,startDayLabel,
					startHourLabel,startMinuteLabel,startSecondLabel,
					endYearLabel,endMonthLabel,endDayLabel,
					endHourLabel,endMinuteLabel,endSecondLabel;
	
	private JComboBox startYearComboBox,startMonthComboBox,startDayComboBox,
						startHourComboBox,startMinuteComboBox,startSecondComboBox,
						endYearComboBox,endMonthComboBox,endDayComboBox,
						endHourComboBox,endMinuteComboBox,endSecondComboBox;
	private CalendarView() {
		initCalendarView();
	}
	
	public static CalendarView getCalendarViewObject() {
		return new CalendarView();
	}
	
	private void initCalendarView() {
		startYearLabel=new JLabel(TextContent.yearText);
		startMonthLabel=new JLabel(TextContent.minuteText);
		startDayLabel=new JLabel(TextContent.secondText);
		startHourLabel=new JLabel(TextContent.hourText);
		startMinuteLabel=new JLabel(TextContent.minuteText);
		startSecondLabel=new JLabel(TextContent.secondText);
		endYearLabel=new JLabel(TextContent.yearText);
		endMonthLabel=new JLabel(TextContent.monthText);
		endDayLabel=new JLabel(TextContent.dayText);
		endHourLabel=new JLabel(TextContent.hourText);
		endMinuteLabel=new JLabel(TextContent.minuteText);
		endSecondLabel=new JLabel(TextContent.secondText);
		
		startYearComboBox=new JComboBox();
		startMonthComboBox=new JComboBox();
		startDayComboBox=new JComboBox();
		startHourComboBox=new JComboBox();
		startMinuteComboBox=new JComboBox();
		startSecondComboBox=new JComboBox();
		
		endYearComboBox=new JComboBox();
		endMonthComboBox=new JComboBox();
		endDayComboBox=new JComboBox();
		endHourComboBox=new JComboBox();
		endMinuteComboBox=new JComboBox();
		endSecondComboBox=new JComboBox();
		
		
		GroupLayout groupLayout=new GroupLayout(this);
		this.setLayout(groupLayout);;
		
		groupLayout.setHorizontalGroup(
				groupLayout.createSequentialGroup()
					.addComponent(startYearLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(startYearComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(startMonthLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(startMonthComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(startDayLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(startDayComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(startHourLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(startHourComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(startMinuteLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(startMinuteComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(startSecondLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(startSecondComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					
					.addComponent(endYearLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(endYearComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(endMonthLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(endMonthComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(endDayLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(endDayComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(endHourLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(endHourComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(endMinuteLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(endMinuteComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(endSecondLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(endSecondComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
				);
		
		groupLayout.setVerticalGroup(
				groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup()
							.addComponent(startYearLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(startYearComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(startMonthLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(startMonthComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(startDayLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(startDayComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(startHourLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(startHourComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(startMinuteLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(startMinuteComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(startSecondLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(startSecondComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							
							.addComponent(endYearLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(endYearComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(endMonthLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(endMonthComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(endDayLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(endDayComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(endHourLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(endHourComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(endMinuteLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(endMinuteComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(endSecondLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(endSecondComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						)
				);
	}

	public JComboBox getStartYearComboBox() {
		return startYearComboBox;
	}

	public JComboBox getStartMonthComboBox() {
		return startMonthComboBox;
	}

	public JComboBox getStartDayComboBox() {
		return startDayComboBox;
	}

	public JComboBox getStartHourComboBox() {
		return startHourComboBox;
	}

	public JComboBox getStartMinuteComboBox() {
		return startMinuteComboBox;
	}

	public JComboBox getStartSecondComboBox() {
		return startSecondComboBox;
	}

	public JComboBox getEndYearComboBox() {
		return endYearComboBox;
	}

	public JComboBox getEndMonthComboBox() {
		return endMonthComboBox;
	}

	public JComboBox getEndDayComboBox() {
		return endDayComboBox;
	}

	public JComboBox getEndHourComboBox() {
		return endHourComboBox;
	}

	public JComboBox getEndMinuteComboBox() {
		return endMinuteComboBox;
	}

	public JComboBox getEndSecondComboBox() {
		return endSecondComboBox;
	}

	public void setStartYearComboBox(JComboBox startYearComboBox) {
		this.startYearComboBox = startYearComboBox;
	}

	public void setStartMonthComboBox(JComboBox startMonthComboBox) {
		this.startMonthComboBox = startMonthComboBox;
	}

	public void setStartDayComboBox(JComboBox startDayComboBox) {
		this.startDayComboBox = startDayComboBox;
	}

	public void setStartHourComboBox(JComboBox startHourComboBox) {
		this.startHourComboBox = startHourComboBox;
	}

	public void setStartMinuteComboBox(JComboBox startMinuteComboBox) {
		this.startMinuteComboBox = startMinuteComboBox;
	}

	public void setStartSecondComboBox(JComboBox startSecondComboBox) {
		this.startSecondComboBox = startSecondComboBox;
	}

	public void setEndYearComboBox(JComboBox endYearComboBox) {
		this.endYearComboBox = endYearComboBox;
	}

	public void setEndMonthComboBox(JComboBox endMonthComboBox) {
		this.endMonthComboBox = endMonthComboBox;
	}

	public void setEndDayComboBox(JComboBox endDayComboBox) {
		this.endDayComboBox = endDayComboBox;
	}

	public void setEndHourComboBox(JComboBox endHourComboBox) {
		this.endHourComboBox = endHourComboBox;
	}

	public void setEndMinuteComboBox(JComboBox endMinuteComboBox) {
		this.endMinuteComboBox = endMinuteComboBox;
	}

	public void setEndSecondComboBox(JComboBox endSecondComboBox) {
		this.endSecondComboBox = endSecondComboBox;
	}
}
