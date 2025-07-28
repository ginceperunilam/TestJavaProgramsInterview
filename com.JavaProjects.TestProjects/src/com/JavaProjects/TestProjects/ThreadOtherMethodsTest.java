package com.JavaProjects.TestProjects;

public class ThreadOtherMethodsTest
{
	public void executeThreadOtherMethods() 
	{
		try
		{
			ThreadOtherMethod1 threadOtherMethod1 = new ThreadOtherMethod1();
			ThreadOtherMethod1 threadOtherMethod2 = new ThreadOtherMethod1();
			
			threadOtherMethod1.start();
			threadOtherMethod2.start();
			
			threadOtherMethod1.join();//wait for the completion of thread threadOtherMethod1
			threadOtherMethod2.join();//wait for the completion of thread threadOtherMethod2
			
			System.out.println(threadOtherMethod1.getiValue());
			System.out.println(threadOtherMethod2.getiValue());
		}
		catch (InterruptedException e)
		{
			System.out.println("ThreadOtherMethodsTest executeThreadOtherMethods failed e:"+e);
		}
	}
	
}
