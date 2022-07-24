public class Merge
{
    void merge(int[] a,int[] b)
    {
	int i=0;
	int j=0;
	while(i<a.length && j<b.length)
	    {
		if(a[i]<=b[j])
		    {
			System.out.println(a[i]+" ");
			i++;
		    }
		else
		    {
			System.out.println(b[j]+" ");
			j++;
		    }
	    }

	while(i<a.length)
	    {
		System.out.println(a[i]+" ");
		i++;
	    }
	while(j<b.length)
	    {
		System.out.println(b[j]+" ");
		j++;
	    }
    }

    public static void main(String args[])
    {
	int[] a={10,20,50};
	int[] b={5,50,50};

	Merge obj=new Merge();
	obj.merge(a,b);
    }
}
