package inheritanceTypes;

class Animal
{
	void eat()
	{
		System.out.println("Animals are eating");
	}
	void sleep()
	{
		System.out.println("Animals are eating");
	}

}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Lol Lol");
	}
}

class HomeDog extends Dog
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
