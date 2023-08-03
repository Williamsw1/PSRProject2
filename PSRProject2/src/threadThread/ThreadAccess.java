package threadThread;

import java.lang.Thread;


public class ThreadAccess extends Thread {
	
	public void run()
	{
		System.out.println("Thread started running");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadAccess thread1 = new ThreadAccess();
		
		ThreadAccess thread2 = new ThreadAccess();
		
		thread1.start();
		
		String str = thread1.getName();
		System.out.println("get thread1 name:"+str);
		String str1 =thread2.getName();
		
		System.out.println("get thread2 name:"+str1);
		
		int prio =thread1.getPriority();
		System.out.println("priority thread1: "+prio);
		System.out.println("thread1 state: "+thread1.getState());
		
		thread2.start();
		int prio1 =thread2.getPriority();
		System.out.println("priority thread2: "+prio1);
		

		
		
	}

}
