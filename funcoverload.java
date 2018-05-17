package com.may14;

public class funcoverload {
	int sum(int a,int b)
	{  return a+b; }
	int sum(int a,int b,int c)
	{ return a+b+c; }
	float sum(float a,float b)
	{ return a+b; }
	public static void main(String[] args)
	{
		funcoverload f1=new funcoverload();
		System.out.println("the sum is"+f1.sum(6,7));
		System.out.println("the sum is"+f1.sum(6.7f,4.5f));
		System.out.println("the sum is"+f1.sum(5,6,7));
		
	}

}
