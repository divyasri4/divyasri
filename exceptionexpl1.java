package com.may18;
import java.util.*;
public class exceptionexpl1
{
public static void main(String[] args)
{
	try
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter 2 no's");
		int a=ob.nextInt();
		int b=ob.nextInt();
		int c=a/b;
		System.out.println("the result is"+c);
	
	}
	catch(Exception ae)//if there is error then only catch block will execute
	{
		
		System.out.println("the error is"+ae);	
	}
	
	finally
	
	{
	System.out.println("the program continues.......");
	}
	
}
}
