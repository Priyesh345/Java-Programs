public class Binary3
{
	static int bsearch(int arr[] ,int x,int n)
	{
		for(int i=0;i<n;i++)
			if(arr[i]==x)
				return i;
		return -1;
	}
	public static void main(String[] args)
	{
		int arr[]={10,20,20,30,40,50};
		int n=6;
	       int x=5;
		System.out.println(bsearch(arr,x,n));
	}
}
