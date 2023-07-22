package com.student.stringpractice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {
    public static void main(String[] args) {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter college name: ");
            String name = reader.readLine(); 
            System.out.println("Hello, " + name );

            System.out.print("College Year: ");
            int year = Integer.parseInt(reader.readLine());             
            System.out.println("College started year"+year);

        } 
        catch (IOException e) 
        {
            System.err.println("Error reading input: " + e.getMessage());
        } 
        catch (NumberFormatException e) 
        {
            System.err.println("Invalid year. Please enter a valid integer.");
        } 
        finally 
        {
           
            try 
            {
                reader.close();
            } 
            catch (IOException e) 
            {
                System.err.println("Error closing the BufferedReader: " + e.getMessage());
            }
        }
    }
}

