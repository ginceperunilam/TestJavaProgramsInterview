package com.JavaProjects.TestProjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest 
{
	public Collection setCollectionList()
	{
		System.out.println("setCollectionList");
		//by default the Collecttion is Object type
		Collection myObjTypeCollection = new ArrayList();
		myObjTypeCollection.add(2);
		myObjTypeCollection.add(5);
		myObjTypeCollection.add("Gince");
		myObjTypeCollection.add(24d);
		
		System.out.println("myObjTypeCollection in setCollectionList : "+myObjTypeCollection);
		
		return myObjTypeCollection;
	}
	
	public void getCollectionList(Collection objTypeCollection)
	{
		
		System.out.println("getCollectionList print each vale");
		Iterator it = objTypeCollection.iterator();
		while(it.hasNext())
		{
			System.out.println("Value : "+it.next());
		}
	}
	
	public void getIntegerTypeCollectionList()
	{
		System.out.println("getIntegerTypeCollectionList");
		//we can use generics to specify the type of a collection
		Collection<Integer> myIntegerCollection = new ArrayList<Integer>();
		myIntegerCollection.add(2);
		myIntegerCollection.add(5);
		
		System.out.println("myIntegerCollection:"+myIntegerCollection);
	}
	
	
	
}
