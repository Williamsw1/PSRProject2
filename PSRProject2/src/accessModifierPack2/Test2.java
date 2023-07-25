package accessModifierPack2;
import accessModifierPack1.*;

public class Test2 
{

public static void main(String[] args) 
	{
		Test1 test1 = new Test1();
		
		test1.display1();
		System.out.println(test1.data);
		
		Test3 test2 = new Test3();
		test2.display2();
		System.out.println(test2.data);
	
	}
}
