public class Mergefunc
{
static void merge(int[] a,int low,int mid,int high)
    {

	int n1=mid-low+1;
       int n2=high-mid;
 
	int[] left=new int[n1];
	int[] right=new int[n2];

	for(int i=0;i<n1;i++)
	    {
		left[i]=a[low+i];
	    }

	for(int j=0;j<n2;j++)
	    {
		right[j]=a[mid+j+1];
	    }

	int i=0,j=0,k=0;

	while(i<n1 && j<n2)
	    {
		if(left[i]<=right[j])
		   {
		       a[k++]=left[i++];
		       
		       
		   }
		else
		    {
			a[k++]=right[j++];
			
			
		    }
	    }

	while(i<n1)
	    {
		a[k++]=left[i++];
		
		
	    }
	while(j<n2)
	    {
		a[k++]=right[j++];
		
		
	    }
    }

    public static void main(String[] args)
    {
	int[] a={10,42,11,25,36,89,57,13,20};
	int l=0,m=3,h=8;
	merge(a,l,m,h);
	for(int x: a)
	    System.out.print(x+" ");
	System.out.print(l);
    }
}
