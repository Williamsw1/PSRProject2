package com.student.stringpractice;

import java.lang.String;
import java.lang.StringBuffer;
//import java.lang.StringBuilder; //use this while in StringBuilder class

public class StringBufferStringBuilder
{
	public static void main(String[] args) {

		// Create a new StringBuffer
		StringBuffer sb = new StringBuffer("Hello");

		// Append methods
		sb.append(" World");
		sb.append(123);
		sb.append(true);

		// Insert method
		sb.insert(5, " Java");

		// Length method
		int length = sb.length();

		// Capacity method
		int capacity = sb.capacity();

		// EnsureCapacity method
		sb.ensureCapacity(50);

		// TrimToSize method
		sb.trimToSize();

		// SetCharAt method
		sb.setCharAt(5, '!');

		// GetCharAt method
		char ch = sb.charAt(0);

		// GetChars method
		char[] charArray = new char[5];
		//getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
		sb.getChars(0, 5, charArray, 0);

		// SetLength method
		sb.setLength(10);

		// Output the StringBuffer after modifications
		System.out.println("Modified StringBuffer: " + sb.toString());
		System.out.println("Length: " + length);
		System.out.println("Capacity: " + capacity);
		System.out.println("Character at index 0: " + ch);
		System.out.println("Contents of charArray: " + new String(charArray));

	}
}

/*
 
 // The same operation like above 
 public class StringBufferStringBuilder {
    public static void main(String[] args) {
        // Create a new StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // Append methods
        sb.append(" World");
        sb.append(123);
        sb.append(true);

        // Insert method
        sb.insert(5, " Java");

        // Length method
        int length = sb.length();

        // Capacity method
        int capacity = sb.capacity();

        // EnsureCapacity method
        sb.ensureCapacity(50);

        // TrimToSize method (Not applicable to StringBuilder, as it does not have extra space like StringBuffer)
        // sb.trimToSize();

        // SetCharAt method
        sb.setCharAt(5, '!');

        // GetCharAt method
        char ch = sb.charAt(0);

        // GetChars method
        char[] charArray = new char[5];
        sb.getChars(0, 5, charArray, 0);

        // SetLength method
        sb.setLength(10);

        // Output the StringBuilder after modifications
        System.out.println("Modified StringBuilder: " + sb.toString());
        System.out.println("Length: " + length);
        System.out.println("Capacity: " + capacity);
        System.out.println("Character at index 0: " + ch);
        System.out.println("Contents of charArray: " + new String(charArray));
    }
} 
  
*/
