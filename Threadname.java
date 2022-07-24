class Mythread extends Thread
{

}


public class Threadname
{
	public static void main(String[] args)
	{
		System.out.print(Thread.currentThread().getName());
		Mythread t=new Mythread();
		System.out.println(t.getName());
		Thread.currentThread().setName("Pirthviraj chauhan");
		System.out.println(Thread.currentThread().getName());
		System.out.println(10/0);
	}
}

