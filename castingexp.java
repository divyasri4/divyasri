package com.may17;

public class castingexp 
{
	public static void main(String[] args) 
	{
		
//implicit casting
		byte a=10;
		int b=a;
		System.out.println(b);
		//explicit castig
		int c=10;   //4 bytes
		byte d=(byte)c;
		System.out.println(d);
		//explicit casting
		float e=10.5f;
		int f=(int)e;
				System.out.println(f);

}
}