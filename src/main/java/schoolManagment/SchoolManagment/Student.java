package schoolManagment.SchoolManagment;

import java.time.LocalDate;
import java.util.List;

public class Student {

	int id;
	private String name;
	private String email;
	private String address;

	static int sequance = 1;

	public Student(String name, String email, String address) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.id = sequance++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static int getSequance() {
		return sequance;
	}

	public static void setSequance(int sequance) {
		Student.sequance = sequance;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}

	public void setStudents(List<Student> studentList) {
		
	}

	
}
