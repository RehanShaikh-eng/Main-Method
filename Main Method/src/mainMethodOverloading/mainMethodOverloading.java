package mainMethodOverloading;

public class mainMethodOverloading {

	public static void main(String [] args)
	{
		System.out.println("Inside First Main Method");
		main(2);
	}
	public static void main(int x)
	{
		System.out.println("Inside second Main Method");
		main(23.566);
	}
	public static void main(Double z)
	{
		System.out.println("Inside Third Main Method");
		main(4,6);
	}
	public static void main(int a , int c)
	{
		System.out.println("Inside Fourth Main Method");
		main(4,6);
	}
}
