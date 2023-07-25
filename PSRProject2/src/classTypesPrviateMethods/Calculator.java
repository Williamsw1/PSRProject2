package classTypesPrviateMethods;

public class Calculator {

	private int add(int a, int b) {
		return a + b;
	}

	private int sub(int a, int b) {
		return a - b;
	}

	public int performAddition(int a, int b) {
		return add(a, b);
	}

	public int performSubtraction(int a, int b) {
		return sub(a, b);
	}

}

class TestCalculater {
	public static void main(String[] args)
	{
		Calculator cal = new Calculator();
		int result1 =cal.performAddition(20, 10);
		int result2 =cal.performSubtraction(30,10);
		System.out.println("Addition: "+result1);
		System.out.println("Subtraction: "+result2);
		
	}
}
