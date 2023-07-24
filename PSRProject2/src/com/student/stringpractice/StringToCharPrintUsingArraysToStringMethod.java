package com.student.stringpractice;
import java.lang.String;

import java.util.Arrays;

public class StringToCharPrintUsingArraysToStringMethod 
{
	public static void main(String[] args) {
		String s = "i like this program very much ";
		char[] p = s.toCharArray();

		// Using Arrays.toString() method to print characters
		// Also it prints in array format using comma
		System.out.println("Char equivalent: " + Arrays.toString(p));
	}

}
