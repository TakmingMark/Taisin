package MVC;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.xml.soap.Text;

public class View {
	private JFrame jFrame;
	private JPanel jPanel;
	
	
	private JLabel jobTitleLabel,leavePeriodLabel,fillInPeopleLabel,
					eventDescriptionLabel,leaveStateLabel,businessAgentLabel,
					courseAgentLabel,classTimeLabel,classNameLabel,
					classTeacherLabel,courseNameLabel;
	private JComboBox jobTitleComboBox,leavePeriodComboBox,fillInPeopleComboBox,
						leaveStateComboBox,businessAgentComboBox,courseAgentComboBox,
						classTimeComboBox,classNameComboBox,classTeacherComboBox,
						courseNameComboBox;
	private JTextArea eventDescriptionTextArea;
	
	View() {
		initView();
	}
	
	public static View getViewObject() {
		return new View();
	}
	
	private void initView() {
		jFrame=new JFrame("Taisin");
		jPanel=new JPanel();
		jobTitleLabel=new JLabel(TextContent.jobTitleText);
		leavePeriodLabel=new JLabel(TextContent.leavePeriodText);
		fillInPeopleLabel=new JLabel(TextContent.fillInPeopleText);
		eventDescriptionLabel=new JLabel(TextContent.eventDescriptionText);
		leaveStateLabel=new JLabel(TextContent.leaveStateText);
		businessAgentLabel=new JLabel(TextContent.businessAgentText);
		
		jobTitleComboBox=new JComboBox(new String[]{"a","b"});
		leavePeriodComboBox=new JComboBox(new String[]{"a","b"});
		fillInPeopleComboBox=new JComboBox(new String[]{"a","b"});
		leaveStateComboBox=new JComboBox(new String[]{"a","b"});
		businessAgentComboBox=new JComboBox(new String[]{"a","b"});
		
		eventDescriptionTextArea=new JTextArea(5,5);
		jFrame.setLocation(300, 400);
		jPanel.setPreferredSize(new Dimension(500, 500));
		
		GroupLayout groupLayout=new GroupLayout(jPanel);
		jPanel.setLayout(groupLayout);
	
		groupLayout.setHorizontalGroup(
				groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup()
							.addComponent(jobTitleLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(fillInPeopleLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(leaveStateLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
								)
						.addGroup(groupLayout.createParallelGroup()
								.addComponent(jobTitleComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
								.addComponent(fillInPeopleComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
								.addComponent(leaveStateComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
								)
						.addGroup(groupLayout.createParallelGroup()
								.addComponent(leavePeriodLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
								.addComponent(eventDescriptionLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
								.addComponent(businessAgentLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
								)
						.addGroup(groupLayout.createParallelGroup()
								.addComponent(leavePeriodComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
								.addComponent(eventDescriptionTextArea,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
								.addComponent(businessAgentComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
								)
				
		);
		
		groupLayout.setVerticalGroup(
				groupLayout.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup()
						.addComponent(jobTitleLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(jobTitleComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(leavePeriodLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(leavePeriodComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						)
				.addGroup(groupLayout.createParallelGroup()
						.addComponent(fillInPeopleLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(fillInPeopleComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(eventDescriptionLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(eventDescriptionTextArea,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						)
				.addGroup(groupLayout.createParallelGroup()
						.addComponent(leaveStateLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(leaveStateComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(businessAgentLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(businessAgentComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						)			
			);
		
		jFrame.add(jPanel);
		jFrame.pack();
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
