import java.util.Scanner;
class Employee
{
    int id;
    String name;
    String Department;
    int salary;

    void setDetails(int id,String name,String Department,int salary)
    {
	this.id=id;
	this.name=name;
	this.Department=Department;
	this.salary=salary;
    }

    Employee()
    {
	setDetails(id,name,Department,salary);
    }

    void showDetails()
    {
	System.out.println(id+" "+name+" "+Department+" "+salary);
    }
}


    public class Employee1
    {
	public static void main(String[] args)
	{
	    Scanner ok=new Scanner(System.in);
	    System.out.print("Enter id: ");
	    int i=ok.nextInt();
	    Scanner te=new Scanner(System.in);
	    System.out.print("Enter name: ");
	    String s=te.nextLine();
	    Scanner kh=new Scanner(System.in);
	    System.out.print("Enter Department: ");
	    String d=kh.nextLine();
	    Scanner obj1=new Scanner(System.in);
	    System.out.print("Enter Salary: ");
	    int o=obj1.nextInt();

	    Employee obj=new Employee();
	    obj.setDetails(i,s,d,o);
	    obj.showDetails();
	}
    }
	    
