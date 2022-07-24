class Hello
{
	int roll;
	String name,course;
	float fee;

	Hello(int roll,String name,String course)
		{
			this.roll=roll;
			this.name=name;
			this.course=course;
		}

	Hello(int roll,String name,String course,float fee)
	{
		this(roll,name,course);
		this.fee=fee;
	}

	void display()
		{
			System.out.println(roll+" "+name+" "+course+" "+fee);
		}
}

public class Chaining1
{  
	public static void main(String[] args)
	{
	Hello obj=new Hello(45,"Priyesh","CSE",55f);
	obj.display();
        }
}

