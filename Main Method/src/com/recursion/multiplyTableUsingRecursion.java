package com.recursion;
import java.util.*;
public class multiplyTableUsingRecursion {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number : ");
		int x = sc.nextInt();
		
		multiply(x);
		
	}
		static void multiply(int x)
	{
			if(x == 0)
			{
				return;
			}
			else
			{
				System.out.println("Multiply of the numbers are : " + x);
				multiply(x % 2);
			}
	}
}
