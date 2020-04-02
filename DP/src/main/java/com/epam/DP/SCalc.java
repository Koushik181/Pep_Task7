package com.epam.DP;

/**
 * Hello world!
 *
 */
public class SCalc 
{
	
	private static SCalc cal ;
	private SCalc() {};
	public static SCalc getInstance()
	{
		if(cal==null)
			cal = new SCalc();
		return cal;
	}
	public int addition(int a,int b)
	{
		return a+b;
	}
	public  int subtraction(int a,int b)
	{
		return a-b;
	}
	public int multiplication(int a,int b)
	{
		return a*b;
	}
	public int division(int a,int b)
	{
		return a/b;
	}
}
