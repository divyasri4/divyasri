package com.may16;

import java.util.Scanner;

interface bank
{
	void createAccount();
void deposite();
void withDraw();
void balCheck();
}
public class mainclass implements bank
{
float bal=5000,dep,wd;


	public void createAccount()
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter accno,name,branch");
		int accno=ob.nextInt();
		String name=ob.next();
		String branch=ob.next();
	
	}

	public void deposite()
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter deposite");
		 dep=ob.nextFloat();
		 bal+=dep;
		 System.out.println("the balance is"+bal);
	}

	public void withDraw() 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter withdraw");
		 wd=ob.nextFloat();
		 bal-=wd;
		 if(bal<1000)
		 {
			 System.out.println("the balence is less than 1000");
		 }
		 else
		 {
			 System.out.println("the balance is"+bal);
		 }

	}

	public void balCheck() 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("want to deposite or withdraw ");
		String x=ob.next();
		if(x.equals("deposite"))
		{
			deposite();
		}
		else
		{
			withDraw();
		}
	}
	
public static void main(String[] args)
{
	mainclass ob=new mainclass();
	ob.createAccount();
	ob.balCheck();

	
	
}                                                                                                                                                                                                                                                                                                                                                                                                                                                    
}