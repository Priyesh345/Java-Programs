import java.util.*;
import java.io.*;
import java.lang.*;
public class Prims
{  
   public static int Primsprn(int graph[][])
   {
	 int V=4;
	int[] key=new int[V];
	Arrays.fill(key,Integer.MAX_VALUE);
	key[0]=0;
	int res=0;

	boolean[] mSet=new boolean[V];

	for(int count=0;count<V;count++)
	{
		int u=-1;
		for(int i=0;i<V;i++)
		
			if(!mSet[i] &&(u==-1 || key[i]<key[u]))
				u=i;
			mSet[u]=true;
			res=res+key[u];

			for(int v=0;v<V;v++)
				if(graph[u][v]!=0 && mSet[v]==false)
					key[v]=Math.min(key[v],graph[u][v]);
	}

	return res;
}

public static void main(String[] args)
{
	int[][] graph=new int[][]{{0,5,8,0},
		                  {5,0,10,0},
				  {8,10,0,20},
				  {0,15,20,0},};

	System.out.print(Primsprn(graph));
}

}
