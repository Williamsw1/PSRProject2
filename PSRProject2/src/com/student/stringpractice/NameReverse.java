package com.student.stringpractice;
import java.lang.String;

public class NameReverse {

	public static void main(String[] args)
	{
		String[] name= {"john smith","jane mith","mich bons"};
		for(String nam:name) //3 times
		{
			System.out.println("Original name"+nam+",Reversed"+reversedName(nam));
		}
		
	}

private static String reversedName(String nam) 
{
		
		String[] separate=nam.split(" ");
		if(separate.length==2)
		{
			return separate[1]+" "+separate[0];
		}
		
		
		return null;
}

}
