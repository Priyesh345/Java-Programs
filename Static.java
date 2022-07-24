 class Static1
{
	//int count=0;
	static int count=0;

	Static1()
	{
		count++;
		System.out.println(count);
	}
}

public class Static
{
	public static void main(String[] args)
	{
	Static1 obj=new Static1();
	Static1 obj1=new Static1();
	Static1 obj2=new Static1();
}
}
