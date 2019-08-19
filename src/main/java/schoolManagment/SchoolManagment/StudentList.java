package schoolManagment.SchoolManagment;

import java.util.List;

public interface StudentList {
	
	Student saveStudent(Student student);
	Student findByEmail(String email);
	List<Student> findByName(String  name);
	Student findById(int id);
	List<Student> findAll();
	boolean deleteStudent(Student student);

	public interface ScannerInputDAO {

		String getString();
		int getInt();
		int inputNumber(int i, int j);
		boolean PlaySystemAgain();
	}

	int inputNumber(int i, int j);

	public void  StudAction();
}
