interface Animal
{
    void eat();
}

interface Cat
{
    void drink();
}

class Interface implements Animal,Cat{
    public void eat()
    {
	System.out.println("Eating...");
    }

    public void drink()
    {
	System.out.println("Drinking..");
    }

    public static void main(String[] args)
    {
	Interface A=new Interface();
	A.eat();
	A.drink();
    }
}
