import java.util.Scanner;
public class Jagged
{
    public static void main(String[] args)
    {
	int[][] arr=new int[3][];
	arr[0]=new int[2];
	arr[1]=new int[3];
	arr[2]=new int[5];

	int count=0;
	for(int i=0;i<arr.length;i++)
	    {
		for(int j=0;j<arr[i].length;j++)
		    {
			arr[i][j]=count++;
		    }
	    }

	System.out.println("Required jagged array is : ");

	for(int i=0;i<arr.length;i++)
	    {
		for(int j=0;j<arr[i].length;j++)
		    {
			System.out.print(arr[i][j]+" ");
		    }
		System.out.println();
	    }
    }
}
