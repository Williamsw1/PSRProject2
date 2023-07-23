package com.student.stringpractice;

import java.util.Arrays;

public class ReverseWordsNotUsingInbuiltMethods 
{	
	static void reverse(char str[], int start, int end) 
	{
		char temp;

		while (start <= end) 
		{
			temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			System.out.println("start: "+start);
			
			end--;
			System.out.println("end: "+end);
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
//		String input1 = "hello i am here.";
//		char[] result1 = input1.toCharArray();
//		System.out.println("result1 char:"+Arrays.toString(result1));

		char[] result = reverseWordsInString(input.toCharArray());
		System.out.print(result);
	}
}
