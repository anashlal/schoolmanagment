package schoolManagment.SchoolManagment;


import java.util.*;

import schoolManagment.SchoolManagment.ImplementStudentList;

public class Schoolmanagement {
	
	ImplementStudentList studentList =  new ImplementStudentList();
	ImplementCourseList courseList = new  ImplementCourseList();
	
	Scanner scanerInput = new Scanner(System.in);
	
	public Schoolmanagement() {
		
	}

	public void Go() {

		boolean running = true;

		Date date = new Date();

		while (running) {
			System.out.println("Welcome To our School Management");

			System.out.println(" " + date.toString() + " ");

			System.out.println("\nPlease Select From The List : " + 
					 "1:= Students  " +
							 "2 := Courses  "  
									+ "3 :=  info");

		
			int Selections = studentList.inputNumber(1, 3);
			switch (Selections) {
			case 1:
				studentList.StudAction();
				break;

			case 2:
				courseList.corsAction();
				break;

			case 3:
				System.out.print(" Hi through this program you can add students and"
						+ " search for students in different ways and delete and"
						+ " add Kush and delete and search for him and"
						+ " you can also know the name of the teacher Kush.");
				
				
				
				running = false;
				break;

			default:
				System.out.println("Worng Entry PLs check the Options");
			}

			System.out.println("Do You Want Open The System Again ? (Y/N)");

			String reboot = scanerInput.next();
			switch (reboot) {
			case "y":
				running = true;
				break;

			case "n":
				running = false;
				break;

			default:
				System.out.println("Worng Entry PLs check the Options");
				System.out.println("please enter coorect latter(  y  /  n  ) ");
				running = true;
				for(int i = 1; i<=3; i++)
				break;

			
			}
			

		}
		

	}

}
