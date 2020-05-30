package Gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AssignmentAdder extends JFrame {

	public AssignmentAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelSubject = new JLabel("suject: ",JLabel.TRAILING);
		JTextField fieldsubject = new JTextField(10);
		labelSubject.setLabelFor(fieldsubject);
		panel.add(labelSubject);
		panel.add(fieldsubject);
		
		JLabel labelname = new JLabel("assignmentname: ",JLabel.TRAILING);
		JTextField fieldname = new JTextField(10);
		labelname.setLabelFor(fieldname);
		panel.add(labelname);
		panel.add(fieldname);
		
		JLabel labelmethod = new JLabel("assignmentmethod: ",JLabel.TRAILING);
		JTextField fieldmethod = new JTextField(10);
		labelmethod.setLabelFor(fieldmethod);
		panel.add(labelmethod);
		panel.add(fieldmethod);
		
		JLabel labelperiod = new JLabel("assignmentperiod: ",JLabel.TRAILING);
		JTextField fieldperiod = new JTextField(10);
		labelperiod.setLabelFor(fieldperiod);
		panel.add(labelperiod);
		panel.add(fieldperiod);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
	
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}

}
