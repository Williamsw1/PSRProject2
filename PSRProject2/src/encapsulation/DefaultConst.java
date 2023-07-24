package encapsulation;



class DefaultConst
{
	String emp_name;
	int id;
	
	DefaultConst(int id)
	{
		this.id=id;
		System.out.println("Default constructor:"+emp_name+" "+id);

	}
	 void display()
	 {
		// int x=20;
	  System.out.println("EmployeeData: "+id);
	 }

	public static void main(String[] args)
	{
		DefaultConst emp = new DefaultConst(100);
		emp.display();
	}
}
