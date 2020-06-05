package Gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{
	MenuSelection menuselection;
	AssignmentAdder assignmentadder;
	AssignmentViewer assingmentviewer;
	
	public WindowFrame() {
		this.menuselection =  new MenuSelection(this);
		this.assignmentadder = new AssignmentAdder(this);
		this.assingmentviewer = new AssignmentViewer(this);
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
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
