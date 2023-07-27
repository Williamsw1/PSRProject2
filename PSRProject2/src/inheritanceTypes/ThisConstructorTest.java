package inheritanceTypes;

public class ThisConstructorTest {
	int a,b;
	ThisConstructorTest()
	{
		this(10,20);
		System.out.println("Default cons called");
		
	}
	ThisConstructorTest(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Arg based constructor: "+a+" "+b);;
	}
	
	public static void main(String[] args)
	{
		ThisConstructorTest obj = new ThisConstructorTest();
	}

}
