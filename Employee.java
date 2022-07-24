public class Employee
{
	int id;
	String name;
	Address address;

	public Employee(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}

	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}

	public static void main(String[] args)
	{
		Address a1=new Address("Lucknow","UP","India");
		Address a2=new Address("Banaras","UP","India");


		Employee e=new Employee(200111148,"Priyesh",a1);
		Employee e1=new Employee(200111456,"tango",a2);

		e.display();
		e1.display();
	}
}
