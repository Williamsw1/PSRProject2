package interfaceMultipleInheritance;


interface Employee {
	// Regular abstract method
	void displayDetails();

	// Default method
	default void defaultMethod() {
		displayPrivateDetails(); // Calling private method from the default method
		System.out.println("This is a default method.");
	}

	// Static method
	static void staticMethod() {
		displayPrivateStaticDetails(); // Calling private static method from the static method
		System.out.println("This is a static method.");
	}

	// Private method
	private void displayPrivateDetails() {
		System.out.println("This is a private method.");
	}

	// Private static method
	private static void displayPrivateStaticDetails() {
		System.out.println("This is a private static method.");
	}
}

//EmployeeDetails implementing class
class EmployeeDetails implements Employee {
	private String name;
	private int age;

	public EmployeeDetails(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void displayDetails() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Age: " + age);
	}

	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails("John Doe", 30);

		emp.displayDetails();
		emp.defaultMethod();
		Employee.staticMethod();
	}
}
