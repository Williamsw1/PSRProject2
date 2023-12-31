package collectionFrameWorks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Employee {
	private String name;
	private int age;
	private double salary;

	
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public void displayInfo() {
		System.out.println("Name: " + name + " Age: " + age + " Salary: " + salary);
	}
}

class Company {
	
	
	
	private String name;

	private ArrayList<Employee> employees;

	public Company(String name) {
		this.name = name;
		this.employees = new ArrayList<>();
	}

	public void addEmployee(Employee emp)

	{
		employees.add(emp);

	}

	public void displayEmployees() {

//		employees.forEach((element) -> {
//			element.displayInfo();
//		});

		System.out.println("Employee at- " + name + ":");
		for (Employee employee : employees) {
			employee.displayInfo();
		}

	}

}

public class CompanyEmployee<K, V> {
	Map<String,Integer> map = new HashMap<String,Integer>();
	HashMap<K, V> mapentry = new HashMap<K, V>();
	
	public static void main(String[] args) {

		Employee emp1 = new Employee("XXX", 18, 5000.0);
		Employee emp2 = new Employee("YYY", 19, 6000.0);
		

		Company cmp = new Company("ABC Group");
		cmp.addEmployee(emp1);
		cmp.addEmployee(emp2);
		cmp.displayEmployees();

		/*
		 * Company1[] cmp1 = new Company1[50]; cmp1[0]=new Company1(); //cmp1[1]=new
		 * LaborWelfare();
		 * 
		 * Object[] obj = new Object[10]; obj[0] = new Object(); obj[1] = new
		 * LaborWelfare(); obj[2] = new Employee();
		 * 
		 */

	}

}
