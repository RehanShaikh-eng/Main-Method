package factorialUsingRecursion;
//import java.util.*;
public class factorialUsingRecursion {

	public static void main(String[] args)
	{
		//Scanner sc = new Scanner (System.in);
		// System.out.println("Enter Number : ");
		//int n = sc.nextInt();
		int fact = 1;
		System.out.println("Factorial of : " + fact);
		for(int i = fact ; i >= 1 ; i--)
		{
			fact = fact * i;
			System.out.print(fact + " ");
			
		}
			
		System.out.print(fact + " ");

	}
}