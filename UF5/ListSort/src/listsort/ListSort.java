// Java program to demonstrate working of Comparator 
// interface and Collections.sort() to sort according 
// to user defined criteria. 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

// A class to represent a student. 
class Student { 
	private int 	id; 
	private String 	name, 
					address; 

	// Constructor 
	public Student(int id, String name, String address) { 
		this.id = id; 
		this.name = name; 
		this.address = address; 
	} 

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	// Used to print student details in main() 
	public String toString() { 
		return this.id + " " + this.name + " " + this.address; 
	} 
} 

class SortById implements Comparator<Student> { 
	// Used for sorting in ascending order of id .
	public int compare(Student a, Student b) { 
		return a.getId() - b.getId(); 
	} 
} 

class SortByName implements Comparator<Student> 
{ 
	// Used for sorting in ascending order of name.
	public int compare(Student a, Student b) { 
		return a.getName().compareTo(b.getName()); 
	} 
} 

// Main class.
public class ListSort { 
	public static void main (String[] args) { 
		List<Student> data = new ArrayList<Student>(); 
		data.add(new Student(111, "bbbb", "london")); 
		data.add(new Student(131, "aaaa", "nyc")); 
		data.add(new Student(121, "cccc", "jaipur")); 
//
		System.out.println("Unsorted"); 
		for (int i=0; i<data.size(); i++) 
			System.out.println(data.get(i)); 
//Java 7
		Collections.sort(data, new SortById()); 
		System.out.println("\nSorted by id"); 
		for (int i=0; i<data.size(); i++) 
			System.out.println(data.get(i));
//Java 7
		Collections.sort(data, new SortByName()); 
		System.out.println("\nSorted by name"); 
		for (int i=0; i<data.size(); i++) 
			System.out.println(data.get(i));			
//Java 8
		System.out.println("\nSorted by id (Java 8)"); 
		data.sort(Comparator.comparing(Student::getId));
		data.forEach(System.out::println);
		
		System.out.println("\nSorted by name (Java 8)"); 
		data.sort(Comparator.comparing(Student::getName));
		data.forEach(System.out::println);
		
		System.out.println("\nReverse sorted by name (Java 8)"); 
		data.sort(Comparator.comparing(Student::getName).reversed());
		data.forEach(System.out::println);
	}
} 
