package polymorphism;

class Animal 
{
	public void animalSound() 
	{
		System.out.println("Gar Gar");
	}
}
class Dog extends Animal {
	public void animalSound()
	{
		System.out.println("lol lol");
	}
}
class Pig extends Animal 
{
	public void animalSound()
	{
		System.out.println("um um");
	}
}

public class PolymorphismExample 
{
	public static void main(String[] args)
	{
		
	Animal obj1 = new Animal();
	
	Animal obj2 = new Dog();
	Animal obj3 = new Pig();
	
	obj1.animalSound();
	obj2.animalSound();
	obj3.animalSound();
	
	
	}
	
}
