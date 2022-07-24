 class Chaining1
{
	Chaining1(){System.out.println("Constructor Chaining");}
	Chaining1(int x)
	{
		this();
		System.out.println(x);
	}
}

public class Chaining
{    public static void main(String[] args)
	{
	Chaining1 obj=new Chaining1(10);
	
        }

}

