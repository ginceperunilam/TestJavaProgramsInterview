package com.JavaProjects.MainMethod;

import java.util.Collection;
import java.util.List;

import com.JavaProjects.TestProjects.AbstractBankTest;
import com.JavaProjects.TestProjects.AccessSpecifierChildNonSubclassDifferentPackage;
import com.JavaProjects.TestProjects.AccessSpecifierChildSubclassDifferentPackage;
import com.JavaProjects.TestProjects.AnagramTestPgm;
import com.JavaProjects.TestProjects.AnonymousObjectTest;
import com.JavaProjects.TestProjects.ArrayTests;
import com.JavaProjects.TestProjects.BiFunctionTest;
import com.JavaProjects.TestProjects.BinaryOperatorTest;
import com.JavaProjects.TestProjects.CollectionTest;
import com.JavaProjects.TestProjects.CollectionTest1;
import com.JavaProjects.TestProjects.ComparableImplementation;
import com.JavaProjects.TestProjects.ComparatorInterfaceImplementation;
import com.JavaProjects.TestProjects.ComparatorTests;
import com.JavaProjects.TestProjects.ConcatNumberAndString;
import com.JavaProjects.TestProjects.ConstructorTest;
import com.JavaProjects.TestProjects.DatabaseConnectionTest;
import com.JavaProjects.TestProjects.DateFunctionTest;
import com.JavaProjects.TestProjects.DefaultMethodTestInterface;
import com.JavaProjects.TestProjects.DoWhileLoopTest;
import com.JavaProjects.TestProjects.ExceptionCustomException;
import com.JavaProjects.TestProjects.ExceptionHandlingUsingThrow;
import com.JavaProjects.TestProjects.ExceptionHandlingUsingThrows;
import com.JavaProjects.TestProjects.ExceptionTests;
import com.JavaProjects.TestProjects.FilterInJavaTest;
import com.JavaProjects.TestProjects.FinalKeywordWithClassParent;
import com.JavaProjects.TestProjects.FinalKeywordWithMethodChild;
import com.JavaProjects.TestProjects.FinalKeywordWithVariable;
import com.JavaProjects.TestProjects.ForEachTest;
import com.JavaProjects.TestProjects.ForLoopTest;
import com.JavaProjects.TestProjects.FunctionalInterfaceTest;
import com.JavaProjects.TestProjects.FunctionalInterrfaceImplTest;
import com.JavaProjects.TestProjects.GenericsTest;
import com.JavaProjects.TestProjects.HashMapKeyUserDefinedObj;
import com.JavaProjects.TestProjects.HashMapTest;
import com.JavaProjects.TestProjects.IllegalArgumentExceptionTestPgm;
import com.JavaProjects.TestProjects.InheritanceChildTest;
import com.JavaProjects.TestProjects.InheritanceMultilevelTest;
import com.JavaProjects.TestProjects.InnerClassTest;
import com.JavaProjects.TestProjects.LambdaExpressionTest;
import com.JavaProjects.TestProjects.LambdaExpressionWithArgumentsAndReturnTest;
import com.JavaProjects.TestProjects.ListTestPgm;
import com.JavaProjects.TestProjects.MapInJavaTest;
import com.JavaProjects.TestProjects.MethodOverloadingTest;
import com.JavaProjects.TestProjects.MethodOverrideChild;
import com.JavaProjects.TestProjects.MethodOverrideParent;
import com.JavaProjects.TestProjects.MetodOverridingTest;
import com.JavaProjects.TestProjects.ObjectClassMethodsTest;
import com.JavaProjects.TestProjects.PreIncrementOperatorTestPgm;
import com.JavaProjects.TestProjects.ReduceInJavaTest;
import com.JavaProjects.TestProjects.SQLWarningClassTestPgm;
import com.JavaProjects.TestProjects.SealedClasses;
import com.JavaProjects.TestProjects.SortUsingComparable;
import com.JavaProjects.TestProjects.SortUsingComparator;
import com.JavaProjects.TestProjects.StaticBlockTest;
import com.JavaProjects.TestProjects.StaticMethodTest;
import com.JavaProjects.TestProjects.StaticVariableTest;
import com.JavaProjects.TestProjects.StreamTest;
import com.JavaProjects.TestProjects.StreamTestUsingAccObj;
import com.JavaProjects.TestProjects.StringBufferTest;
import com.JavaProjects.TestProjects.SwichStatementTest;
import com.JavaProjects.TestProjects.ThisKeywordTest;
import com.JavaProjects.TestProjects.ThreadClassTest;
import com.JavaProjects.TestProjects.ThreadOtherMethodsTest;
import com.JavaProjects.TestProjects.ThreadUsingLambda;
import com.JavaProjects.TestProjects.ThreadUsingRunnableTest;
import com.JavaProjects.TestProjects.TypeCastingTest;
import com.JavaProjects.TestProjects.VarKeyWord;
import com.JavaProjects.TestProjects.WhileLoopTest;
import com.JavaProjects.TestProjects.WrapperClassesTest;
import com.JavaProjects.TestProjects.InnerClassTest.InnerClass;
import com.JavaProjects.TestProjects.InnerClassTest.StaticInnerClass;
import com.JavaProjects.TestProjectsAccessSpecifier.AccessSpecifierChildNonSubclassSamePackage;
import com.JavaProjects.TestProjectsAccessSpecifier.AccessSpecifierChildSubclassSamePackage;
import com.JavaProjects.TestProjectsAccessSpecifier.AccessSpecifierParent;
import com.JavaProjects.TestProjectsFiles.TestObject2;
import com.JavaProjects.TestProjectsStreams.StreamsInJava;

import InterviewPreparationsPgm.InterviewInspire;

public class TestMainMethodCalls 
{
	public void methodCalls() 
	{
//		switchStatementTests();//switch statement 
//		whileLoopTests();//while loop
//		doWhileLoopTests();//while loop
//		forLoopTests();//for loop
//		methodOverloadingTests();//Method overloading
//		stringBufferTests();//String Buffer
//		hashMapTests();//Hash Map
//		arrayTests();//Array test
//		collectionTest();//Collection
//		collectionClassesTest();//Collection classes
//		staticVariablesTests();//Static variables
//		staticMethodTests();//static method
//		staticBlockTests();//static block
//		preIncrementOperatorTest();//Pre Increment Operator Test
//		genericsTest();//Test of Generics
//		listTestPgm();// print using stream, reduce from a list from interview question
//		filterInJavaTest();//filter in java for streams
//		mapInJavaTest();//map in java for streams
//		reduceInJavaTest();//reduce in java for streams
//		dateFunctionTest();//print date in diff formats
//		illegalArgumentExceptionTestPgm();//illegal Argument Exception from interview question
//		sqlWarningClassTestPgm();//test sql warning from interview question**********
//		biFunctionTest();//BiFunction 
//		binaryOperatorTest();//BinaryOperator
//		anagramTestPgm();//check the entered strings are anagram or not
//		typeCastingTest();//Type casting and type promotion
//		databaseConnectionTest();//database query tesing
//		ThisKeywordTest();//this keyword
//		constructorTest();//Constructors
//		anonymousObjectTest();//Anonymous object
//		threadClassTest();//Thread class
//		threadUsingRunnableTest();//Thread using runnable
//		threadOtherMethodsTest();//Synchroniszd, join in thread
//		threadUsingLambda();//Thread using lambda
//		inheritanceTest();//Single and multilevel inheritance
//		abstractBankTest();//abstract class and method
//		forEachTest();//for each loop test
//		streamTest();//Stream API
//		functionalInterrfaceImplTest();//lambda expression and functional interface
//		interviewInspire();//Interview question
//		innerClassTest();//inner class
//		hashMapKeyUserDefinedObj();//user defined obj as key in hash map
//		lambdaExpressionTest();//Labmda expression sample
//		lambdaExpressionWithArgumentsAndReturnTest();//Labmda expression with argments and return values
//		metodOverridingTest();//Method overriding
//		dynamicMethodDispatchTest();//dynamic method dispatch/ polymorphism(Run time polymorphism)
//		accessSpecifiersTest();//Access specifiers
//		finalKeywordWithVariableTest();//final with variable, to make variable as constant
//		finalKeywordWithMethodTest();//final with method
//		finalKeywordWithClassTest();//final in class
//		objectClassMethods();//Object class methods
//		wrapperClassesTest();//wrapper classes
//		exceptionTest();//Eception handling using try-catch
//		exceptionHandlingUsingThrow();//throw in exception handling
//		customEceptionHandling();//Custom exception handling
//		exceptionHandlingUsingThrows();//using throws
//		streamsInJava();//Stream programs in java
//		sortUsingComparator();//Sort using comparator
//		sortUsingComparable();//Sort implementation using comparable
//		varKeywordTest();//var keyword in java, introduced in java 10
//		sealedClassesTests();//SealedClasses
//		concatNumberAndString();//concat number and string
//		useOfNonStaticVariablesInStaticMethod();//use Of NonStaticV ariables In Static Method
//		defaultMethodTestInterface();//Default method test for interface; introduced in java 8
//		comparatorTests();//Implement manual sort using comparator
//		comparatorInterfaceImplementation();//custom sort by Implementing comparator interface
		comparableImplementation();//Implementation of comparable interface
	}
	
	private void comparableImplementation()
	{
		ComparableImplementation comparableImplementation = new ComparableImplementation();
		try
		{
			comparableImplementation.comparableImplementation();
			comparableImplementation.comparableImplementationUsingSort();
		} 
		catch (Exception e)
		{
			System.out.println("TestMainMethodCalls Exception :"+e);
		}
	}

	//custom sort by Implementing comparator interface
	private void comparatorInterfaceImplementation()
	{
		ComparatorInterfaceImplementation comparatorInterfaceImplementation	= new ComparatorInterfaceImplementation();
		comparatorInterfaceImplementation.comparatorInterfaceImplementationTest();
	}

	//Implement manual sort using comparator
	private void comparatorTests()
	{
		ComparatorTests comparatorTests = new ComparatorTests();
		comparatorTests.comparatorTests();
	}

	//Default method test for interface; introduced in java 8
	private void defaultMethodTestInterface()
	{
		new DefaultMethodTestInterface();// anonymous object, not assign to any ref variable
	}

	//Sort using comparator
	private void useOfNonStaticVariablesInStaticMethod()
	{
		SortUsingComparator sortUsingComparator = new SortUsingComparator();
		List<TestObject2> valuesintoList = sortUsingComparator.getValuesintoList();
		
		StaticMethodTest.getNonStaticVariableValues(valuesintoList.get(0));
	}
	
	private void streamTestUsingAccObj()
	{
		StreamTestUsingAccObj streamTestUsingAccObj = new StreamTestUsingAccObj();
		streamTestUsingAccObj.accBalGreater(400d);
		streamTestUsingAccObj.accBalGreaterAndActiveAcc(1000d,  "Suspend");
	}

	//concat number and string
	private void concatNumberAndString()
	{
		new ConcatNumberAndString();
	}

	//SealedClasses
	private void sealedClassesTests()
	{
		new SealedClasses();
	}

	//var keyword in java, introduced in java 10
	private void varKeywordTest()
	{
		VarKeyWord varKeyWord = new VarKeyWord();
		varKeyWord.varKeyword();
	}

	//Sort implementation using comparable
	private void sortUsingComparable()
	{
		SortUsingComparable sortUsingComparable = new SortUsingComparable();
		sortUsingComparable.sortUsingComparable();
	}

	//Sort using comparator
	private void sortUsingComparator()
	{
		SortUsingComparator sortUsingComparator = new SortUsingComparator();
		sortUsingComparator.sortUsingComparator();
	}

	private void streamsInJava()
	{
		StreamsInJava streamsInJava	= new StreamsInJava();	
		streamsInJava.streamsInJavaTests();
	}

	//using throws
	private void exceptionHandlingUsingThrows()
	{
		ExceptionHandlingUsingThrows exceptionHandlingUsingThrows = new ExceptionHandlingUsingThrows();
		try
		{
			//ClassNotFoundException
			exceptionHandlingUsingThrows.exceptionHandlingCNFEx("demo");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class Not Found Exception found e: "+e);
		}
		catch(Exception e)
		{
			System.out.println("UnKnown Exception found e: "+e);
		}
	}

	//Custom exception handling
	private void customEceptionHandling()
	{
		ExceptionCustomException exceptionCustomException = new ExceptionCustomException();
		exceptionCustomException.exceptionTests(0l);
	}

	//throw in exception handling
	private void exceptionHandlingUsingThrow()
	{
		ExceptionHandlingUsingThrow exceptionHandlingUsingThrow = new ExceptionHandlingUsingThrow();
		exceptionHandlingUsingThrow.exceptionTests(0l, 5, "Gince");//Arithametic exception
		exceptionHandlingUsingThrow.exceptionTests(6l, 3, "Gince");//array index out of bound
		exceptionHandlingUsingThrow.exceptionTests(9l, 10, null);//null pointer exception
	}

	//Eception handling using try-catch
	private void exceptionTest()
	{
		ExceptionTests exceptionTests = new ExceptionTests();
		exceptionTests.exceptionTests(0l, 5, "Gince");//Arithametic exception
		exceptionTests.exceptionTests(6l, 3, "Gince");//array index out of bound
		exceptionTests.exceptionTests(9l, 10, null);//null pointer exception
	}

	//wrapper classes
	private void wrapperClassesTest()
	{
		WrapperClassesTest wrapperClassesTest = new WrapperClassesTest();
		wrapperClassesTest.wrapperClassessBoxingTests();
		wrapperClassesTest.wrapperClassessUnBoxingTests();
	}

	//toString and equals methods in Object calss
	private void objectClassMethods()
	{
		ObjectClassMethodsTest objectClassMethodsTest = new ObjectClassMethodsTest();
		objectClassMethodsTest.ObjectClasstoStringMethod();
		objectClassMethodsTest.ObjectClassEualsMethod();
	}

	//final in class, stop inheriting a class to child class
	private void finalKeywordWithClassTest()
	{
		//cannot override the parent final class to the child class
		//FinalKeywordWithClassParent finalKeywordWithClassParent = new FinalKeywordWithClassChild();	
		FinalKeywordWithClassParent finalKeywordWithClassParent = new FinalKeywordWithClassParent();	
		finalKeywordWithClassParent.calcRadius(30d);
	}

 	//final with method, to stop override a methd to child class
	private void finalKeywordWithMethodTest()
	{
		FinalKeywordWithMethodChild finalKeywordWithMethodChild = new FinalKeywordWithMethodChild();	
		finalKeywordWithMethodChild.calcRadius(20d);
		//this always call parent method, as we cannot overide this final method to the child class
		finalKeywordWithMethodChild.printRadius();
	}

	//final with variable, to make variable as constant
	private void finalKeywordWithVariableTest()
	{
		FinalKeywordWithVariable finalKeywordWithVariable = new FinalKeywordWithVariable();	
		finalKeywordWithVariable.calcRadius(10d);
	}

	//Access specifiers
	private void accessSpecifiersTest()
	{
        /**same class**/
        AccessSpecifierParent accessSpecifierParent = new AccessSpecifierParent();
        accessSpecifierParent.accessMethods();
        
        /**same package non sub class**/
        AccessSpecifierChildNonSubclassSamePackage accessSpecifierChildNonSubclassSamePackage = new AccessSpecifierChildNonSubclassSamePackage();
        accessSpecifierChildNonSubclassSamePackage.accessMethods();
        
        /**same package sub class**/
        AccessSpecifierChildSubclassSamePackage accessSpecifierChildSubclassSamePackage = new AccessSpecifierChildSubclassSamePackage();
        accessSpecifierChildSubclassSamePackage.accessMethods();
        
        /**diff package non sub class**/
        AccessSpecifierChildNonSubclassDifferentPackage accessSpecifierChildNonSubclassDifferentPackage = new AccessSpecifierChildNonSubclassDifferentPackage();
        accessSpecifierChildNonSubclassDifferentPackage.accessMethods();
        
        /**diff package sub class**/
        AccessSpecifierChildSubclassDifferentPackage accessSpecifierChildSubclassDifferentPackage = new AccessSpecifierChildSubclassDifferentPackage();
        accessSpecifierChildSubclassDifferentPackage.accessMethods();		
	}

	//dynamic method dispatch/ polymorphism(Run time polymorphism)
	private void dynamicMethodDispatchTest()
	{
      MethodOverrideParent methodOverrideParentObj = new MethodOverrideParent();
      methodOverrideParentObj.show();//call to parent
      methodOverrideParentObj.display();//call to parent
      
      methodOverrideParentObj = new MethodOverrideChild();
      methodOverrideParentObj.show();//call to child
      methodOverrideParentObj.display();//call to parent as the method is not override to the child class
	}

	//Method overriding
	private void metodOverridingTest()
	{
		MetodOverridingTest metodOverridingTest	= new MetodOverridingTest();
		metodOverridingTest.metodOverridingTest();
		
		MethodOverrideParent methodOverrideParent = new MethodOverrideParent();  // parent class reference, parent class object
		methodOverrideParent.display();  // Calls parent class method
		methodOverrideParent.show();//calls parent class method

		MethodOverrideParent MethodOverrideChild = new MethodOverrideChild();        // parent class reference, child class object
		MethodOverrideChild.display();  // Calls child class Method ;- Overriding
		MethodOverrideChild.show();//calls parent class method as this method is nor override to the child class
	}

	//Labmda expression with argments and return values
	private void lambdaExpressionWithArgumentsAndReturnTest()
	{
		LambdaExpressionWithArgumentsAndReturnTest lambdaExpressionTest = new LambdaExpressionWithArgumentsAndReturnTest();
		lambdaExpressionTest.implementFunctionalInterface(10, 5);
	}
	
	//Labmda expression sample
	private void lambdaExpressionTest()
	{
		LambdaExpressionTest lambdaExpressionTest = new LambdaExpressionTest();
		lambdaExpressionTest.implementFunctionalInterface();
	}

	//user defined obj as key in hash map
	private void hashMapKeyUserDefinedObj()
	{
		HashMapKeyUserDefinedObj hashMapKeyUserDefinedObj = new HashMapKeyUserDefinedObj();
		hashMapKeyUserDefinedObj.objDiffernetValueKey();
		hashMapKeyUserDefinedObj.objSameValueKey();
	}

	//inner class
	private void innerClassTest()
	{
		InnerClassTest innerClassTest = new InnerClassTest();
		innerClassTest.getMainInnerClass();
		//initialise the inner class using obj of first class
		InnerClassTest.InnerClass innerClass = innerClassTest.new InnerClass();
		innerClass.getInnerClassDetails();
		
		//staic class
		InnerClassTest.StaticInnerClass staticInnerClass = new InnerClassTest.StaticInnerClass();
		staticInnerClass.getStaticInnerClassDetails();
	}

	//Interview question
	private void interviewInspire()
	{
		InterviewInspire interviewInspire = new InterviewInspire();
		interviewInspire.getListOfCoins();
	}

	//lambda expression and functional interface
	private void functionalInterrfaceImplTest()
	{
		FunctionalInterrfaceImplTest functionalInterrfaceImplTest = new FunctionalInterrfaceImplTest();	
		functionalInterrfaceImplTest.printValue();
		
		/**we implement the functional interface method without creating anothe class**/
		FunctionalInterfaceTest functionalInterfaceTest = new FunctionalInterfaceTest()
		{
			@Override
			public void printValue()
			{
				System.out.println("Printed in main");				
			}
		};
		functionalInterfaceTest.printValue();
		
		/**we implement the functional interface method using lambda expression**/
		FunctionalInterfaceTest functionalInterfaceTest1 = () ->
		{
			System.out.println("Printed in main using lambda");
		};
		functionalInterfaceTest1.printValue();
		
		/**if implemenation of interface contain only one line then we have to write it in a single line**/
		FunctionalInterfaceTest functionalInterfaceTest2 = () ->System.out.println("Printed in main single line");
		functionalInterfaceTest2.printValue();
	}

	//Stream API
	private void streamTest()
	{
		StreamTest streamTest = new StreamTest();
		streamTest.streamOperations();
	}

	//	for each loop test
	private void forEachTest()
	{
		ForEachTest forEachTest = new ForEachTest();
		forEachTest.forEachLoop();
	}

	//abstract class and method
	private void abstractBankTest()
	{
		AbstractBankTest abstractBankTest = new AbstractBankTest();
		abstractBankTest.bankTransactions();
	}

	//Single and multilevel inheritance
	private void inheritanceTest()
	{
		InheritanceChildTest inheritanceChildTest	= new InheritanceChildTest();	
		//we can call th super class methods add and sub
		Long add = inheritanceChildTest.add(1l, 2l);
		Long sub = inheritanceChildTest.sub(10l, 2l);
		//child methods mul and div
		Long mul = inheritanceChildTest.mul(1l, 20l);
		Long div = inheritanceChildTest.div(15l, 2l);
		
		System.out.println("add:"+add+" ,sub:"+sub+" ,mul:"+mul+" ,div:"+div);
		
		InheritanceMultilevelTest inheritanceMultilevelTest = new InheritanceMultilevelTest();
		Long square = inheritanceMultilevelTest.square(3l);
		System.out.println("square:"+square);
	}
	
	//Thread Using Lambda
	private void threadUsingLambda()
	{
		new ThreadUsingLambda();
	}

	//Synchronized, join in thread
	private void threadOtherMethodsTest()
	{
		ThreadOtherMethodsTest threadOtherMethodsTest = new ThreadOtherMethodsTest();
		threadOtherMethodsTest.executeThreadOtherMethods();
	}

	//Thread using runnable
	private void threadUsingRunnableTest()
	{
		ThreadUsingRunnableTest threadUsingRunnableTest	 = new ThreadUsingRunnableTest();	
		threadUsingRunnableTest.executeThreadUsingRunnable();
	}

	//Thread class
	private void threadClassTest()
	{
		ThreadClassTest threadClassTest	= new ThreadClassTest();
		threadClassTest.executeThreadClasses();
	}


	//Anonymous object
	private void anonymousObjectTest()
	{
		/**anonymous object creation, not assigned to any ref variable**/
		new AnonymousObjectTest().printStetement(30l);
	}

	//Constructors
	private void constructorTest()
	{
		ConstructorTest constructorTest = new ConstructorTest();
		System.out.println("Values after calling default constructor.....constructorTest object");
		constructorTest.showAllValues();
		
		ConstructorTest constructorTestObj1 = new ConstructorTest(31l, false);
		System.out.println("Values after calling constructor with age and isAcative.....constructorTestObj1 object");
		constructorTestObj1.showAllValues();
	}

	//this keyword
	private void ThisKeywordTest()
	{
		ThisKeywordTest thisKeywordTest = new ThisKeywordTest();
		thisKeywordTest.setAgeWithoutThis(10l);
		System.out.println("Inside after setAgeWithoutThis local variable value age:"+thisKeywordTest.getAge());
		
		thisKeywordTest.setAgeByCreaingObj(15l);
		System.out.println("Inside after setAgeByCreaingObj local variable value thisKeywordTest.age:" + thisKeywordTest.getAge());
		thisKeywordTest.setAgeByPassingObj(21l, thisKeywordTest);
		thisKeywordTest.setAgeWithoutThisDiffNameOfInstanceVariable(32l);
		thisKeywordTest.setAge(43l);
		thisKeywordTest.setName("Gince");
		System.out.println("final value thisKeywordTest.getName():"+thisKeywordTest.getName());
		System.out.println("final value thisKeywordTest.getAge():"+thisKeywordTest.getAge());
	}

	private void databaseConnectionTest()
	{
		DatabaseConnectionTest databaseConnectionTest = new DatabaseConnectionTest();
		databaseConnectionTest.getDataFromTable("USERS");
	}

	//Type casting and type promotion
	private void typeCastingTest()
	{
		TypeCastingTest typeCastingTest = new TypeCastingTest();
		typeCastingTest.implicitTypeCating();
		typeCastingTest.explicitTypeCating();
		typeCastingTest.typePromotion();
	}

	//check the entered strings are anagram or not
	private void anagramTestPgm()
	{
		AnagramTestPgm anagramTestPgm = new AnagramTestPgm();
		anagramTestPgm.getInputStringManually();
		Boolean checkAnagram = anagramTestPgm.checkAnagram();
		if(checkAnagram)
			System.out.println("Anagram");
		else
			System.out.println("Not an Anagram");
	}

	//BinaryOperator
	private void binaryOperatorTest()
	{
		BinaryOperatorTest binaryOperatorTest = new BinaryOperatorTest();
		binaryOperatorTest.binaryOperatorTest();
	}

	//BiFunction 
	private void biFunctionTest()
	{
		BiFunctionTest biFunctionTest = new BiFunctionTest();
		biFunctionTest.biFunctionTest();
	}

	//test sql warning from interview question 
	private void sqlWarningClassTestPgm()
	{
		SQLWarningClassTestPgm sqlWarningClassTestPgm = new SQLWarningClassTestPgm();
		sqlWarningClassTestPgm.printSQLWarning();
	}

//	illegal Argument Exception from interview question
	private void illegalArgumentExceptionTestPgm()
	{
		IllegalArgumentExceptionTestPgm illegalArgumentExceptionTestPgm = new IllegalArgumentExceptionTestPgm();
		illegalArgumentExceptionTestPgm.callToMethod();
	}
	
	//print date in diff formats
	private void dateFunctionTest()
	{
		DateFunctionTest dateFunctionTest = new DateFunctionTest();
		dateFunctionTest.printDateFormats();
	}

	//reduce in java for streams
	private void reduceInJavaTest()
	{
		ReduceInJavaTest reduceInJavaTest = new ReduceInJavaTest();
		reduceInJavaTest.printUsingReduce();
	}

	//map in java for streams
	private void mapInJavaTest()
	{
		MapInJavaTest mapInJavaTest = new MapInJavaTest();
		mapInJavaTest.printUsingMap();
		mapInJavaTest.printUsingMapAndFilter();
	}

	//filter in java for streams
	private void filterInJavaTest()
	{
		FilterInJavaTest filterInJavaTest = new FilterInJavaTest();		
		filterInJavaTest.printUsingFilter();
		filterInJavaTest.printUsingFilterAndPredicate();
		filterInJavaTest.printUsingFilterAndPredicateLamda();
	}

	//print using stream, reduce from a list
	private void listTestPgm()
	{
		ListTestPgm listTestPgm = new ListTestPgm();
		listTestPgm.test1();
		listTestPgm.test2();
		listTestPgm.test3();
		listTestPgm.test4();
		listTestPgm.test5();
		listTestPgm.test6();
	}

	//Test of Generics
	private void genericsTest()
	{
		GenericsTest genericsTest = new GenericsTest();
	}

	//Pre Increment Operator Test
	private void preIncrementOperatorTest() 
	{
		PreIncrementOperatorTestPgm preIncrementOperator = new PreIncrementOperatorTestPgm();
		preIncrementOperator.preIncrmentOperatorTest();
	}
	
	// static block
	private void staticBlockTests() 
	{
		StaticBlockTest staticBlockTest = new StaticBlockTest();
		staticBlockTest.setNonStaticVariableValues("Samsung", "A71", 1234d);
		staticBlockTest.getNonStaticVariableValues();
		StaticBlockTest.getStaticVariableValues();
		
		StaticBlockTest staticBlockTest1 = new StaticBlockTest();
		staticBlockTest1.setNonStaticVariableValues("Apple", "i14P", 4321d);
		staticBlockTest1.getNonStaticVariableValues();
		StaticBlockTest.getStaticVariableValues();
	}
	
	//static method
	private void staticMethodTests() 
	{
		StaticMethodTest staticMethodTest = new StaticMethodTest();
		staticMethodTest.setNonStaticVariableValues("Samsung", "A71", 1234d);
		staticMethodTest.getNonStaticVariableValues();
		staticMethodTest.getStaticVariableValues();//This is not the correct wat to call static methods
		StaticMethodTest.getStaticVariableValues();//This is the correct way to use static mehod
	}
	
	//Static variables
	private void staticVariablesTests() 
	{
		System.out.println("Ststic Variable values set by object");
		StaticVariableTest staticVariableTestObj = new StaticVariableTest();
		staticVariableTestObj.category = "Mobiles";
		staticVariableTestObj.modelName = "Samsung";
		staticVariableTestObj.modelNo = "A71";
		staticVariableTestObj.price = 1234d;
		staticVariableTestObj.getStaticVariableValues();
		staticVariableTestObj.getNonStaticVariableValues();
		
		StaticVariableTest staticVariableTestObj1 = new StaticVariableTest();
//		staticVariableTestObj1.category = "Mobile";//Print the same value we set at last for the previous object
		staticVariableTestObj1.modelName = "Apple";
		staticVariableTestObj1.modelNo = "i13P";
		staticVariableTestObj1.price = 4321d;
		staticVariableTestObj1.getStaticVariableValues();
		staticVariableTestObj1.getNonStaticVariableValues();
		System.out.println();
		System.out.println("Ststic Variable values set by class name");
		StaticVariableTest.category = "Mobile Pones";
		
		StaticVariableTest staticVariableTestObj2 = new StaticVariableTest();
//		staticVariableTestObj2.category = "My Mobile";
		staticVariableTestObj2.modelName = "Oppo";
		staticVariableTestObj2.modelNo = "O092";
		staticVariableTestObj2.price = 9009d;
		staticVariableTestObj2.getStaticVariableValues();
		staticVariableTestObj2.getNonStaticVariableValues();
		
		staticVariableTestObj.getStaticVariableValues();
		staticVariableTestObj.getNonStaticVariableValues();
		
		staticVariableTestObj1.getStaticVariableValues();
		staticVariableTestObj1.getNonStaticVariableValues();
		
		staticVariableTestObj2.getStaticVariableValues();
		staticVariableTestObj2.getNonStaticVariableValues();
	}
	
	//Collection classes
	private void collectionClassesTest()
	{
		CollectionTest1 collectionTest1 = new CollectionTest1();
	}
	
	// collection
	private void collectionTest() 
	{
		CollectionTest collectionTest = new CollectionTest();
		Collection collectionList = collectionTest.setCollectionList();
		collectionTest.getCollectionList(collectionList);
		collectionTest.getIntegerTypeCollectionList();
	}
	
	// Array list test
	private void arrayTests() 
	{
		ArrayTests arrayTests = new ArrayTests();
		arrayTests.arraySample();
	}
	
	//Hash maps
	private void hashMapTests() 
	{
		HashMapTest hashMapTest = new HashMapTest();	
		hashMapTest.setMapValues();
		
		String key = "gince";
		String value = hashMapTest.getVauleByKey(key);
		System.out.println("Given Key:"+key +"Value :"+value);
		
		hashMapTest.getAllValuesKeySet();
		hashMapTest.getAllValuesMapEntry();
	}
	
	//String buffer
	private void stringBufferTests() 
	{
		StringBufferTest stringBufferTest = new StringBufferTest();	
		stringBufferTest.stringBufferCapacit();
		stringBufferTest.stringBufferOperations();
	}

	//Method overloading test
	private void methodOverloadingTests()
	{
		MethodOverloadingTest methodOverloadingTest	= new MethodOverloadingTest();
		methodOverloadingTest.add(4, 45);
		methodOverloadingTest.add(4, 45, 5);
		methodOverloadingTest.sub(45, 4);
		methodOverloadingTest.sub(45, 10l);
		
	}

	//for loop
	private static void forLoopTests() 
	{
		ForLoopTest forLoopTest	= new ForLoopTest();	
		forLoopTest.forLoopTests();
		forLoopTest.forLoopTests1(1);
		forLoopTest.forLoopTests2(3l);
	}

	//do while loop testing
	private static void doWhileLoopTests() 
	{
		DoWhileLoopTest doWhileLoopTest = new DoWhileLoopTest();
		doWhileLoopTest.doWhileLoopTest(-1);
	}

	//while loop testing
	private static void whileLoopTests() 
	{
		WhileLoopTest whileLoopTest = new WhileLoopTest();
		whileLoopTest.whileLoopTest(-1);
	}

	//switch statement testing
	private static void switchStatementTests() 
	{
		try 
		{
			SwichStatementTest swichStatementTest = new SwichStatementTest();
			System.out.println("---switch without break");
			swichStatementTest.switchWithoutBreak(3);
				
			System.out.println("---switch with break");
			swichStatementTest.switchWithBreak(2l);
				
			System.out.println("---switch with -> instead of break");
			swichStatementTest.switchWithArrowBreak("b");
				
			System.out.println("---switch with return value");
			swichStatementTest.switchWithReturnValue("d");
				
			System.out.println("---swith with colon and yield key word");
			swichStatementTest.switchWithoutWithColonAndYield("Wednesday");
		} 
		catch (Exception e) 
		{
			System.out.println("SwitchStatementTests failed:"+e);
		}
	}
}