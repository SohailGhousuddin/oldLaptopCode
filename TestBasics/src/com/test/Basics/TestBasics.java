package com.test.Basics;

import java.util.Scanner;

public class TestBasics {
public static void main(String[] args)
{
	
	int i = 4; // Name:i,  Data Type: int ; value : 0
	String s = "This is String"; // Name:s,  Data Type: String; value : "This is value"
	double d = 2.0; 
	Scanner sc = new Scanner(System.in);
	
	/*
	 * 
	 * 
	 * */
	// Condition to check if i is odd or even
	if( i%2==0)
	{
		System.out.println("Int is even:"+i);
	}
	else 
	{
		System.out.println("Int is odd:"+i);
	}
	
	// is int divisible by 3 
	// if yes print i is divisible by 3
	// else print i is not divisble by 3
	
	int i3 = 5; // Name:i3,  Data Type: int ; value : 0
	if( i3%3==0)
	{
		System.out.println("Int is divisible of 3:"+i3);
	}
	else 
	{
		System.out.println("Int is not divisible of 3:"+i3);
	}
	System.out.println("Please enter any Integer value and press enter:");
	 int a = sc.nextInt(); 
	 
		System.out.println("Please enter any Integer value to divide and press enter:");
		 int div = sc.nextInt(); 
		 
		 System.out.println("inter/divided value is :"+a+"/"+div+":" +a/div);
}
}