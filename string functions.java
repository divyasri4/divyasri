package com.may17;

public class string1 {
	public static void main(String[] args)
	{
		String s1="Mphasis software";
		System.out.println(s1);
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s1.indexOf('a'));
	System.out.println(s1.lastIndexOf('a'));
	System.out.println(s1.substring(5));
	System.out.println(s1.substring(5,6));
	System.out.println(s1.startsWith("hp"));//false
	System.out.println(s1.endsWith("re"));//true
	System.out.println(s1.replace("software","soft"));
	String ss="Mphasis software,Mumbai";
	System.out.println(ss);
	System.out.println(s1);
	System.out.println("the length of string"+ss.length());
	System.out.println(ss.replace("Mumbai","bangalore"));
		char name[]=s1.toCharArray();//converts string to char array(name) here
		int leng=name.length;//assigns the length of name array to leng variable
		System.out.println("length of array ="+leng);
	for(int i=0;i<leng;i++)
	{
		System.out.println(name[i]);
	}
}
}
