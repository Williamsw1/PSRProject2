package com.student.stringpractice;
import java.lang.String;

public class ReverseMultipleWordsInStringArray 
{

	public static void main(String[] args) 
	{
		String[] strings = { "I want to travel for a long distance", "Java is number one language in market", "Everyone is fine" };

		String[] reversedStrings = reverseWordsInArray(strings);

		System.out.println("Reversed Strings:");
		for (String reversed : reversedStrings) 
		{
			System.out.println(reversed);
		}
	}

	public static String[] reverseWordsInArray(String[] strings) 
	{
		String[] reversedStrings = new String[strings.length];

		for (int i = 0; i < strings.length; i++) 
		{
			reversedStrings[i] = reverseWords(strings[i]);
		}

		return reversedStrings;
	}

	public static String reverseWords(String input) 
	{
		String[] words = input.split("\\s+");
		StringBuilder reversed = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) 
		{
			reversed.append(words[i]).append(" ");
		}

		return reversed.toString().trim();
	}
}
