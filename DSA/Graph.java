import java.util.*;
import java.util.Scanner;
public class Graph
{

	static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int V)
	{
		adj.get(u).add(V);
		adj.get(V).add(u);
	}

       	static  void BFS(ArrayList<ArrayList<Integer>> adj,int V,int s)
	{
	      boolean visited[]=new boolean[V+1];
	      Queue<Integer> q=new LinkedList<Integer>();
	      visited[s]=true;
	      q.add(s);

	      while(q.isEmpty()==false)
	      {
		      int u=q.poll();
		      System.out.println(u+" ");
		      for(int v:adj.get(u))
		      {
			      if(visited[v]==false)
			      {
				      visited[v]=true;
				      q.add(v);
			      }
		      }
	      }
	}

	public static void main(String[] args)
	{
		Scanner tk=new Scanner(System.in);
		System.out.println("Enter the size of arraylist: ");
                int V=tk.nextInt();

		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(V);

		for(int i=0;i<V;i++)
		{
			adj.add(new ArrayList<Integer>());
		}


		int a=tk.nextInt();
		int b=tk.nextInt();
		int c=tk.nextInt();
		int d=tk.nextInt();
                int e=tk.nextInt();
		int f=tk.nextInt();
		int g=tk.nextInt();
		int h=tk.nextInt();

		addEdge(adj,a,b);
		addEdge(adj,c,d);
		addEdge(adj,e,f);
		addEdge(adj,g,h);

		System.out.print("Enter the source vertex: ");
		int s=tk.nextInt();

		System.out.println("-------*-----*------");

		BFS(adj,V,s);
	}
}
	  
