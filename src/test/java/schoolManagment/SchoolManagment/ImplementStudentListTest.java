package schoolManagment.SchoolManagment;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;


public class ImplementStudentListTest {
	private static final String IsEmptyCollection = null;
	private List<Student> StudentList = new ArrayList<Student>();

		
	@Test
	public void testImplementStudentList() {
		String name = null,  email = null,  address = null,expected = null ;
		String actual =ImplementStudentList(name,email,address);
		Assert.assertEquals(expected, actual);
		
		
	}

	private String ImplementStudentList(String name, String email, String address) {
		return null;
	}
	

	@Test
	public void testSaveStudent() {
		 List<String> actual = Arrays.asList("a", "b", "c");
	        List<String> expected = Arrays.asList("a", "b", "c");
			
			
	        assertThat(actual, is());

	        assertThat(actual, hasItems("b"));

	        assertThat(actual, hasSize(3));
	        	
	}
	
	private void assertThat(List<String> actual, Matcher<? super List<String>> matcher) {
		
	}

	

	private Matcher<? super List<String>> hasSize(int i) {
		return null;
	}

	private Matcher<? super List<String>> hasItems(String string) {
		return null;
	}

	private Matcher<? super List<String>> is() {
		return null;
	}

	@Test
	public void testFindByEmail() {
		StudentList.add(null);
		Object[] expecteds = null;
		Object[] actuals = null;
		assertArrayEquals(IsEmptyCollection, expecteds, actuals);
	}

	@Test
	public void testFindByName() {
		setStudentList(StudentList);
		String message;
		Object[] expecteds = null;
		Object[] actuals = null;
		assertArrayEquals(IsEmptyCollection, expecteds, actuals);
	}

	private void setStudentList(List<Student> studentList2) {
		
	}

	@Test
	public void testFindById() {
		String name = null,email = null,address = null;
		ImplementStudentList(name,email,address);
		Object[] expecteds = null;
		Object[] actuals = null;
		assertArrayEquals(name, expecteds, actuals);
	}

	

}
