package com.JavaProjects.TestProjects;

import java.util.HashMap;
import java.util.Map;

import com.JavaProjects.TestProjectsFiles.HashMapTestObject;
import com.JavaProjects.TestProjectsFiles.TestObject;

public class HashMapKeyUserDefinedObj
{
	public void objDiffernetValueKey()
	{
		//Initialise obj with same values
		TestObject testObject1 = new TestObject("Gince", 10);
		TestObject testObject2 = new TestObject("Gince", 10);
		TestObject testObject3 = new TestObject("George", 20);
		
		HashMap<TestObject, String> map = new HashMap<>();
		map.put(testObject1, "Testing 1 obj");
		map.put(testObject2, "Testing 2 obj");
		map.put(testObject3, "Testing 3 obj");
		
		//Enen these have same key the objects have different address, so it will print both obj and values
		for(Map.Entry<TestObject, String> myMap : map.entrySet())
		{
			//myMap.getKey() : print the value from toString method in the class
			System.out.println("Key: "+myMap.getKey()+"Value: "+ myMap.getValue());
		}
		System.out.println("------------------------");
	}
	
	public void objSameValueKey()
	{
		//Initialise obj with same and diff values with hashCode and hasCode methods are override in class HashMapTestObject
		HashMapTestObject testObject1 = new HashMapTestObject("Gince", 10);
		HashMapTestObject testObject2 = new HashMapTestObject("Gince", 10);
		HashMapTestObject testObject3 = new HashMapTestObject("Gince", 14);
		HashMapTestObject testObject4 = new HashMapTestObject("George", 14);
		HashMapTestObject testObject5 = new HashMapTestObject("George", 15);
		
//		we set the id as key, if names are same but diff id will print. 
		HashMap<HashMapTestObject, String> map = new HashMap<>();
		map.put(testObject1, "Testing 1 obj");
		map.put(testObject2, "Testing 2 obj");
		map.put(testObject3, "Testing 3 obj");
		map.put(testObject4, "Testing 4 obj");
		map.put(testObject5, "Testing 5 obj");
		
		
		//Enen these have same key the objects have different address, so it will print both obj and values
		for(Map.Entry<HashMapTestObject, String> myMap : map.entrySet())
		{
			//myMap.getKey() : print the value from toString method in the class
			System.out.println("Key: "+myMap.getKey()+"Value: "+ myMap.getValue());
		}
	}
}
