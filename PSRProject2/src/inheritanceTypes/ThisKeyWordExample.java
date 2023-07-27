package inheritanceTypes;

public class ThisKeyWordExample {
	int num=20;
	public ThisKeyWordExample()
	{
		System.out.println("Default");
	}
	
	public ThisKeyWordExample(int num)
	{
		this();
		this.num=num;
		System.out.println("One Arg constructor: "+num);
	}
	void display()
	{
		this.show();
		System.out.println("display "+this.num);
	}

	void show() {
		// TODO Auto-generated method stub
		System.out.println("show "+this.num);
	}
	
	public static void main(String[] args)
	{
		ThisKeyWordExample obj = new ThisKeyWordExample(50);
		obj.display();
		ThisKeyWordExample obj1 = new ThisKeyWordExample(100);
		
		
		obj1.display();
	}

}
