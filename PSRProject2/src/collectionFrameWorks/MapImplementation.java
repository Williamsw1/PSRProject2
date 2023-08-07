package collectionFrameWorks;

import java.util.HashMap;
import java.util.Map;

class Employee1 
{
	private int empId;
	private String empName;

	public Employee1(int empId, String empName)

	{

		this.empId = empId;
		this.empName = empName;
	}
	
	public int getId()
	{
		return empId;
	}
	
	public String getName()
	{
		return empName;
	}
	
	public void setId(int empId)
	{
		this.empId=empId;
	}
}

class Department {
	private int deptId;
	private String deptName;

	public Department(int deptId,String deptName)
	
	{
		this.deptId=deptId;
		this.deptName=deptName;
	}
	
	public int getId()
	{
		return deptId;
	}
	
	public String getName()
	{
		return deptName;
	}
	
	public void setId(int deptId)
	{
		this.deptId=deptId;
	}
	public void setName(String deptName)
	{
		this.deptName=deptName;
	}
		
}

public class MapImplementation {
	
	public static void main(String[] args) {
		
		Employee1 emp1 = new Employee1(101,"XXX");
		Employee1 emp2 = new Employee1(201,"YYY");
		
		Department dept1 = new Department(100,"CSE");
		Department dept2 = new Department(101,"IT");
		
		Map<Employee1,Department> empdept = new HashMap<>();
		empdept.put(emp1, dept1);
		empdept.put(emp2, dept2);
		
		//Accessing data
		for(Map.Entry<Employee1,Department> emp:empdept.entrySet())
		{
			Employee1 key=emp.getKey();
			Department value = emp.getValue();
			
			System.out.println("Employee1 key and value are: "+key.getId()+" "+key.getName());
			System.out.println("Department key and value are: "+value.getId()+" "+value.getName());
			
		}
		
		
	}

}
