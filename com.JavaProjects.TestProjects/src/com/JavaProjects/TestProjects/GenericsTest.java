package com.JavaProjects.TestProjects;

import java.util.ArrayList;

import com.JavaProjects.TestProjectsFiles.TestObject;

public class GenericsTest
{
	//constructor
	public GenericsTest()
	{
		System.out.println("--------Integer--------------");
		PrintGenericValue<Integer> printGenericValue = new PrintGenericValue<>();
		printGenericValue.setMyGenericValue(2);
		printGenericValue.printMyGenericValue();
		
		System.out.println("--------TestObject--------------");
		TestObject testObject = new TestObject("Gince", 301992);
		PrintGenericValue<TestObject> printGenericValueArrayTests = new PrintGenericValue<>();
		printGenericValueArrayTests.setMyGenericValue(testObject);
		printGenericValueArrayTests.printMyGenericValue();
		
		System.out.println("--------Etends Number--------------");
		PrintGenericValueOfNumber<Double> printGenericValueOfNumber = new PrintGenericValueOfNumber<Double>();
		printGenericValueOfNumber.setMyGenericValueOfNumber(20.1992);
		printGenericValueOfNumber.getMyGenericValueOfNumber();
		
		System.out.println("--------T as flaot arrayList--------------");
		ArrayList<Float> floatList = new ArrayList<>();
        floatList.add(10.01f);
        floatList.add(20.02f);
        floatList.add(30.03f);
        PrintGenericsInside<Float> printGenericsInside = new PrintGenericsInside<Float>(floatList);
	}
	
	
	//The generic T(type) can of any class
	public class PrintGenericValue<T>
	{
		T myGenericValue;

		public T getMyGenericValue()
		{
			return myGenericValue;
		}

		public void setMyGenericValue(T myGenericValue)
		{
			this.myGenericValue = myGenericValue;
		}
		
		public void printMyGenericValue()
		{
			System.out.println("myGenericValue:"+myGenericValue);
		}
	}
	
	// The generic T(type) can Integer, Float, Double etc.. ie, classes extends Number class
	public class PrintGenericValueOfNumber<T extends Number>
	{
		T myGenericValueOfNumber;

		public T getMyGenericValueOfNumber()
		{
			return myGenericValueOfNumber;
		}

		public void setMyGenericValueOfNumber(T myGenericValueOfNumber)
		{
			this.myGenericValueOfNumber = myGenericValueOfNumber;
		}

		public void printMyGenericValueOfNumber()
		{
			System.out.println("myGenericValueOfNumber:" + myGenericValueOfNumber);
		}
	}
	
	public class PrintGenericsInside<T>
	{
		public PrintGenericsInside(ArrayList<?> genericArrayListObj)
		{
			getGenericsInside(genericArrayListObj);
		}
		
		public void getGenericsInside(ArrayList<?> genericArrayListObj)
		{
			System.out.println("genericArrayListObj inside printGenericsInside:" + genericArrayListObj);
		}
		
//		public void getGenericsInsideNumbers(ArrayList<? extends Number> genericArrayListObj)
//		{
//			System.out.println("genericArrayListObj inside printGenericsInside:" + genericArrayListObj);
//		}
	}
}
