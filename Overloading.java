 class Overload
{
	public static int add(int a,int b)
	{
		return a+b;
	}

	public static double add(int a,int b)
	{
		return a+b;
	}
}

public class Overloading
{
	public static void main(String[] args)
	{
		System.out.println(Overload.add(10,20));
	}
}
