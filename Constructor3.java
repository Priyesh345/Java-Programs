public class Constructor3
{
	void A(){System.out.println("Hello n");}

	void B()
	{

		System.out.println("Hello m");
		this.A();
	}

	public static void main(String[] args)
	{
		new Constructor3().B();
	}
}
