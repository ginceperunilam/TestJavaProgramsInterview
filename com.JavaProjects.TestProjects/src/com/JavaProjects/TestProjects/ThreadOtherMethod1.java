package com.JavaProjects.TestProjects;

public class ThreadOtherMethod1 extends Thread
{
	private Long iValue=0l;
	
	@Override
	public void run()
	{
		processIncrementUpdate();
	}
	
	public Long getiValue()
	{
		return iValue;
	}

	public void setiValue(Long iValue)
	{
		this.iValue = iValue;
	}

	//synchronized used to access the method by one thread at a time
	public synchronized void processIncrementUpdate()
	{
		try
		{
			for(Long i=1l; i<= 20000l; i++)
			{
				iValue++;
			}
		} 
		catch (Exception e)
		{
			System.out.println("ThreadOtherMethod1 processIncrementUpdate failed e:"+e);
		}
	}
}
