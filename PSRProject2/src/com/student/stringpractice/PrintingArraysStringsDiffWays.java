package com.student.stringpractice;
import java.lang.String;
import java.util.Arrays;

public class PrintingArraysStringsDiffWays 
{
	public static void main(String args[]) 
	{

		String[] name = { "john smith", "jane mith", "mich bons" };
		System.out.println("String s printing" + Arrays.toString(name));

		int[] onematrix = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Array as String: " + Arrays.toString(onematrix));

		int[][] twomatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Array as String: " + Arrays.deepToString(twomatrix));

		String s = "i like this program very much ";
		System.out.println("Hash Code" + s.hashCode());

		char[] p = s.toCharArray();

		//normal ways
		for (char a : p) {
			System.out.println("Char Elements: " + (a));
		}

		char[] characters = { 'a', 'b', 'c', 'd', 'e' };
		System.out.println("Array as String: " + Arrays.toString(characters));

	}
}
