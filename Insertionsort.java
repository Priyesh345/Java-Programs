public class Insertionsort
{
    public static void main(String[] args)
    {
	int[] arr={10,5,6,9,78,45};
	int count=0;
	

	for(int i=1;i<arr.length;i++)
	    {
		int key=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>key)
		   
		    {  count++;
			
			arr[j+1]=arr[j];
			
			j--;
			
		    }
		arr[j+1]=key;
	    }
	for(int i=0;i<arr.length;i++)
	    {
		System.out.print(arr[i]+" ");
	    }
	System.out.println();
	System.out.println("No of comparison: "+count);
    }
}
