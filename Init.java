class GFG
{
    void eat()
    {
	System.out.println("Eating is good");
    }

    GFG()
    {   super();
	System.out.println("Running");
    }

    {System.out.println("hello there");}
}

public class Init
{
    public static void main(String[] args)
    {
	GFG obj=new GFG();
    }
}
