package threadThread;

class ThreadJoining extends Thread {
	
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			try {
				Thread.sleep(800);
				System.out.println("Current Thread: "+Thread.currentThread().getName());
				
			} catch (InterruptedException a) {
				
				a.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException {
		 ThreadJoining t1 = new  ThreadJoining();
		 ThreadJoining t2 = new  ThreadJoining();
		 ThreadJoining t3 = new  ThreadJoining();
		 
		 t1.start();
		 System.out.println("Current Thread: "+Thread.currentThread().getName());
		 
		 t1.join(); 
		 
		 t2.start();
		 System.out.println("Current Thread: "+Thread.currentThread().getName());
		 t2.join();
		 
		 t3.start();
		 System.out.println("Current Thread: "+Thread.currentThread().getName());
	

	}

}
