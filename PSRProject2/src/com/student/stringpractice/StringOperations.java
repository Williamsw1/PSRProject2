
package com.student.stringpractice;
/*String operations*/
import java.lang.String;

public class StringOperations {
	public static void main(String[] args) {
		String str1 = "PSR College";
		String str2 = "PSR College";
		String str3 = new String("PSR College");
		String str4 = String.format("str1 string value is: %s",str1);
		System.out.println("format: "+str4);
		
		String str5 =str3.formatted("str1 string value is: %s",str3);
		System.out.append('g'+"\n");
		
		String str6 = String.format("Data after format %.9f", 34.15278);
		System.out.println("format: "+str6);
		
		
		
		System.out.println("abc");
	    String cde = "cde";
	    System.out.println("abc" + cde);
	    
	    String c = "abc".substring(2,3);
	    System.out.println("substring data1: "+c);
	    
	    String d = cde.substring(1, 2);
	    System.out.println("substring data2: "+d);
	    
	    char data[] = {'a', 'b', 'c'};
	    String str7 = new String(data);
	    System.out.println("string after char data: "+str7);
		
		int length = str1.length();
		System.out.println("str1 length: " + length);

		String concat = str1 + " " + str2;
		System.out.println("str1 concat str2: " + concat);

		boolean equalCheck = str1.equals(str2);
		System.out.println("Boolean returns as: "+equalCheck);

		String lowercase = str1.toLowerCase();
		System.out.println("Lowercase: " + lowercase);

		boolean startswith = str1.startsWith("PSR");
		System.out.println("startswith: " + startswith);

		int index = str1.indexOf('S');
		System.out.println("index position: "+index);

		String str8 = str1.concat(str2);
		System.out.println("Concatenation str1-str2: "+str5);

		System.out.println("Concatenation str1 & str2: " + str1+" "+str2);
		String str9 = str1.concat(str3);
		System.out.println("Success of Concatenation: "+str9);
		
		String substr=str1.substring(0,4);
		System.out.println("substring: "+substr);
		
		char ch=str1.charAt(4);
		System.out.println("Character in position: "+ch);
		//checking for its contents
		if (str1.equals(str2))

			System.out.println("str1 and str2 are matching");

		else
			System.out.println("str1 and str2 are matching");

		System.out.println("str2-str3 literals and new keyword: "+(str2==str3));
		if (str1 == str2) 
			
			System.out.println("str1 and str2 are matching using equality operator");

		else
			System.out.println("str1 and str2 are not matching in equality operator");
		

		 	String strs1 = new String("java"); // Creates a new String object in heap memory
	        String strs2 = "java"; // Uses a string literal, checks string pool for reuse

	        // Check if str1 and str2 refer to the same object
	        System.out.println("strs1 == strs2: " + (strs1 == strs2)); // Output: str1 == str2: false

	        // Check if the contents of str1 and str2 are the same
	        System.out.println("strs1.equals(strs2): " + strs1.equals(strs2)); // Output: str1.equals(str2): true
	}
}
