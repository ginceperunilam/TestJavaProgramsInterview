package com.JavaProjects.TestProjects;

/**to made the clss as thread class must extend Thread class**/
public class ThreadTest2 extends Thread
{
	//have to implement the run methods
	@Override
	public void run()
	{
		for(Long i =0l; i<= 10l; i++)
		{
			try
			{
				System.out.println("Hellow Thread 2");
				Thread.sleep(10);//we can specify a waiting time for the thread
			} 
			catch (InterruptedException e)
			{
				System.out.println("inside ThreadTest2 InterruptedException e"+e);
			}
		}
	}
}
