class Display
{
    public  static synchronized void wish(String name)
    {
	for(int i=0;i<10;i++)
	    {
		System.out.print("Good Morning: ");

		    try
			{
			    Thread.sleep(2000);
			}
		    catch(InterruptedException e)
			{
			}
		System.out.println(name);
	    }
    }
}

class MyThread extends Thread
{
    Display d;
    String name;

    MyThread(Display d,String name)
    {
	this.d=d;
	this.name=name;
    }

    public void run()
    {
	d.wish(name);
    }
}

class Synchronized
{
    public static void main(String[] args)
    {
	Display d=new Display();
	// Display d1=new Display();
	MyThread t=new MyThread(d,"Priyesh");
	MyThread t2=new MyThread(d,"Devesh");
	t.start();
	t2.start();
    }
}
