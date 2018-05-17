package com.may17;

public class concatenation {
	public static void main(String args[])
	{
		int age=25;
	StringBuffer s=new StringBuffer("She is");// for string
	StringBuffer s1=new StringBuffer("Hello to Mphasis");
	System.out.println("string buffer= "+s);
	System.out.println("s append= "+s.append(age));// adds at the back
	System.out.println("s append= "+s.append("years old."));
	System.out.println("entire string= "+s.toString());// it will convert stringbuffer to string
	System.out.println("length= "+s.length());//counts the length
	System.out.println("capacity= "+s.capacity());//extra space along with the length
	System.out.println("s1 ="+s1);
	System.out.println("charAt=" +s1.charAt(1));//gives the letter at position 1 in string s1
	s1.setCharAt(1,'i');
	s1.setLength(5);
	System.out.println("s1="+s1);
	System.out.println("set insert="+s1.insert(5,"welcome"));
	System.out.println("to delete="+s1.delete(5,6));
	System.out.println("to reverse="+s1.reverse());
	System.out.println(s);
	System.out.println(s1);
	}
	
	}
out put:
string buffer= She is
s append= She is25
s append= She is25years old.
entire string= She is25years old.
length= 18
capacity= 22
s1 =Hello to Mphasis
charAt=e
s1=Hillo
set insert=Hillowelcome
to delete=Hilloelcome
to reverse=emocleolliH
She is25years old.
emocleolliH


