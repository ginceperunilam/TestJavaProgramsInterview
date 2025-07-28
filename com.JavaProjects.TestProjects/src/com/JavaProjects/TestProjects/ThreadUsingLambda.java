package com.JavaProjects.TestProjects;

public class ThreadUsingLambda
{
	int count = 0;
	public ThreadUsingLambda()
	{
		Runnable obj = new Runnable()
		{
			@Override
			public void run()
			{
				for (int i = 0; i < 50; i++)
					count++;
			}
		};

//    Runnable obj1 = () -> {count++;};//work only with java 8

		Runnable obj2 = ()->
			{
				for (int i = 0; i < 100; i++)
					count++;
			};

		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();
	}
}
