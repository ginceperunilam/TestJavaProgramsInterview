package com.JavaProjects.TestProjects;

import java.util.Objects;

public class ObjectClassMethodsChildTest
{

	private Long testId;
	private String testName;
	private Long testMark;
	
	
	public Long getTestId()
	{
		return testId;
	}
	public void setTestId(Long testId)
	{
		this.testId = testId;
	}
	public String getTestName()
	{
		return testName;
	}
	public void setTestName(String testName)
	{
		this.testName = testName;
	}
	public Long getTestMark()
	{
		return testMark;
	}
	public void setTestMark(Long testMark)
	{
		this.testMark = testMark;
	}
	
	
//	/**we can override the toString method here and when we print the obj or calling 
//	tostring method it will call here instead of calling it in the object class**/
//	@Override
//	public String toString()
//	{
//		return testId.toString()+":"+testName+":"+testMark.toString();
//	}
	
	//Generated by eclipse
	@Override
	public String toString()
	{
		return "ObjectClassMethodsChildTest [testId=" + testId + ", testName=" + testName + ", testMark=" + testMark
				+ "]";
	}
	
	/**generated by eclipse as we need to generate the hash, chek the obj null or not etc..**/
	@Override
	public int hashCode()
	{
		return Objects.hash(testId, testName);
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectClassMethodsChildTest other = (ObjectClassMethodsChildTest) obj;
		return Objects.equals(testId, other.testId) && Objects.equals(testName, other.testName);
	}
	
//	@Override
//	public Boolean equals(ObjectClassMethodsChildTest thatObj)
//	{
//		//we can add any fields in this equal checking as we need
//		return this.testId.equals(thatObj.testId) && this.testName.equals(thatObj.testName);
//	}
	
	
	
}
