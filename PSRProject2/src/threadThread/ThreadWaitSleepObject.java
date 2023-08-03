package threadThread;
import java.lang.Object;
import java.lang.Thread;



public class ThreadWaitSleepObject {
	
	//public static Object LOCK = new Object();
	
	
public static void main(String[] args) throws InterruptedException {
	final Object LOCK = new Object();
	Thread.sleep(1000);
	
	
	System.out.println("current thread: "+Thread.currentThread().getName());
	
	synchronized(LOCK)
	{
		LOCK.wait(1000);
		System.out.println("Object "+LOCK+"is woken after one second");
	}
}
}
