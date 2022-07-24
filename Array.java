import java.util.Scanner;
public class Array
{
    public static void main(String[] args)
    {
	Scanner nt=new Scanner(System.in);
	System.out.println("Enter the size of array: ");
	int n=nt.nextInt();

	int[] arr=new int[n];

	for(int i=0;i<n;i++)
	    {
		arr[i]=nt.nextInt();
	    }

	System.out.print("Required array is :");

	for(int i=0;i<n;i++)
	    {
		System.out.print(arr[i]+" ");
	    }
	
    }
}

    
