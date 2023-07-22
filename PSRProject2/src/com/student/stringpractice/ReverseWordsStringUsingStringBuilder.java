package com.student.stringpractice;

public class ReverseWordsStringUsingStringBuilder {

	public static void main(String[] args) {
		String str = "i am going to traval for a long distance";

		String reversedStr = reverseWords(str);
		System.out.println("Reversed String: " + reversedStr);
	}

	public static String reverseWords(String input) {

		String[] words = input.split("\\s+");

		// Reverse the order of the words
		StringBuilder reversed = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]).append(" ");
		}

		return reversed.toString().trim();
	}
}
