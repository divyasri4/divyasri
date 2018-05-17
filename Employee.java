package com.may14;
import java.util.*;
public class Employee
{
	int empno;
	String name,address;
	void input()
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter empno,name,address");
		empno=ob.nextInt();
		name=ob.next();
		address=ob.next();
	}
	void display()
	{
		System.out.println("the empno is " +empno);
		System.out.println("the empno is " +name);
		System.out.println("the address is " +address);
	}
	public static void main(String[] arg)
	{
		Employee ob1=new Employee();
		ob1.input();
		System.out.println("the empno is " +ob1.empno);
		ob1.display();
	}
	}


