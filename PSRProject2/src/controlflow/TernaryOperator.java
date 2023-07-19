package controlflow;

public class TernaryOperator 
{
	public static void main(String args[]) 
	{
		int a = 2;
		int b = 5;		
		int min = (a < b) ? a : b;
		System.out.println(min);
		
		String result=(a<b)?"a is less value":"b is greater value";
		System.out.println(result);
	}
}
