package com.JavaProjects.TestProjects;

public class ThreadUsingRunnableTest
{
	public void executeThreadUsingRunnable()
	{
		ThreadUsingRunnable1 threadUsingRunnable1 = new ThreadUsingRunnable1();
//		threadUsingRunnable1.start();//we canot have start method because we are implemented the runnable interface
		Runnable threadUsingRunnable2 = new ThreadUsingRunnable2();//instance of Runnable and object of ThreadUsingRunnable2
		
		//using the concept of anonymos class, consider new Runnable() as an anonymous class
		Runnable runnableObj1 = new Runnable(){
			@Override
			public void run()
			{
				try
				{
					for (Long i = 0l; i <= 10l; i++)
					{
						System.out.println("Hi Thread 3");
						Thread.sleep(10);// we can specify a waiting time for the thread
					}
				} catch (InterruptedException e)
				{
					System.out.println("inside ThreadUsingRunnable1 InterruptedException e:" + e);
				}
			}

		};
		
		//using lamda expression
		Runnable runnableObj2 = () -> {
				try
				{
					for (Long i = 0l; i <= 10l; i++)
					{
						System.out.println("Hi Thread 4");
						Thread.sleep(10);// we can specify a waiting time for the thread
					}
				} catch (InterruptedException e)
				{
					System.out.println("inside ThreadUsingRunnable1 InterruptedException.. e:" + e);
				}
			};
		
		//we have to create an object of thread and pass the object
		Thread thread1 = new Thread(threadUsingRunnable1);
		Thread thread2 = new Thread(threadUsingRunnable2);
		Thread thread3 = new Thread(runnableObj1);
		Thread thread4 = new Thread(runnableObj2);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
	
	
}
