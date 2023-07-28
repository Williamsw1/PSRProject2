package interfaceMultipleInheritance;


abstract class EmployeeDetails1
{
	abstract void empDetails();
	
}

interface Salary
{
	int bonus=500;
	
	abstract void insertsalary(int salary);//abstract method
	
	default void display3()
	{
		display2();
	}
	
	static void display1()
	{
		System.out.println("i am from parent class");
		
	}
	
	private void display2()
	{
		System.out.println("private");
	}

}

interface OverWorkBonus
{
	double bonus=850;
	void extraBonus(int exBonus);
	default void overBonus()
	{
		System.out.println("I will receive extra bonus"+bonus);
	}
	
}

class DeptDept1 extends EmployeeDetails1 implements Salary,OverWorkBonus
{
	int salary;
	public void insertsalary(int salary)
	{
		this.salary=salary;
	}

	void printResult()
	{
		System.out.println("DeptDept1: "+this.salary);
		System.out.println("DeptDept1");
	}

	void empDetails() 
	{
		int emp_count=500;
		System.out.println("empcount: "+emp_count);
	
	}

	public void extraBonus(int extraBonus) {
		int increased_bonus=1000;
		int final_total=0;
		if (extraBonus>=500)
		{
			final_total =extraBonus+increased_bonus;
		}
		System.out.println("Final bonus amount: "+final_total);	
	}
		
}

class DeptDept2 implements Salary
{
	int salary;
	public void insertsalary(int salary)
	{
		this.salary=salary;
	}

	void printResult()
	{
		System.out.println("DeptDept2: "+this.salary);
		System.out.println("DeptDept2: "+bonus);
	}

}

class DepartmentTest
{
	public static void main(String... args)
	{
		Salary sal = new DeptDept2();
		Salary.display1();
		
		DeptDept2 dept = (DeptDept2)sal;
		dept.display3();
		
		
		DeptDept2 obj1 = new DeptDept2();
		

		obj1.insertsalary(1000);
		obj1.printResult();
		



		DeptDept1 obj2 = new DeptDept1();
		obj2.insertsalary(2000);
		obj2.printResult();
		obj2.extraBonus(500);

	}

}
