package controlflow;

//Java Program for implementation of if statement
import java.util.Scanner;
public class IfElseCondition
{
   public static void main(String []args)
   {
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the age: ");
       int age=sc.nextInt();
       
        if(age>=18)
        {  
              System.out.println("The person is eligible to vote");  
        }     
   }
}


/*

//Java Program for implementation of if-else statement
import java.util.Scanner;
public class IfElseCondition
{
   public static void main(String []args)
   {
       //Take input from the user
       //Create an instance of the Scanner class
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number: ");
       int num=sc.nextInt();
       if(num>0)
       {
           System.out.println("The entered number "+num+" is positive.");
       }
       else
       {
           System.out.println("The entered number "+num+" is negative.");
       }
   }
}
*/