package manage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import Gui.WindowFrame;
import log.EventLogger;

public class Menumanagement {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		AssignmentManage assignmentmanage = getObject("assignmentmanage.ser");
		if(assignmentmanage == null) {
			assignmentmanage = new AssignmentManage(input);
		}
		else {
			assignmentmanage.setScanner(input);
		}
		
		WindowFrame frame = new WindowFrame(assignmentmanage);
		selectMenu(input, assignmentmanage);
		putObject(assignmentmanage,"assignmentmanage.ser");
	}
	
	public static void selectMenu(Scanner input,AssignmentManage assignmentmanage) {
		int num =-1;
		while(num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				
				switch(num) {
				case 1:
					assignmentmanage.Addassignment();
					logger.log("add assignment");
					break;
				case 2:
					assignmentmanage.Deleteassignment();
					logger.log("delete assignment");
					break;
				case 3:
					assignmentmanage.Editassignment();
					logger.log("edit assignment");
					break;
				case 4:
					assignmentmanage.Viewassignments();
					logger.log("view assignment");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e){
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	public static void showMenu() {
		System.out.println(" This is your studying planner ! ");
		System.out.println("1. Add assignment");
		System.out.println("2. Delete assignment");
		System.out.println("3. Edit assignment");
		System.out.println("4. View assignments");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5 :");
	}
	
	public static AssignmentManage getObject(String filename) {
		AssignmentManage assignmentmanage = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			
			assignmentmanage = (AssignmentManage) in.readObject();
			
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return assignmentmanage;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return assignmentmanage;
	}
	
	public static void putObject(AssignmentManage assignmentmanage,String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(assignmentmanage);
			
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
