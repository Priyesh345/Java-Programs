import java.util.*;
public class Cycle
{
	static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	static boolean  DFSrec(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[],int parent)
	{
		visited[s]=true;
		for(int u:adj.get(s))
		{
			if(visited[u]==false)
			{
				if(DFSrec(adj,u,visited,s)==true)
				{
					return true;
				}
				else if(u!=parent)
				{
					return true;
				}
			}

		
		}
		return false;
	}

	static boolean DFS(ArrayList<ArrayList<Integer>> adj,int V)
	{
		boolean[] visited=new boolean[V];

		for(int i=0;i<V;i++)
		{
			if(visited[i]==false)
			
				if(DFSrec(adj,i,visited,-1)==true)
				  return true;

		}

		return false;
	}

	public static void main(String[] args)
	{
		Scanner pk=new Scanner(System.in);
		System.out.print("Enter the number of Vertices: ");
		int V=pk.nextInt();

		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(V);
		for(int i=0;i<V;i++)
		{
			adj.add(new ArrayList<Integer>());
		}

		int a=pk.nextInt();
		int b=pk.nextInt();
		int c=pk.nextInt();
		int d=pk.nextInt();
		int e=pk.nextInt();
		int f=pk.nextInt();
		int g=pk.nextInt();
		int h=pk.nextInt();
		int j=pk.nextInt();
		int k=pk.nextInt();
		int l=pk.nextInt();

		if(DFS(adj,V)==true)
		
			System.out.print("Cycle found");
		else
			System.out.println("Cycle not found");
	}
}
