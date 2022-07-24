public class Constructor2
{
	int roll;
	String name;

	Constructor2(int r,String s)
	{
		roll=r;
		name=s;
	}

	Constructor2(){}

	void display(){System.out.println(roll+" "+name);}

	public static void main(String[] args)
		{
			Constructor2 obj1=new Constructor2(45,"Priyesh");
			Constructor2 obj2=new Constructor2();

			obj2.roll=obj1.roll;
			obj2.name=obj1.name;

			obj1.display();
			obj2.display();
		}
}
