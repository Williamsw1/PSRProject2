package com.student.stringpractice;
/*
public class ReverseEachWordSameLocationReverse {
	public static void main(String[] args) {
		
		String str = "i am going to traval for a long distance";
		String[] words=str.split("\\s");
		String reverseWord="";
		for(String part:words)
			{
				StringBuilder sb = new StringBuilder(part);
				sb.reverse();
				reverseWord=reverseWord+sb.toString()+" ";
			}
			System.out.println("Reversed String: " + reverseWord);
		
	}
}
*/

//Another approach
public class ReverseEachWordSameLocationReverse 
{
	public static void main(String[] args) 
	{		
		String str = "i am going to traval for a long distance";
		String[] words=str.split("\\s");
		String reverseString="";
		for(String part:words)
			{
				String reverseWord="";
				for(int i=part.length()-1;i>=0;i--)
				{
					reverseWord=reverseWord+part.charAt(i);
				}
				reverseString= reverseString+reverseWord+" ";
			}
			System.out.println("Reversed String: " + reverseString);
		
	}
}


