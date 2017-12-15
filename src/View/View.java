package View;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import org.jdatepicker.JDatePicker;
import org.json.simple.JSONObject;

import component.TextContent;

public class View {
	private JFrame jFrame;
	private JPanel jPanel,topPanel,middlePanel,buttomPanel;
	private JPanel calendarPanel;
	private JLabel jobTitleLabel,leavePeriodLabel,fillInPeopleLabel,
					eventDescriptionLabel,leaveStateLabel,businessAgentLabel,
					courseAgentLabel,classTimeLabel,classNameLabel,
					classTeacherLabel,courseNameLabel;
	private JComboBox jobTitleComboBox,fillInPeopleComboBox,
						leaveStateComboBox,businessAgentComboBox,courseAgentComboBox,
						classTimeComboBox,classNameComboBox,classTeacherComboBox,
						courseNameComboBox;
	private JTextArea eventDescriptionTextArea;
	
	private JButton enterButton,insertButton,finishButton;
	
	private JDatePicker datePicker;
	
	private View() {
		
	}
	
	public static View getViewObject() {
		return new View();
	}
	
	public void initView() {
		jFrame=new JFrame("Taisin");
		jPanel=new JPanel();
		topPanel=new JPanel();
		middlePanel=new JPanel();
		buttomPanel=new JPanel();
		jobTitleLabel=new JLabel(TextContent.jobTitleText);
		leavePeriodLabel=new JLabel(TextContent.leavePeriodText);
		fillInPeopleLabel=new JLabel(TextContent.fillInPeopleText);
		eventDescriptionLabel=new JLabel(TextContent.eventDescriptionText);
		leaveStateLabel=new JLabel(TextContent.leaveStateText);
		businessAgentLabel=new JLabel(TextContent.businessAgentText);
		
		courseAgentLabel=new JLabel(TextContent.courseAgentText);
		classTimeLabel=new JLabel(TextContent.classTimeText);
		classNameLabel=new JLabel(TextContent.classNameText);
		classTeacherLabel=new JLabel(TextContent.classTeacherText);
		courseNameLabel=new JLabel(TextContent.courseNameText);
		
		jobTitleComboBox=new JComboBox();
		fillInPeopleComboBox=new JComboBox();
		leaveStateComboBox=new JComboBox();
		businessAgentComboBox=new JComboBox();
		
		courseAgentComboBox=new JComboBox();
		classTimeComboBox=new JComboBox();
		classNameComboBox=new JComboBox();
		classTeacherComboBox=new JComboBox();
		courseNameComboBox=new JComboBox();
		
		eventDescriptionTextArea=new JTextArea(3,25);
		
		enterButton=new JButton(TextContent.enterText);
		insertButton=new JButton(TextContent.insertText);
		finishButton=new JButton(TextContent.finishText);
		
		topPanel.setBorder(new TitledBorder(new EtchedBorder(),TextContent.topPanelText,TitledBorder.LEFT,TitledBorder.TOP));
		buttomPanel.setBorder(new TitledBorder(new EtchedBorder(),TextContent.buttomPanelText,TitledBorder.LEFT,TitledBorder.TOP));
		
		eventDescriptionTextArea.setLineWrap(true);       
		eventDescriptionTextArea.setWrapStyleWord(true);
		jFrame.setLocation(300, 400);
		jPanel.setPreferredSize(new Dimension(500, 400));
		
		
		GroupLayout topGroupLayout=new GroupLayout(topPanel);
		topPanel.setLayout(topGroupLayout);;

		topGroupLayout.setHorizontalGroup(
				topGroupLayout.createSequentialGroup()
					.addGroup(topGroupLayout.createParallelGroup()
							.addGroup(topGroupLayout.createSequentialGroup()
									.addGap(20)
									.addGroup(topGroupLayout.createParallelGroup()
											.addComponent(jobTitleLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											.addComponent(fillInPeopleLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									.addGap(10)
									.addGroup(topGroupLayout.createParallelGroup()
											.addComponent(jobTitleComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											.addComponent(fillInPeopleComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									.addGap(40)
									.addGroup(topGroupLayout.createParallelGroup()
											.addComponent(leaveStateLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											.addComponent(businessAgentLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									.addGap(10)
									.addGroup(topGroupLayout.createParallelGroup()
											.addComponent(leaveStateComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											.addComponent(businessAgentComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									)
							.addGroup(topGroupLayout.createSequentialGroup()
									.addGroup(topGroupLayout.createParallelGroup()
											.addComponent(leavePeriodLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									.addGap(5)
									.addGroup(topGroupLayout.createParallelGroup()
											.addComponent(calendarPanel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									)
							)
					);
		topGroupLayout.setVerticalGroup(
				topGroupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(topGroupLayout.createParallelGroup()
							.addComponent(jobTitleLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(jobTitleComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(leaveStateLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(leaveStateComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							)
					.addGap(10)
					.addGroup(topGroupLayout.createParallelGroup()
							.addComponent(fillInPeopleLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(fillInPeopleComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(businessAgentLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(businessAgentComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							)
					.addGap(10)
					.addGroup(topGroupLayout.createParallelGroup(Alignment.CENTER)
							.addComponent(leavePeriodLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(calendarPanel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							)		
					.addGap(10)
				);
		
		GroupLayout middleGroupLayout=new GroupLayout(middlePanel);
		middlePanel.setLayout(middleGroupLayout);
		middleGroupLayout.setHorizontalGroup(
				middleGroupLayout.createSequentialGroup()
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
	                     GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(middleGroupLayout.createParallelGroup()
							.addGroup(middleGroupLayout.createSequentialGroup()
									.addGroup(middleGroupLayout.createParallelGroup()
											.addComponent(eventDescriptionLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									.addGap(10)
									.addGroup(middleGroupLayout.createParallelGroup()
											.addComponent(eventDescriptionTextArea,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									)
							)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
		                     GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					);
		middleGroupLayout.setVerticalGroup(
				middleGroupLayout.createSequentialGroup()
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
	                     GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(middleGroupLayout.createParallelGroup(Alignment.CENTER)
						.addComponent(eventDescriptionLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(eventDescriptionTextArea,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
	                     GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				);
		
		GroupLayout buttomGroupLayout=new GroupLayout(buttomPanel);
		buttomPanel.setLayout(buttomGroupLayout);
		buttomGroupLayout.setHorizontalGroup(
				buttomGroupLayout.createSequentialGroup()
					.addGap(20)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
	                     GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(buttomGroupLayout.createParallelGroup()
							.addGroup(buttomGroupLayout.createSequentialGroup()
									.addGroup(buttomGroupLayout.createParallelGroup()
											.addComponent(courseAgentLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											.addComponent(classTimeLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									.addGap(10)
									.addGroup(buttomGroupLayout.createParallelGroup()
											.addComponent(courseAgentComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											.addComponent(classTimeComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									.addGap(30)
									.addGroup(buttomGroupLayout.createParallelGroup()
											.addComponent(classNameLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											.addComponent(classTeacherLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											.addComponent(courseNameLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									.addGap(10)
									.addGroup(buttomGroupLayout.createParallelGroup()
											.addComponent(classNameComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											.addComponent(classTeacherComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											.addComponent(courseNameComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									)
							)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
		                     GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(20)
					);
		buttomGroupLayout.setVerticalGroup(
				buttomGroupLayout.createSequentialGroup()
				.addGap(10)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
	                     GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(buttomGroupLayout.createParallelGroup()
						.addComponent(courseAgentLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(courseAgentComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(classNameLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(classNameComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						)
				.addGap(8)
				.addGroup(buttomGroupLayout.createParallelGroup()
						.addComponent(classTimeLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(classTimeComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(classTeacherLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(classTeacherComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						)
				.addGap(8)
				.addGroup(buttomGroupLayout.createParallelGroup()
						.addComponent(courseNameLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(courseNameComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
	                     GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGap(10)
				);
		
		GroupLayout groupLayout=new GroupLayout(jPanel);
		jPanel.setLayout(groupLayout);
		groupLayout.setHorizontalGroup(
				groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup()
							.addComponent(topPanel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(middlePanel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(buttomPanel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							)
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup()
							.addComponent(enterButton,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(insertButton,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(finishButton,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							)
					);
		groupLayout.setVerticalGroup(
				groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup()
							.addComponent(topPanel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addGroup(groupLayout.createSequentialGroup()
									.addGap(50)
									.addComponent(enterButton,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
									)
							
							)
					.addGap(20)
					.addComponent(middlePanel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup()
							.addComponent(buttomPanel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addGroup(groupLayout.createSequentialGroup()
									.addGap(30)
									.addComponent(insertButton,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
									.addGap(20)
									.addComponent(finishButton,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
									)
							)
					);
		
		jFrame.add(jPanel);
		jFrame.pack();
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JSONObject pressEnterButtonState() {
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("jobTitle", jobTitleComboBox.getSelectedItem());
		jsonObject.put("leaveState",leaveStateComboBox.getSelectedItem());
		jsonObject.put("fillInPeople", fillInPeopleComboBox.getSelectedItem());
		jsonObject.put("businessAgent", businessAgentComboBox.getSelectedItem());
		jsonObject.put("eventDescription", eventDescriptionTextArea.getText());
		return jsonObject;
	}
	
	public JSONObject pressInsertButtonState() {
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("courseAgent", courseAgentComboBox.getSelectedItem());
		jsonObject.put("classTime", classTimeComboBox.getSelectedItem());
		jsonObject.put("className", classNameComboBox.getSelectedItem());
		jsonObject.put("classTeacher", classTeacherComboBox.getSelectedItem());
		jsonObject.put("courseName", courseNameComboBox.getSelectedItem());
		return jsonObject;
	}
	public void pressFinishButtonState() {
		
	}
	
	public void disableTopAndMiddlePanel() {
		jobTitleComboBox.setEnabled(false);
		fillInPeopleComboBox.setEnabled(false);
		leaveStateComboBox.setEnabled(false);
		businessAgentComboBox.setEnabled(false);
		eventDescriptionTextArea.setEnabled(false);
		
		enterButton.setEnabled(false);;
		
	}
	
	public void enableTopAndMiddlePanel() {
		jobTitleComboBox.setEnabled(true);
		fillInPeopleComboBox.setEnabled(true);
		leaveStateComboBox.setEnabled(true);
		businessAgentComboBox.setEnabled(true);
		eventDescriptionTextArea.setEnabled(true);
		
		enterButton.setEnabled(true);;
	}
	
	public void disableButtomPanel() {
		courseAgentComboBox.setEnabled(false);
		classTimeComboBox.setEnabled(false);
		classNameComboBox.setEnabled(false);
		classTeacherComboBox.setEnabled(false);
		courseNameComboBox.setEnabled(false);
		
		insertButton.setEnabled(false);
		finishButton.setEnabled(false);
	}
	
	public void enableButtomPanel() {
		courseAgentComboBox.setEnabled(true);
		classTimeComboBox.setEnabled(true);
		classNameComboBox.setEnabled(true);
		classTeacherComboBox.setEnabled(true);
		courseNameComboBox.setEnabled(true);
		
		insertButton.setEnabled(true);
		finishButton.setEnabled(true);
	}
	
	public JComboBox getJobTitleComboBox() {
		return jobTitleComboBox;
	}

	public JComboBox getFillInPeopleComboBox() {
		return fillInPeopleComboBox;
	}

	public JComboBox getLeaveStateComboBox() {
		return leaveStateComboBox;
	}

	public JComboBox getBusinessAgentComboBox() {
		return businessAgentComboBox;
	}

	public JComboBox getCourseAgentComboBox() {
		return courseAgentComboBox;
	}

	public JComboBox getClassTimeComboBox() {
		return classTimeComboBox;
	}

	public JComboBox getClassNameComboBox() {
		return classNameComboBox;
	}

	public JComboBox getClassTeacherComboBox() {
		return classTeacherComboBox;
	}

	public JComboBox getCourseNameComboBox() {
		return courseNameComboBox;
	}
	
	public void setCalendarPanel(JPanel calendarPanel) {
		this.calendarPanel=calendarPanel;
	}

	public JButton getEnterButton() {
		return enterButton;
	}

	public JButton getInsertButton() {
		return insertButton;
	}

	public JButton getFinishButton() {
		return finishButton;
	}
	

}
