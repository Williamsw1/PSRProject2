package com.student.stringpractice;

import java.lang.String;

public class ReverseStringWordNotReverseOrder 
{

	public static void main(String[] args) 
	{
		String str = "Java Programming";
		//String revString = "";
		String separate[] = str.split(" ");

		for (int i = 0; i < separate.length; i++) {
			System.out.print(separate[i] + " ");
		}
		System.out.println("");

		for (int i = separate.length - 1; i >= 0; i--) {
			System.out.print(separate[i] + " ");
			//revString = revString + separate[i] + " ";
		}
		//System.out.println(revString);

	}

}
