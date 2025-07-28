package com.JavaProjects.TestProjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTest1
{
	public CollectionTest1()
	{
		arrayListTest();
		arrayListTypeTest();
		listTest();
		setTest();
		setIteratorTest();
		treeSetIteratorTest();
	}

	public void arrayListTest()
	{
		ArrayList nums = new ArrayList();
		nums.add(45);
		nums.add(25);
		nums.add(60);
		nums.add(30);
		nums.add(25);
		nums.add("70");

//	for(int n : nums)//this will show error as we did't mention the data type for the arraylist
//	{
		System.out.println("Generaic arraylist:" + nums);
//	}
	}

	public void arrayListTypeTest()
	{
		Collection<Integer> nums = new ArrayList<Integer>();
		nums.add(45);
		nums.add(25);
		nums.add(60);
		nums.add(30);
		nums.add(25);

		System.out.println("Integer arraylist:" + nums);
	}

	public void listTest()
	{
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(45);
		nums.add(25);
		nums.add(60);
		nums.add(30);
		nums.add(25);

		System.out.println("4th index of the list:" + nums.get(4));
		System.out.println("index of number 30:" + nums.indexOf(30));
		System.out.println("print the list:" + nums);
	}

	public void setTest()
	{
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(45);
		nums.add(25);
		nums.add(60);
		nums.add(30);
		nums.add(25);

		System.out.println("print the treeset:" + nums);
	}

	public void setIteratorTest()
	{
		Collection<Integer> nums = new HashSet<Integer>();
		nums.add(45);
		nums.add(25);
		nums.add(60);
		nums.add(30);
		nums.add(25);
		nums.add(40);

		System.out.println("Tree set iterating");
		Iterator it = nums.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}

	public void treeSetIteratorTest()
	{
		Set<Integer> nums = new TreeSet<Integer>();
		nums.add(45);
		nums.add(25);
		nums.add(60);
		nums.add(30);
		nums.add(25);
		nums.add(40);

		System.out.println("Print tree set:" + nums);
	}
}
