package com.student.stringpractice;

public class StringCharPrint 
{

	public static void main(String[] args) 
	{
		String s ="i like to work out in the Gym for my health ";
		char[] p = s.toCharArray();

		// Using a loop to print characters
		System.out.println("Char equivalent: ");
		for (char c : p) 
		{
			System.out.print(c);
			//System.out.println(c);
		}
	}
}
