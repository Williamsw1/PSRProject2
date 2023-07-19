package controlflow;

public class TypeConversion
{  
public static void main(String args[])
	{  
		short a=10;  
		short b=10;  
		int m=10;
		float p=12;
		//a+=b;//a=a+b internally so fine  
		a=(short)(a+b);//Compile time error because 10+10=20 now int  
		System.out.println(a);  
		
		//int to float conversion(lower to higher)
		float n=(float)(m);
		System.out.println(n);

		
		double q=(double)(p);
		System.out.println(q);
		
		
		
		//conversion
		byte h;
		 
		int i = 25; 
		double d = 323.142;
		 
		System.out.println("\nConversion of   int  to byte.");
		h = (byte) i;          
		System.out.println("i and h " + i +   " "  + h);    
		System.out.println("\nConversion of   double to int.");
		i = (int) d;           
		System.out.println("d and i " + d +   " "  + i);    
		System.out.println("\nConversion of   double to byte.");
		h = (byte) d;          
		System.out.println("d and h " + d +   " "  + h); 

	}
}  


