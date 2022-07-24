import java.util.Scanner;
public class Binary2
{
	static int bsearch(int arr[] ,int low,int high,int x)
	{
		if(low>high)
			return -1;
		int mid=(low+high)/2;
		if(arr[mid]==x)
			return mid;
		else if(arr[mid]>x)
			return bsearch(arr,low,mid-1,x);
		else
			return bsearch(arr,mid+1,high,x);
	}

	public static void main(String[] args)
	{
		Binary2 obj=new Binary2();
		Scanner t=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=t.nextInt();
		int[] arr=new int[n];
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the elemments to be searched");
		int x=d.nextInt();
		for(int i=0;i<n;i++)
			{
				arr[i]=t.nextInt();
			}
		System.out.println(obj.bsearch(arr,0,n-1,x));
	}
}

