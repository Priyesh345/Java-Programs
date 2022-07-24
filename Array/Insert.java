import java.util.*;

public class Insert
{
    static int Insertion(int[] arr,int n,int cap,int x,int pos)
    {
	if(n==cap)
	    return n;

	int index=pos-1;

	for(int i=n-1;i>=index;i--)
	    {
		arr[i+1]=arr[i];
		
	    }
	arr[index]=x;
	return n+1;
    }

    
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);

	System.out.print("Enter the capacity of array: ");

	int cap=sc.nextInt();

	int[] arr=new int[cap];

	System.out.print("Enter the size: ");
	int n=sc.nextInt();
	System.out.println("Enter the elemnts: ");

	for(int i=0;i<n;i++)
	    {
		arr[i]=sc.nextInt();
	    }
	

	System.out.println("Enter the element you want to insert: ");

	int x=sc.nextInt();

	System.out.println("Enter the position you want to insert: ");

	int pos=sc.nextInt();

	n=Insertion(arr,n,cap,x,pos);

	for(int i=0;i<n;i++)
	    {
		System.out.print(arr[i]+" ");
	    }
    }
}
