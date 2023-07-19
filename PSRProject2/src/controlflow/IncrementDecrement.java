package controlflow;

public class IncrementDecrement {
	public static void main(String args[]) {
		int x = 10;
		System.out.println(x++);// 10 (11)
		System.out.println(++x);// 12
		System.out.println(x--);// 12 (11)
		System.out.println(--x);// 10
	}
}

/*

public class IncrementDecrement 
{
	public static void main(String args[]) 
	{
		int a = 10;
		int b = 10;
		System.out.println(a++ + ++a);// 10+12=22
		System.out.println(b++ + b++);// 10+11=21

	}
}

*/
