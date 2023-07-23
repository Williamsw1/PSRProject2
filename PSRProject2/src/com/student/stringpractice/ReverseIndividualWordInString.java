package com.student.stringpractice;
import java.lang.String;

class ReverseIndividualWordInString
{

	public static void main(String[] args) 
	{
		String str = "Java Programming Problems";
		
		String[] words = str.split(" ");
		String revString = "";
		for(int i = 0; i < words.length; i++) 
		{
			String word = words[i];			
			String revWord = "";			
			for(int j = word.length()- 1; j >= 0; j--) 
			{
				revWord = revWord + word.charAt(j);
			}
			revString = revString + revWord + " "; 
		}
	System.out.println(revString);
	}
}

/*
//Reverse words using stack
import java.util.Stack;
public class ReverseIndividualWordInString 
{
	public static void main(String[] args) 
	{
		String str = "Java Programming"; 
		String revString = ""; 
		Stack<Character> st = new Stack<>();
		for(int i = 0; i < str.length(); i++) 
		{ 
			if(str.charAt(i) != ' ') 
			{
				st.push(str.charAt(i));
			} 
			else 
			{
				revString = reverseWord(revString, st); 
			}
		} 
		revString = reverseWord(revString, st);
		System.out.println(revString);
	}
		private static String reverseWord(String revString, Stack<Character> st) 
		{
			String revWord = ""; 
			while(!st.isEmpty()) 
			{
				revWord = revWord + st.pop();
			}
			revString = revString + revWord + " ";
			return revString;
		}
}
*/

/*
import java.util.Arrays;
import java.util.stream.Collectors;
//Reverse using lambda
public class ReverseIndividualWordInString 
{
	public static void main(String[] args) 
	{
		String str = "Java Programming"; 
		String result = Arrays.asList(str.split(" "))
		.stream()
		.map(s -> new StringBuilder(s).reverse())
		.collect(Collectors.joining(" "));
		System.out.println(result);
	}

*/
