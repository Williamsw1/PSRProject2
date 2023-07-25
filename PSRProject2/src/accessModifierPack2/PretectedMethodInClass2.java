package accessModifierPack2;

import accessModifierPack1.*;

public class PretectedMethodInClass2 extends ProtectedMethodInClass  
{
	public static void main(String[] args)
	{
		PretectedMethodInClass2 obj=new PretectedMethodInClass2();
		obj.show();
		System.out.println("Protected value: "+obj.value);
		
		
	}

}
