package com.JavaProjects.TestProjects;

public class ThreadClassTest
{
	public void executeThreadClasses()
	{
		ThreadTest1 threadTest1 = new ThreadTest1();
		ThreadTest2 threadTest2 = new ThreadTest2();
		
		//default priority will be 5
		System.out.println("Priority threadTest1:"+threadTest1.getPriority());
		System.out.println("Priority threadTest2:"+threadTest2.getPriority());
		
		//we can set the priority but at the end scheduler will determine the priority based on the thread process to be execute
		threadTest1.setPriority(8);
		threadTest2.setPriority(4);
		
		threadTest1.start();//this will invoke run() method in ThreadTest1
		threadTest2.start();//this will invoke run() method in ThreadTest2
	}
}
