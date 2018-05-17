package com.may14;
import java.util.*;
class student {
	int rollno;
	String name,email;
protected void input()
{
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter rollno,name,email");
	rollno=ob.nextInt();
	name=ob.next();
	email=ob.next();}
void display()
{
	System.out.println(" rollno is"+rollno);
	System.out.println("name is"+name);
	System.out.println("email is"+email);
	
}
}
public class studentdetails extends student
{
	int m1,m2,m3;
	float total,avg;
	void input1()
	{
		super.input();
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter marks");
		m1=ob.nextInt();
		m2=ob.nextInt();
		m3=ob.nextInt();}
	void display1()
	{
		super.display();
		total=m1+m2+m3;
		avg=(total/3);
		System.out.println("Total is"+total);
		System.out.println("Average is"+avg);
		
	}
	public static void main(String[] arg)
	{
		studentdetails s=new studentdetails();
		
		s.input1();
		s.display1();
	
	}
}
