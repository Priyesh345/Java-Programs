public class Bubblesort
{
    public static void main(String[] args)
    {
	int[] arr={36,15,42,5,14,6};
	int temp;
	int count=0;
	for(int i=0;i<arr.length;i++)
	    {
		int flag=0;
		for(int j=0;j<arr.length-1-i;j++)
		    {
			count++;
			if(arr[j]>arr[j+1])
			    {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=1;
			    }
		    }
		if(flag==0)
		    {
			break;
		    }
	    }
	for(int i=0;i<arr.length;i++)
	    {
		System.out.print(arr[i]+" ");
	    }
	System.out.println("No of comparison is: "+count);
    }
}
