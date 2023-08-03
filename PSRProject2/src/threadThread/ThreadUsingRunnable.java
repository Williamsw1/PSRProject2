package threadThread;

public class ThreadUsingRunnable implements Runnable {

	public void run() {
		
		System.out.println("Using interface-run method");
		
		
	}
	
	public static void main(String[] args) {
		
		Runnable r1= new ThreadUsingRunnable();
		
		Thread th = new Thread(r1,"Hello, Thread");
		th.start();
		String str = th.getName();
		System.out.println("get name: "+str);
		
	}
}
