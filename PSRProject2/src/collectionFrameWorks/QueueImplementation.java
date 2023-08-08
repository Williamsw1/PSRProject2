package collectionFrameWorks;

import java.util.LinkedList;

import java.util.Queue;

class Student {
	private String name;
	private int rollNumber;
	private String department;

	public Student(String name, int rollNumber, String department) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	// conversion of object to string using (toString() method)
	public String toString() {
		return "Name: " + name + ",RollNumber: " + rollNumber + ",Department:" + department;
	}
}

public class QueueImplementation {

	public static void main(String[] args) {

		Queue<Student> studentQueue = new LinkedList<>();
		
		studentQueue.add(new Student("XXX", 1000, "CSE"));
		studentQueue.add(new Student("YYY", 2000, "IT"));
		System.out.println("Students information to be printed");

		for (Student student : studentQueue) {
			System.out.println(student);
		}

		Student removedStudent = studentQueue.poll();
		if (removedStudent != null) {
			System.out.println("\nRemoved Student: " + removedStudent);
		}

		System.out.println("\nStudent data after removal");

		for (Student student : studentQueue) {
			System.out.println(student);
		}

	}

}
