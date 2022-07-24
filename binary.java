import java.util.Scanner;
public class binary
{
    static int   search(int[] arr,int n,int x)
    {
	
	int low=0;
	int high=n-1;
	while(low<=high)
	    {
		int mid=(low+high)/2;
		if(arr[mid]==x)
		    {
			return mid;
		    }
		else if(arr[mid]<x)
		    {
			low=mid+1;
		    }
		else
		    {
			high=mid-1;
		    }
		
	    }
	return -1;
    }

    public static void main(String[] args)
    {
	Scanner t=new Scanner(System.in);
        System.out.println("Enter the size of array ");
	int n=t.nextInt();
	int[] arr=new int[n];
	Scanner m=new Scanner(System.in);
	System.out.println("Enter the value you want to search ");
	int x=m.nextInt();
	for(int i=0;i<n;i++)
	    {
		arr[i]=t.nextInt();
	    }
	System.out.println(search(arr,n,x));
}

}
