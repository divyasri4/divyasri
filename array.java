package com.may17;
import java.util.*;

public class array
{
public static void main(String[] args)
{
	int a[]=new int[5];//-----------int tyoe 5 memory blocks are created.
	int sum=0;
	Scanner ob=new Scanner(System.in);
	System.out.println("enter 5 no's");
for(int i=0;i<5;i++)
	a[i]=ob.nextInt();
System.out.println("5 numbers are");
for(int i=0;i<5;i++)
{
	System.out.println(a[i]);
	sum=sum+a[i];}
System.out.println("the sum of 5 numbers is"+sum);

}

}
