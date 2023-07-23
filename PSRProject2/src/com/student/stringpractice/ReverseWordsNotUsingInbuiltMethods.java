package com.student.stringpractice;

public class ReverseWordsNotUsingInbuiltMethods {

	
	static void reverse(char str[], int start, int end) 
	{
		char temp;

		while (start <= end) 
		{
			temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
	}

	
	static char[] reverseWordsInString(char[] inputString) 
	{
		int start = 0;
		for (int end = 0; end < inputString.length; end++) 
		{
			if (inputString[end] == ' ') 
			{
				reverse(inputString, start, end - 1);
				start = end + 1;
			}
		}

		// Reverse the last word
		reverse(inputString, start, inputString.length - 1);

		// Reverse the entire String
		reverse(inputString, 0, inputString.length - 1);
		return inputString;
	}

	public static void main(String[] args) 
	{
		String input = "i can run much faster ";

		char[] result = reverseWordsInString(input.toCharArray());
		System.out.print(result);
	}
}
