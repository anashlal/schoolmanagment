package schoolManagment.SchoolManagment;

import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImplementCourseList implements CourseList {

	Scanner scanerInput = new Scanner(System.in);
	static List<Course> CoursesList = new ArrayList<Course>();

	public List<Course> getCoursesList() {
		return CoursesList;
	}

	public void setCoursesList(List<Course> coursesList) {
		CoursesList = coursesList;
	}

	public void CreatCourse() {

		Course Courses = new Course();

		System.out.println("please enter course name ");
		String courseName = scanerInput.next();
		Courses.setCourseName(courseName);
		System.out.println(" please add start date example (20160816)");
		int courseDate = scanerInput.nextInt();
		Courses.setStartDate(courseDate);
		System.out.println(" please add course duration by month");
		int courseDuration = scanerInput.nextInt();
		System.out.println("course duration" + ": " + courseDuration + " month");
		Courses.setWeekDuration(courseDuration);
		saveCourse(Courses);
		CoursesList.add(Courses);
		System.out.println(Courses);
	}

	@Override
	public Course saveCourse(Course course) {
		if (course == null) {
			throw new IllegalArgumentException();

		} else {
			CoursesList.add(course);
			return course;
		}

	}

	@Override
	public List<Course> findByName(String name) {

		List<Course> result = new ArrayList<>();
		for (Course cor : CoursesList) {
			if (cor.getCourseName().equalsIgnoreCase(name)) {
				result.add(cor);
				System.out.println(cor);
			}
		}
		return result;
	}

	public Course findById(int id) {

		for (Course cor : CoursesList)
			if (cor.getCourseID(id) == id) {
				return cor;
			}
		return null;

	}

	@Override
	public List<Course> findAll() {
		System.out.println(CoursesList);
		return CoursesList;
	}

	@Override
	public boolean removeCourse(Course course) {
		boolean isDeleted = false;
		for (Course cor : CoursesList) {
			isDeleted = CoursesList.remove(cor);
			if (isDeleted)
				System.out.println("Course Has Been Removed");
			else
				System.out.println("course Has Not Been Removed");
			return isDeleted;
		}
		return false;
	}

	public void toPrintCourse(Course course) {
		for (Course cor : CoursesList) {
			System.out.println(cor);
		}
	}

	public void corsAction() {

		System.out.println("Welcome to Course Section" + "\n20-|| Add New Course ||" + "\n21-||     Search     ||"
				+ "\n22-||     Delete     ||" + "\n23-||     Find All   ||");
		int selections = scanerInput.nextInt();

		boolean running = true;

		while (running) {

			if (selections == 20) {
				System.out.println("You Can Add Here");
				CreatCourse();
				break;
			}

			if (selections == 21) {
				System.out.println("Please Select" + "\n211-||  By Name  ||" + "\n212-||  By Id    ||");
				selections = scanerInput.nextInt();

				if (selections == 211) {
					System.out.println("please enter course name ");
					String name = scanerInput.next();
					List<Course> courses = findByName(name);
					for (Course cor : courses) {
						System.out.println(cor);
					}
					break;
				}

				if (selections == 212) {
					System.out.println("please enter course id");
					int CourseID = scanerInput.nextInt();
					Course cours = findById(CourseID);
					System.out.println(cours);
					break;
				}
				break;
			}

			if (selections == 22) {
				System.out.println("You Can Delete Here");
				System.out.println("please enter course id ");
				int CourseId = scanerInput.nextInt();
				Course Cor = (Course) findById(CourseId);
				System.out.println(Cor);
				removeCourse(Cor);
				System.out.println(Cor + "has been removed ");
				break;
			}

			if (selections == 23) {
				findAll();
				break;
			}

		}
	}
}
