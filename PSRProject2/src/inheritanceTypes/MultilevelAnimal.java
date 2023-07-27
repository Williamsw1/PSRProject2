package inheritanceTypes;

class Animal1
{
	Animal1()
	{
		super();
	}
	
	void eat()
	{
		System.out.println("Animals are eating");
	}
	void sleep()
	{
		System.out.println("Animals are eating");
	}

}
class Dog1 extends Animal1
{
	void bark()
	{
		System.out.println("Lol Lol");
	}
}

class HomeDog extends Dog1
{
	void biting()
	{
		System.out.println("Chasing people to bite");
	}

}
public class MultilevelAnimal {
	public static void main(String[] args)
	{
		HomeDog obj = new HomeDog();
		obj.bark();
		obj.biting();
		obj.sleep();
		obj.eat();
	}
	

}
