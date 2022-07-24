import java.util.Scanner;

public class Sum
{
    public static void main(String[] args)
    {
	Scanner tp=new Scanner(System.in);
	System.out.println("Enter the first number: ");
	int a=tp.nextInt();

	Scanner oy=new Scanner(System.in);
	System.out.println("Enter Second number: ");
	int b=oy.nextInt();

	int c=add(a,b);

	System.out.println("The sum of a and b is = "+c);
    }

    public static int add(int a,int b)
    {
	int s;
	s=a+b;
	return s;
    }
}
	
