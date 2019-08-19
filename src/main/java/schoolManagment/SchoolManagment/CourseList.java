package schoolManagment.SchoolManagment;


import java.util.List;

public interface CourseList {
	
	Course saveCourse(Course course);
	Course findById(int id);
	List<Course> findByName(String name);
	List<Course> findAll();
	boolean removeCourse(Course course);
}
