package controlflow;



//Java Program to see the implementation of for and for-each loop
import java.util.*;

public class ForLoopArray
{
   public static void main(String []args)
   {
      //Take input from the user
      //Create instance of the Scanner Class
      Scanner sc=new Scanner(System.in); 
      System.out.println("Enter the size of the array: ");
      int n=sc.nextInt();      //Declare and initialize the number
      int arr[]=new int[n];    //Declare an Array
      System.out.println("Enter the array elements: ");
      //Initialize the array        
      for(int i=0; i<n; i++)
      {
          arr[i]=sc.nextInt();
      }
      System.out.println("The array elements are: ");
      //Print the number infinite times
      for(int t:arr)
      {
          System.out.println(t);
      }
   }
}

