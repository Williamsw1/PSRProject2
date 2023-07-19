package controlflow;


//Java Program to find the multiplication table of a given number
import java.util.*;

public class ForLoopMultiplicationTable
{
   public static void main(String []args)
   {
      //Take input from the user
      //Create instance of the Scanner Class
      Scanner sc=new Scanner(System.in); 
      System.out.println("Enter a number: ");
      int n=sc.nextInt();      //Declare and initialize the number
      System.out.println("The multiplication table of "+n+" is: ");
      //Print the multiplication table
      for(int i=1;i<=10;i++)
      {
          System.out.println(n+" * "+i+" = "+ (n*i));
      }
   }
}

