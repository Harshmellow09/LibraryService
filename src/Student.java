import java.util.Scanner;
import java.util.ArrayList;

/** This class is responsible for keeping track of students name and ID 
 * 
 * @author Rebecca
 * 24/10/2019
 * implement students using an ArrayList
 */

public class Student {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	}
	
	//private variables
	private int id;
	private String name;
	
	//constructor - creates a new Student object when keyword is called by initialising values.
	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	//@returns student id.
	public int getId() {
		return id;
	}
	//@returns students name.
	public String getName() {
		return name;
	}
	
	//private List<Student> student;
	//private List<Id> id;
	
}
