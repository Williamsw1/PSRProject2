package polymorphism;

class Parent
{
	String name;
	void show()
	{
		System.out.println("Parent show method");
	}
	void display()
	{
		System.out.println("Parent display method");
	}
	
}
class Child extends Parent
{
	int id;
	void show()
	{
		System.out.println("Child show method");
	}
	
	void childMethod()
	{
		System.out.println("ChildMethod in child class");
	
	}
	
}

class UpCastingDownCasting 
{
	public static void main(String[] args)
	{
		//Parent obj1= new Parent();
		//upcasting
		Parent obj1=new Child();
		obj1.name="XXX";
		//obj1.name="MMM";
		System.out.println("Upcasting: "+obj1.name);
		obj1.show();
		obj1.display();
		//obj1.childMethod()//This will give error
		
		
		
		//downcasting (explicit casting)
		Child obj3 =(Child)obj1;
		obj3.id=1000;
		obj3.name="YYY";
		System.out.println("downcasting name: "+obj3.name);
		System.out.println("downcasting id: "+obj3.id);
		
		obj3.show();
		obj3.childMethod();
		obj3.display();
			
	}



}
