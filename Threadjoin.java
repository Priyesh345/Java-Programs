class Mythread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Sita thread");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
			}
			Thread.join();

		}
	
	}
}

class Threadjoin
{
	public static void main(String[] args) throws InterruptedException
	{
		Mythread t=new Mythread();
		t.start();
		

		for(int i=0;i<10;i++)
		{
			System.out.println("Ram thread");
		}
	}
}
