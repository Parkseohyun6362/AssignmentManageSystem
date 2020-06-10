package Gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manage.AssignmentManage;

public class WindowFrame extends JFrame{
	AssignmentManage assignmentmanage;
	MenuSelection menuselection;
	AssignmentAdder assignmentadder;
	AssignmentViewer assingmentviewer;

	public WindowFrame(AssignmentManage assignmentmanage) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My AssignmentManage");
		
		this.assignmentmanage = assignmentmanage;
		this.menuselection =  new MenuSelection(this);
		this.assignmentadder = new AssignmentAdder(this);
		this.assingmentviewer = new AssignmentViewer(this,this.assignmentmanage);
		
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public AssignmentAdder getAssignmentadder() {
		return assignmentadder;
	}

	public void setAssignmentadder(AssignmentAdder assignmentadder) {
		this.assignmentadder = assignmentadder;
	}

	public AssignmentViewer getAssingmentviewer() {
		return assingmentviewer;
	}

	public void setAssingmentviewer(AssignmentViewer assingmentviewer) {
		this.assingmentviewer = assingmentviewer;
	}
	
}
