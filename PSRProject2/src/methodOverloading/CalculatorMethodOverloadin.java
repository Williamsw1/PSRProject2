package methodOverloading;

public class CalculatorMethodOverloadin {

	public int add(int a, int b) {
		int x = 90;
		int y = 70;

		System.out.println("addition4:" + (x + y));
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;

	}

	public double add(double a, double b) {
		return a + b;
	}

	public int add(int[] numbers) {
		int data=0;
		for(int num:numbers)
		{
			data+=num;
		}
		
		return data;
	}

	public static void main(String[] args) {
		CalculatorMethodOverloadin obj = new CalculatorMethodOverloadin();
		int addition1 = obj.add(10, 20);

		System.out.println("addition1: " + addition1);

		int addition2 = obj.add(30, 20, 24);
		System.out.println("addition2: " + addition2);

		double addition3 = obj.add(10.0, 20.0);
		System.out.println("addition3: " + addition3);

		// array declaration
		int[] numbers = { 20, 24, 1, 5 };
		int sum = obj.add(numbers);
		System.out.println("array summation: "+sum);

	}

}
