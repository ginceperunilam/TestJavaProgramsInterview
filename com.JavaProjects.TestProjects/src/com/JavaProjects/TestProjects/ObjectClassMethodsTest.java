package com.JavaProjects.TestProjects;

public class ObjectClassMethodsTest
{

	public void ObjectClasstoStringMethod()
	{
		ObjectClassMethodsChildTest objectClasEqualsMethod = new ObjectClassMethodsChildTest();
		objectClasEqualsMethod.setTestId(1l);
		objectClasEqualsMethod.setTestName("Gince");
		objectClasEqualsMethod.setTestMark(30l);
		
		//This will print some hexa decimal values and both obje have different hex values
		//internally it is calling the toString method
		System.out.println("toString Test objectClasEqualsMethod:"+objectClasEqualsMethod);//@483bf400
		System.out.println("toString Test objectClasEqualsMethod.toString():"+objectClasEqualsMethod.toString());//@483bf400
		
	}
	
	public void ObjectClassEualsMethod()
	{
		ObjectClassMethodsChildTest objectClasEqualsMethod = new ObjectClassMethodsChildTest();
		objectClasEqualsMethod.setTestId(1l);
		objectClasEqualsMethod.setTestName("Gince");
		objectClasEqualsMethod.setTestMark(30l);
		
		ObjectClassMethodsChildTest objectClasEqualsMethod2 = new ObjectClassMethodsChildTest();
		objectClasEqualsMethod2.setTestId(11l);
		objectClasEqualsMethod2.setTestName("Gince");
		objectClasEqualsMethod2.setTestMark(40l);
		
		/**normally when we check euals with objects it will print not equals, because it will 
		 * check the hash values are equal or not**/
		if(objectClasEqualsMethod.equals(objectClasEqualsMethod2))
			System.out.println("objects are equal");
		else
			System.out.println("ojects are not equal");
	}
}
