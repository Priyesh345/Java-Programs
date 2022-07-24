import java.util.*;

public class BFS
{
	static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int V)
	{
		adj.get(u).add(V);
		adj.get(V).add(u);
	}

	static void TFS(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited)
	{
		
		Queue<Integer> q=new LinkedList<Integer>();
		visited[s]=true;
		q.add(s);

		while(q.isEmpty()==false)
		{
			int u=q.poll();
			System.out.print(u+" ");
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

	static void TFSdis(ArrayList<ArrayList<Integer>> adj,int V)
	{
		boolean visited[]=new boolean[V+1];
		for(int i=0;i<V;i++)
		{
			if(visited[i]==false)
			{
				TFS(adj,i,visited);
			}
		}
	}

	public static void main(String[] args)
	{
           System.out.println("Enter the size of arraylist; ");
	   Scanner tk=new Scanner(System.in);
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

	   System.out.println("----------*------*------*------");

	   TFSdis(adj,V);
	}
}
