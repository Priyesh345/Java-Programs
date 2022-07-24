public class Constructor1
{
	int roll;
	String name;

	Constructor1(int r,String s)
		{
			roll=r;
			name=s;
		}
	Constructor1(Constructor1 t)
	{
		roll=t.roll;
		name=t.name;
	}

	void display(){System.out.println(roll+" "+name);}

	public static void main(String[] args)
		{
			Constructor1 obj1=new Constructor1(45,"Priyesh");
			Constructor1 obj2=new Constructor1(obj1);

			obj1.display();
			obj2.display();
		}
}
