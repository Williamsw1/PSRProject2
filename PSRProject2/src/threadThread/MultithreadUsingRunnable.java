package threadThread;

class College implements Runnable {
	private String name;

	public College(String name) {
		this.name = name;
	}

	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("i am inside College Class" + i + " " + name);
			
		}

	}
}

public class MultithreadUsingRunnable {

	public static void main(String[] args) {
		Runnable run1 = new College("i am first");
		Runnable run2 = new College("i am second");
		
		String str = new String("My data");

		Thread th1 = new Thread(run1);
		th1.start();
		Thread th2 = new Thread(run2);

		th2.start();

	}

}
