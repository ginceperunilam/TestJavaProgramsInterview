package com.JavaProjects.TestProjects;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest
{
	public void binaryOperatorTest()
	{
		/**Binary operator accept and return arguments of same type**/
		BinaryOperator<String> binaryOperator = (t,u)->t+" "+u;
//		{
//			return t.concat(u);
//		};
		
		String binaryOperatorTestStrin1 ="Gince";
		String binaryOperatorTestStrin2 ="George";
		String apply = binaryOperator.apply(binaryOperatorTestStrin1, binaryOperatorTestStrin2);
		System.out.println("Resultant BinaryOperatorTest String is:"+apply);
	}
}
