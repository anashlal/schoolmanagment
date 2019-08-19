package schoolManagment.SchoolManagment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ImplementStudentList implements StudentList {
	
	private static final int startDate = 0;

	private static final int weekDuration = 0;

	private List<Student> StudentList = new ArrayList<Student>();
	
	static Scanner in = new Scanner(System.in);
	
	public ImplementStudentList() {
		
	}
	
	public List<Student> getStudentList() {
		return StudentList;
	}

	public void setStudentList(List<Student> studentList) {
		StudentList = studentList;
	}

	public Student CreatStd() {
		
		List<Student> StudentList = new ArrayList<>();
		Student std =new Student("name", "email", "address");
		
			System.out.println("please enter student name ");
			String StdentName = in.next();
			std.setName(StdentName);
			
			System.out.println("please enter student email ");
			String studentEmail = in.next();
			std.setEmail(studentEmail);
			
			System.out.println("please enter student address ");
			String studentAddress = in.next();
			std.setAddress(studentAddress);
			System.out.println(std);
			StudentList.add(std);
			return saveStudent(std);

		}

	public Student saveStudent(Student std) throws IllegalArgumentException {
		if (std == null) {
			throw new IllegalArgumentException();
		} else {
			StudentList.add(std);
			return std;
		}
	}

	public Student findByEmail(String email) {
		for (Student std : StudentList) {
			if (std.getEmail().equals(email))
				return std;
		}
		return null;
	}

	public List<Student> findByName(String name) {
		List<Student> result = new ArrayList<>();
		for (Student std : StudentList) {
			if (std.getName().equalsIgnoreCase(name))
				result.add(std);
		}
		return result;
	}

	public Student findById(int id) {
		for (Student std : StudentList) {
			if (std.getId() == id)
				return std;
		}
		return null;
	}

	public List<Student> findAll() {
		System.out.println(StudentList);
		return StudentList;
	}

	public boolean deleteStudent(Student student) {
		boolean isDeleted = false;
		for (Student std : StudentList) {
			
			isDeleted = StudentList.remove(std);
			if (isDeleted)
			{
				System.out.println("Student Has Been Removed");
			} 
			else {
				System.out.println("Student Has Not Been Removed");
			}
			return isDeleted;
		}
		return false;
	}

	public String getString() {

		return in.nextLine();
	}

	public int getInt() {

		return in.nextInt();
	}

	public boolean PlayAgain() {

		String upperCase = in.nextLine().toUpperCase();
		switch (upperCase) {
		case "Y":
			System.out.println("System Open Again");
			return true;
		default:
			System.out.println("    See You Soon ");
			return false;
		}
	}
	

	public int inputNumber(int startPosition, int endPosition) {
		int number = 0;
		boolean run = true;
		while (run) {
			while (run) {
				try {
					number = in.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println(e);
					System.out.print("Enter Number Please... ");
				} finally {
					in.nextLine();
				}
			}
			if (startPosition == 0 && endPosition == 0)
				endPosition = number;
			if (number >= startPosition && number <= endPosition)
				break;
			else {
				System.out.println(
						"Incorrect Input Pls Select Between: " + startPosition + " <=> " + endPosition + " \n");
			}
		}
		return number;
	}

	public void StudAction() {

		System.out.println("Welcome to Student Section" + "10 := Add New Student " + "11 := Search  " + "12 := Delete"
				+ "13 := Show All " + "14 :=ADD Course " + "15 : =teacher name the course");

		int selections = in.nextInt();

		boolean running = true;

		while (running) {

			if (selections == 10) {
				System.out.println("You Can Add Here");
				CreatStd();
				break;
			}
			if (selections == 11) {
				System.out.println("Please Select" + "111 :=  By Name" + "112="+" "+" By Id " + "113="+" "+"  By Email");
				selections = in.nextInt();

				if (selections == 111) {
					System.out.println("please enter the stdent name ");
					String name = in.next();
					List<Student> students = this.findByName(name);
					for (Student std : students)  {
					 System.out.println(std);
					}
					
					break;
				}

				if (selections == 112) {
					System.out.println("please enter the stdent id ");
					int id = in.nextInt();
					Student student = this.findById(id);
					System.out.println(student);
					break;
				}

				if (selections == 113) {
					System.out.println("please enter the stdent email ");
					String email=in.next();
					Student student = this.findByEmail(email);
					System.out.println(student);
					break;
				}

				break;
			}
			if (selections == 12) {
				System.out.println("You Can Delete Here");
				System.out.println("enter id student");
				int Student_id=in.nextInt();
				Student student = this.findById(Student_id);
				System.out.println(student);
				System.out.println("press 122 to confirm delete ");
				int confirm=in.nextInt();
				if (confirm==122) {
					deleteStudent(student);
				}else {
					System.out.println("delete not confirmed");
				}
				
				break;
			}
			if (selections == 13) {
				System.out.println("Student List");
				findAll();
				break;
			}

			if (selections == 14) {
				System.out.println("Please enter the student id ");
				int studentID = in.nextInt();
				Student std = this.findById(studentID);
				System.out.println("Please enter the course id ");
				int courseID=in.nextInt();
				ImplementCourseList icl = new ImplementCourseList();
				Course ctd = icl.findById(courseID);
				List<Student> StudentListofcourse = new ArrayList<Student>();
				StudentListofcourse.add(std);
				ctd.setStudents(StudentListofcourse);

				System.out.println(ctd);
				break;
			}

			if (selections == 15) {
				System.out.println("what the course name");
				System.out.println("writ : 1 = java  or 2 = C_plus");
				int courseName =in.nextInt();
				switch(courseName) {
				case 1 :
				System.out.println(Teachers.TEACHER_JAVA.val);
				
				case 2 :
					System.out.println(Teachers.TEACHER_C_PLUS.val);
					
				default :
					System.out.println("please enter 1  or  2");
				}

			}

		}
	}


}
