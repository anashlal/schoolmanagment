package schoolManagment.SchoolManagment;

import java.util.ArrayList;
import java.util.List;

public class Course {

	static int sequance = 1;
	private int id;
	private String courseName;
	private int startDate;
	private int weekDuration;
	private List<Student> students;

	public Course(String courseName, int startDate, int weekDuration) {
		super();
		this.courseName = courseName;
		this.startDate = startDate;
		this.weekDuration = weekDuration;
		this.id = sequance++;
	}

	public Course() {

	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getStartDate() {
		return startDate;
	}

	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}

	public int getWeekDuration() {
		return weekDuration;
	}

	public void setWeekDuration(int weekDuration) {
		this.weekDuration = weekDuration;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", startDate=" + startDate + ", weekDuration="
				+ weekDuration + ", students=" + students + "]";
	}

	public int getCourseID(int id) {
		return this.id = id;
	}

}
