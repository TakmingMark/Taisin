package Leave;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import org.jdatepicker.JDatePicker;
import org.json.simple.JSONObject;

import Component.TextContent;

public class LeaveView {
	private JFrame frame;
	private JPanel panel,leftPanel,leftTopPanel,leftMiddlePanel,leftButtomPanel,centerPanel,rightPanel;
	private JPanel calendarPanel,tablePanel;
	private JLabel jobTitleLabel,leavePeriodLabel,fillInPeopleLabel,
					eventDescriptionLabel,leaveStateLabel,businessAgentLabel,
					courseAgentLabel,classTimeLabel,classNameLabel,
					classTeacherLabel,courseNameLabel;
	private JComboBox<String> jobTitleComboBox,fillInPeopleComboBox,
						leaveStateComboBox,businessAgentComboBox,courseAgentComboBox,
						classTimeComboBox,classNameComboBox,classTeacherComboBox,
						courseNameComboBox;
	private JTextArea eventDescriptionTextArea;
	
	private JButton enterButton,insertButton,finishButton;
	
	private JSeparator jSeparator;
	
	private LeaveView() {
		
	}
	
	public static LeaveView getViewObject() {
		return new LeaveView();
	}
	
	public void initView() {
		frame=new JFrame("Taisin");
		panel=new JPanel();
		leftPanel=new JPanel();
		leftTopPanel=new JPanel();
		leftMiddlePanel=new JPanel();
		leftButtomPanel=new JPanel();
		centerPanel=new JPanel();
		rightPanel=new JPanel();
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
		
		jobTitleComboBox=new JComboBox<String>();
		fillInPeopleComboBox=new JComboBox<String>();
		leaveStateComboBox=new JComboBox<String>();
		businessAgentComboBox=new JComboBox<String>();
		
		courseAgentComboBox=new JComboBox<String>();
		classTimeComboBox=new JComboBox<String>();
		classNameComboBox=new JComboBox<String>();
		classTeacherComboBox=new JComboBox<String>();
		courseNameComboBox=new JComboBox<String>();
		
		eventDescriptionTextArea=new JTextArea(3,25);
		
		enterButton=new JButton(TextContent.enterText);
		insertButton=new JButton(TextContent.insertText);
		finishButton=new JButton(TextContent.finishText);
		
		jSeparator=new JSeparator(SwingConstants.VERTICAL);
				
		leftTopPanel.setBorder(new TitledBorder
				(new EtchedBorder(),TextContent.topPanelText,TitledBorder.LEFT,TitledBorder.TOP));
		leftButtomPanel.setBorder(new TitledBorder
				(new EtchedBorder(),TextContent.buttomPanelText,TitledBorder.LEFT,TitledBorder.TOP));
		
		eventDescriptionTextArea.setLineWrap(true);       
		eventDescriptionTextArea.setWrapStyleWord(true);
		
		jSeparator.setBackground(Color.BLACK);
		jSeparator.setForeground(Color.BLACK);
			
		frame.setLocation(50, 200);
		
		leftPanel.setPreferredSize(new Dimension(500, 400));
		centerPanel.setPreferredSize(new Dimension(100, 400));
		rightPanel.setPreferredSize(new Dimension(800, 400));
		panel.setPreferredSize(new Dimension(1400, 400));
		
		
		GroupLayout leftTopGroupLayout=new GroupLayout(leftTopPanel);
		leftTopPanel.setLayout(leftTopGroupLayout);;

		leftTopGroupLayout.setHorizontalGroup(
				leftTopGroupLayout.createSequentialGroup()
					.addGroup(leftTopGroupLayout.createParallelGroup()
							.addGroup(leftTopGroupLayout.createSequentialGroup()
									.addGap(20)
									.addGroup(leftTopGroupLayout.createParallelGroup()
											.addComponent(jobTitleLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											.addComponent(fillInPeopleLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									.addGap(10)
									.addGroup(leftTopGroupLayout.createParallelGroup()
											.addComponent(jobTitleComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											.addComponent(fillInPeopleComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									.addGap(40)
									.addGroup(leftTopGroupLayout.createParallelGroup()
											.addComponent(leaveStateLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											.addComponent(businessAgentLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									.addGap(10)
									.addGroup(leftTopGroupLayout.createParallelGroup()
											.addComponent(leaveStateComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											.addComponent(businessAgentComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									)
							.addGroup(leftTopGroupLayout.createSequentialGroup()
									.addGroup(leftTopGroupLayout.createParallelGroup()
											.addComponent(leavePeriodLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									.addGap(5)
									.addGroup(leftTopGroupLayout.createParallelGroup()
											.addComponent(calendarPanel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									)
							)
					);
		leftTopGroupLayout.setVerticalGroup(
				leftTopGroupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(leftTopGroupLayout.createParallelGroup()
							.addComponent(jobTitleLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(jobTitleComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(leaveStateLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(leaveStateComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							)
					.addGap(10)
					.addGroup(leftTopGroupLayout.createParallelGroup()
							.addComponent(fillInPeopleLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(fillInPeopleComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(businessAgentLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(businessAgentComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							)
					.addGap(10)
					.addGroup(leftTopGroupLayout.createParallelGroup(Alignment.CENTER)
							.addComponent(leavePeriodLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(calendarPanel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							)		
					.addGap(10)
				);
		
		GroupLayout leftMiddleGroupLayout=new GroupLayout(leftMiddlePanel);
		leftMiddlePanel.setLayout(leftMiddleGroupLayout);
		leftMiddleGroupLayout.setHorizontalGroup(
				leftMiddleGroupLayout.createSequentialGroup()
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
	                     GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(leftMiddleGroupLayout.createParallelGroup()
							.addGroup(leftMiddleGroupLayout.createSequentialGroup()
									.addGroup(leftMiddleGroupLayout.createParallelGroup()
											.addComponent(eventDescriptionLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									.addGap(10)
									.addGroup(leftMiddleGroupLayout.createParallelGroup()
											.addComponent(eventDescriptionTextArea,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									)
							)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
		                     GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					);
		leftMiddleGroupLayout.setVerticalGroup(
				leftMiddleGroupLayout.createSequentialGroup()
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
	                     GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(leftMiddleGroupLayout.createParallelGroup(Alignment.CENTER)
						.addComponent(eventDescriptionLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(eventDescriptionTextArea,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
	                     GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				);
		
		GroupLayout leftButtomGroupLayout=new GroupLayout(leftButtomPanel);
		leftButtomPanel.setLayout(leftButtomGroupLayout);
		leftButtomGroupLayout.setHorizontalGroup(
				leftButtomGroupLayout.createSequentialGroup()
					.addGap(20)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
	                     GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(leftButtomGroupLayout.createParallelGroup()
							.addGroup(leftButtomGroupLayout.createSequentialGroup()
									.addGroup(leftButtomGroupLayout.createParallelGroup()
											.addComponent(courseAgentLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											.addComponent(classTimeLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									.addGap(10)
									.addGroup(leftButtomGroupLayout.createParallelGroup()
											.addComponent(courseAgentComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											.addComponent(classTimeComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									.addGap(30)
									.addGroup(leftButtomGroupLayout.createParallelGroup()
											.addComponent(classNameLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											.addComponent(classTeacherLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											.addComponent(courseNameLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
											)
									.addGap(10)
									.addGroup(leftButtomGroupLayout.createParallelGroup()
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
		leftButtomGroupLayout.setVerticalGroup(
				leftButtomGroupLayout.createSequentialGroup()
				.addGap(10)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
	                     GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(leftButtomGroupLayout.createParallelGroup()
						.addComponent(courseAgentLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(courseAgentComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(classNameLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(classNameComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						)
				.addGap(8)
				.addGroup(leftButtomGroupLayout.createParallelGroup()
						.addComponent(classTimeLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(classTimeComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(classTeacherLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(classTeacherComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						)
				.addGap(8)
				.addGroup(leftButtomGroupLayout.createParallelGroup()
						.addComponent(courseNameLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(courseNameComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
	                     GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGap(10)
				);
		
		GroupLayout leftGroupLayout=new GroupLayout(leftPanel);
		leftPanel.setLayout(leftGroupLayout);
		leftGroupLayout.setHorizontalGroup(
				leftGroupLayout.createSequentialGroup()
					.addGroup(leftGroupLayout.createParallelGroup()
							.addComponent(leftTopPanel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(leftMiddlePanel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(leftButtomPanel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							)
					.addGap(20)
					.addGroup(leftGroupLayout.createParallelGroup()
							.addComponent(enterButton,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(insertButton,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(finishButton,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							)
					);
		leftGroupLayout.setVerticalGroup(
				leftGroupLayout.createSequentialGroup()
					.addGroup(leftGroupLayout.createParallelGroup()
							.addComponent(leftTopPanel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addGroup(leftGroupLayout.createSequentialGroup()
									.addGap(50)
									.addComponent(enterButton,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
									)
							
							)
					.addGap(20)
					.addComponent(leftMiddlePanel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addGroup(leftGroupLayout.createParallelGroup()
							.addComponent(leftButtomPanel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addGroup(leftGroupLayout.createSequentialGroup()
									.addGap(30)
									.addComponent(insertButton,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
									.addGap(20)
									.addComponent(finishButton,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
									)
							)
					);
		
		GroupLayout centerGroupLayout=new GroupLayout(centerPanel);
		centerPanel.setLayout(centerGroupLayout);

		centerGroupLayout.setHorizontalGroup(centerGroupLayout.createSequentialGroup()
				.addGap(20)
				.addComponent(jSeparator)
				);
		centerGroupLayout.setVerticalGroup(centerGroupLayout.createSequentialGroup()
				.addComponent(jSeparator)
				);
		
		GroupLayout rigthtGroupLayout=new GroupLayout(rightPanel);
		rightPanel.setLayout(rigthtGroupLayout);

		rigthtGroupLayout.setHorizontalGroup(rigthtGroupLayout.createSequentialGroup()
				.addComponent(tablePanel)
				);
		rigthtGroupLayout.setVerticalGroup(rigthtGroupLayout.createSequentialGroup()
				.addComponent(tablePanel)
				);
		
		GroupLayout groupLayout=new GroupLayout(panel);
		panel.setLayout(groupLayout);
		
		groupLayout.setHorizontalGroup(
				groupLayout.createSequentialGroup()
				.addComponent(leftPanel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
				.addComponent(centerPanel,0,60,GroupLayout.PREFERRED_SIZE)
				.addComponent(rightPanel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
				);
		
		groupLayout.setVerticalGroup(
				groupLayout.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup()
						.addComponent(leftPanel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(centerPanel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(rightPanel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						)
				);
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@SuppressWarnings("unchecked")
	public JSONObject pressEnterButtonState() {
		JSONObject jsonObject=new JSONObject();
	
		jsonObject.put("jobTitle", jobTitleComboBox.getSelectedItem());
		jsonObject.put("leaveState",leaveStateComboBox.getSelectedItem());
		jsonObject.put("fillInPeople", fillInPeopleComboBox.getSelectedItem());
		jsonObject.put("businessAgent", businessAgentComboBox.getSelectedItem());
		jsonObject.put("eventDescription", eventDescriptionTextArea.getText());
		return jsonObject;
	}
	
	@SuppressWarnings("unchecked")
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
	
	public void disableLeftTopAndMiddlePanel() {
		jobTitleComboBox.setEnabled(false);
		fillInPeopleComboBox.setEnabled(false);
		leaveStateComboBox.setEnabled(false);
		businessAgentComboBox.setEnabled(false);
		eventDescriptionTextArea.setEnabled(false);
		
		enterButton.setEnabled(false);;
	}
	
	public void enableLeftTopAndMiddlePanel() {
		jobTitleComboBox.setEnabled(true);
		fillInPeopleComboBox.setEnabled(true);
		leaveStateComboBox.setEnabled(true);
		businessAgentComboBox.setEnabled(true);
		eventDescriptionTextArea.setEnabled(true);
		
		enterButton.setEnabled(true);;
	}
	
	public void disableLeftButtomPanel() {
		courseAgentComboBox.setEnabled(false);
		classTimeComboBox.setEnabled(false);
		classNameComboBox.setEnabled(false);
		classTeacherComboBox.setEnabled(false);
		courseNameComboBox.setEnabled(false);
		
		insertButton.setEnabled(false);
		finishButton.setEnabled(false);
	}
	
	public void enableLeftButtomPanel() {
		courseAgentComboBox.setEnabled(true);
		classTimeComboBox.setEnabled(true);
		classNameComboBox.setEnabled(true);
		courseNameComboBox.setEnabled(true);
		
		insertButton.setEnabled(true);
		finishButton.setEnabled(true);
	}
	
	public JComboBox<String> getJobTitleComboBox() {
		return jobTitleComboBox;
	}

	public JComboBox<String> getFillInPeopleComboBox() {
		return fillInPeopleComboBox;
	}

	public JComboBox<String> getLeaveStateComboBox() {
		return leaveStateComboBox;
	}

	public JComboBox<String> getBusinessAgentComboBox() {
		return businessAgentComboBox;
	}

	public JComboBox<String> getCourseAgentComboBox() {
		return courseAgentComboBox;
	}

	public JComboBox<String> getClassTimeComboBox() {
		return classTimeComboBox;
	}

	public JComboBox<String> getClassNameComboBox() {
		return classNameComboBox;
	}

	public JComboBox<String> getClassTeacherComboBox() {
		return classTeacherComboBox;
	}

	public JComboBox<String> getCourseNameComboBox() {
		return courseNameComboBox;
	}
	
	public void setCalendarPanel(JPanel calendarPanel) {
		this.calendarPanel=calendarPanel;
	}
	
	public void setTablePanel(JPanel tablePanel) {
		this.tablePanel=tablePanel;
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