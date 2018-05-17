package com.may14;
import java.util.Scanner;

abstract class abstractexample
{                                                                                                    
	abstract void inputStudentdetails();
	abstract void inputStudentMarks();
	abstract int sum(int a,int b);
	void studentexample()
	{
		System.out.println("He is student of class tenth");
	}
}

	public class abstractclass extends abstractexample
	
	{

		void inputStudentdetails()
		{
			Scanner ob=new Scanner(System.in);

		System.out.println("enter rollno,name of student");
				int rollno=ob.nextInt();
				String name=ob.next();
				System.out.println("the rollno is"+rollno+"the name is"+name);
		}
		void inputStudentMarks() 
		{
			Scanner ob=new Scanner(System.in);
			System.out.println("enter physics,chemiastry,biology marks");
			int phy=ob.nextInt();
			int chem=ob.nextInt();
			int bio=ob.nextInt();
			int total=phy+chem+bio;
			System.out.println("the total marks is "+total);
		}
		int sum(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}
	
		
	public static void main(String[] args)
	
	{
		abstractclass ob=new abstractclass();
		ob.inputStudentdetails();
		ob.inputStudentMarks();
		ob.studentexample();
		System.out.println("the sum is"+ob.sum(5,6));
		
		
	}
		
	}