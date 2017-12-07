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
	
	
	private JLabel jobTitleLabel,leavePeriodLabel,writeNameLabel,
					eventDescriptionLabel,leaveStateLabel,proxyNameLabel;
	private JComboBox jobTitleComboBox,leavePeriodComboBox,writeNameComboBox,
						leaveStateComboBox,proxyNameComboBox;
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
		writeNameLabel=new JLabel(TextContent.writeNameText);
		eventDescriptionLabel=new JLabel(TextContent.eventDescriptionText);
		leaveStateLabel=new JLabel(TextContent.leaveStateText);
		proxyNameLabel=new JLabel(TextContent.proxyNameText);
		
		jobTitleComboBox=new JComboBox(new String[]{"a","b"});
		leavePeriodComboBox=new JComboBox(new String[]{"a","b"});
		writeNameComboBox=new JComboBox(new String[]{"a","b"});
		leaveStateComboBox=new JComboBox(new String[]{"a","b"});
		proxyNameComboBox=new JComboBox(new String[]{"a","b"});
			
		jFrame.setLocation(300, 400);
		jPanel.setPreferredSize(new Dimension(500, 500));
		
		GroupLayout groupLayout=new GroupLayout(jPanel);
		jPanel.setLayout(groupLayout);
	
		groupLayout.setHorizontalGroup(
				groupLayout.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup()
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(jobTitleLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(writeNameLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(leaveStateLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
								)
						)
				.addGroup(groupLayout.createParallelGroup()
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(jobTitleComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
								.addComponent(writeNameComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
								.addComponent(leaveStateComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
								)
						)
				.addGroup(groupLayout.createParallelGroup()
						.addGroup(group)
						)
				
		);
		
		groupLayout.setVerticalGroup(
				groupLayout.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup()
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(jobTitleLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
					
						)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(jobTitleComboBox,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
						)
				)

			);
		
		jFrame.add(jPanel);
		jFrame.pack();
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
