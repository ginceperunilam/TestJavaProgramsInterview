package com.JavaProjects.TestProjects;

public class TypeCastingTest
{
	private byte byteNum = 100;/**byte is an Integer type, 1 byte, range from -127 to 127**/
	private short shortNum = 215;/**short is 2 bytes**/
	private int intNum = 515;/**int is 4 bytes**/
	private long longNum = 1015l;/**long is 8 byte**/
	
	public void explicitTypeCating()
	{
		short shortNumber = (short) longNum;
		/**cast long to short, big type to a small type**/
		System.out.println("shortNumber inside explicitTypeCating from long to short:"+shortNumber);
	}
	
	public void implicitTypeCating()
	{
		int intNumber =  byteNum;
		/**cast long to short, big type to a small type**/
		System.out.println("intNumber inside implicitTypeCating from byte to int:"+intNumber);
	}
	
	public void typePromotion()
	{
		/**adding short and int type, and the result willstored into a long type**/
		long i = shortNum+intNum;
		System.out.println("inside typePromotion adding short and int types:"+i);
	}
}
