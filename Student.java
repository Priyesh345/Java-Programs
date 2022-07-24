class Student1
{
    int id;
    String name;
    String Branch;
    String University;

    void setDetails(int i,String n,String b,String u)
    {
	id=i;
	name=n;
	Branch=b;
	University=u;
    }

    void showDetails()
    {
	System.out.println(id+" "+name+" "+Branch+" "+University);
    }
}

public class Student
{
    public static void main(String[] args)
    {
	Student1 obj=new Student1();
	obj.setDetails(200111148,"Priyesh","CSE","Gehu");
	obj.showDetails();
    }
}
