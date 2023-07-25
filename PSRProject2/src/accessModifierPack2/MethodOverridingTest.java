package accessModifierPack2;

import accessModifierPack1.MethodOverriding;

public class MethodOverridingTest extends MethodOverriding 

{
	public void methodOverriding()
	{
		System.out.println("I am from Test");
	}
	
	public static void main(String[] args)
	{
		MethodOverridingTest obj=new MethodOverridingTest();
		obj.methodOverriding();
		
		MethodOverriding obj1= new MethodOverriding();
		obj1.methodOverriding();
		
		
	}

}
