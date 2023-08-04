package collectionFrameWorks;

import java.util.ArrayList;

class Employee {
	private String name;
	private int age;
	private double salary;

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public double getSalary()
	{
		return salary;
	}	
	public void displayInfo()
	{
		System.out.println("Name: "+name+" Age: "+age+" Salary: "+salary);
	}
}

class Company {
	private String name;
	
	private ArrayList<Employee> employees;
	
	public Company(String name)
	{
		this.name=name;
		this.employees=new ArrayList<>();
	}
	
	public void addEmployee(Employee emp)
	
	{
		employees.add(emp);
		
	}
	
	public void displayEmployees()
	{
		System.out.println("Employee at- "+name+":");
		for(Employee employee:employees)
		{
			employee.displayInfo();
		}
	}
	

}

public class CompanyEmployee {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("XXX",18,5000.0);
		Employee emp2 = new Employee("YYY",19,6000.0);
		
		Company cmp = new Company("ABC Group");
		cmp.addEmployee(emp1);
		cmp.addEmployee(emp2);
		cmp.displayEmployees();

	}

}
