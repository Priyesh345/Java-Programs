public class This
{
	void A()
	{
		System.out.println(this);
	}

	public static void main(String[] args)
	{
		 This obj=new This();
		 System.out.println(obj);
		 obj.A();
	}
}
