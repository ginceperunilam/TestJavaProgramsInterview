package com.JavaProjects.TestProjects;

public class ThreadUsingRunnable1 implements Runnable
{
	@Override
	public void run()
	{
		for(Long i =0l; i<= 10l; i++)
		{
			try
			{
				System.out.println("Hi Thread 1");
				Thread.sleep(10);//we can specify a waiting time for the thread
			} 
			catch (InterruptedException e)
			{
				System.out.println("inside ThreadUsingRunnable1 InterruptedException e:"+e);
			}
		}
	}
}
