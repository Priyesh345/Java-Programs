class hello implements Cloneable
{
	int roll;
	String name;

	hello(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	public static void main(String[] args)
	{
		try
		{
			hello h1=new hello(200111148,"Priyesh Singh");
			hello h2=(hello)h1.clone();
			System.out.println(h1.roll+ " " +h1.name);
			System.out.println(h2.roll+ " "+ h2.name);
		}
		catch(CloneNotSupportedException c){}
	}
}
