package MVC;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.xml.soap.Text;

public class View {
	private JFrame jFrame;
	private JPanel jPanel;
	
	
	private JLabel jobTatileLabel;
	View() {
		initView();
	}
	
	public static View getViewObject() {
		return new View();
	}
	
	private void initView() {
		jFrame=new JFrame("Taisin");
		jPanel=new JPanel();
		jobTatileLabel=new JLabel(TextContent.jobTitleText);
		
		
		jFrame.setLocation(300, 400);
		jPanel.setPreferredSize(new Dimension(500, 500));
		
		GroupLayout groupLayout=new GroupLayout(jPanel);
		jPanel.setLayout(groupLayout);
	
		groupLayout.setHorizontalGroup(
				groupLayout.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
			                     GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(jobTatileLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
			                     GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						)
				)
		);
		
		groupLayout.setVerticalGroup(
				groupLayout.createSequentialGroup()
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
	                     GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
						.addComponent(jobTatileLabel,0,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
				
				)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
	                     GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			);
		
		jFrame.add(jPanel);
		jFrame.pack();
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
