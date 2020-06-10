package Gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import assignment.AssignmentInput;
import manage.AssignmentManage;

public class AssignmentViewer extends JPanel {

	WindowFrame frame;
	
	AssignmentManage assignmentmanage;
	
	public AssignmentViewer(WindowFrame frame, 	AssignmentManage assignmentmanage) {
		this.frame = frame;
		this.assignmentmanage = assignmentmanage;
		
		System.out.println("***"+ assignmentmanage.size()+"***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Subject");
		model.addColumn("Assingname");
		model.addColumn("Method");
		model.addColumn("Period");
		
		for(int i=0;i<assignmentmanage.size();i++) {
			Vector row = new Vector();
			AssignmentInput ai= assignmentmanage.get(i);
			row.add(ai.getSubject());
			row.add(ai.getAssignmentname());
			row.add(ai.getMethod());
			row.add(ai.getPeriod());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
