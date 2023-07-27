package inheritanceTypes;

class Animal
{
	String name;
	Animal(String name)
	{
		//super();
		System.out.println("Animal Constructor");
		//display();
		this.name=name;
		display();
		
	}
	
	void animalName()
	{
		System.out.println("My name"+name);
	}
	
	void display()
	{
		System.out.println("Animal Display"+name);
	}
	
	
}

class Dog extends Animal
{
	String name;
	Dog(String name) {
		
		
		super(name);
		this.name=name;
		System.out.println("Dog Constructor");
		animalName();
		// TODO Auto-generated constructor stub
	}
	void animalName()
	{
		System.out.println("Inside Dog "+name);
	}
	
	void show()
	{
		System.out.println("Dog Show");
	}
	

}


public class AnimalTest {
	
	void animalTest()
	{
		System.out.println("I am inside Animal Test");
	}
	public static void main(String[] args)
	{
		//Animal anObj = new Animal("xxx");
		Dog doObj = new Dog("Home Dog");
		//doObj.animalName();
		
		
	}

}
