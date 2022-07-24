public class Selectionsort
{
    public static void main(String[] args)
    {
	int[] arr={36,9,8,63,12,45};
	int temp;
	int swap=0;
	int count=0;
	for(int i=0;i<arr.length;i++)
	    {
		int min=i;
		for(int j=i+1;j<arr.length;j++)
		    {
			if(arr[j]<arr[min])
			    {
				count++;
				min=j;
			    }
		    }
		if(min!=i){
		swap++;
		temp=arr[i];

		arr[i]=arr[min];
		arr[min]=temp;
		    }
	    }
	System.out.println("No of swap: "+swap);
	System.out.println(count);
	for(int i=0;i<arr.length;i++)
	    {
		System.out.println(arr[i]+" ");
	    }
    }
}
		
