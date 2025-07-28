package com.JavaProjects.TestProjects;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest 
{
	private Map<String, String> map = new HashMap<String, String>();
	
	public void setMapValues()
	{
		map.put("gince", "25121992");
		map.put("naveen", "26011993");
		map.put("Biju", "27021994");
		map.put("Pooja", "28031995");
		map.put("KRIPA", "29041996");
	}
	
	public String getVauleByKey(String key)
	{
		return map.get(key);
	}
	
	public void getAllValuesKeySet()
	{
		System.out.println("getAllValuesKeySet Starts");
		Set<String> keys = map.keySet();
		for(String key : keys)
		{
			System.out.println("Key :"+key+" ,key.hashCode() :"+key.hashCode() + " , Value ="+map.get(key));
		}
		System.out.println("getAllValuesKeySet Ends");
	}
	
	/**
	 * 
	 */
	public void getAllValuesMapEntry()
	{
//		Set<Map.Entry<String,String>> mapValues = map.entrySet();
		System.out.println("getAllValuesMapEntry Starts");
		for(Map.Entry<String, String> mapValue : map.entrySet())
		{
			System.out.println("Key{mapValue.getKey()} :"+mapValue.getKey()+" , Value{mapValue.getValue()} ="+mapValue.getValue());
/**To set value to a key we can use setValue function**/
//			mapValue.setValue("III");
//			System.out.println("Key{mapValue.getKey()} :"+mapValue.getKey()+" , Value{mapValue.getValue()} ="+mapValue.getValue());
			
		}
		System.out.println("getAllValuesMapEntry Ends");
		
	}
}
