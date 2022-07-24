import java.util.*;
public class Directed
{
	static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
	{
		adj.get(u).add(v);
		
	}

	static boolean DFSrec(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[],boolean recstack[])
	{
		visited[s]=true;
		recstack[s]=true;

		for(int u:adj.get(s))
		{
			if(visited[u]==false){
				if(DFSrec(adj,u,visited,recstack)==true)

			{return true;}
			}
		else if(recstack[u]==true)
		{return true;}
		}
		recstack[s]=false;
		return false;
	}

	static boolean DFS(ArrayList<ArrayList<Integer>> adj,int V)
	{
		boolean[] visited=new boolean[V];
		boolean[] recstack=new boolean[V];

		for(int i=0;i<V;i++)
		{
			if(visited[i]==false)
				if(DFSrec(adj,i,visited,recstack)==true)
					return true;
		}
		return false;
	}

	public static void main(String[] args)
	{

		Scanner tk=new Scanner(System.in);
		System.out.println("Enter the number of vertex: ");
		int V=tk.nextInt();
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(V);
		for(int i=0;i<V;i++)
		{
			adj.add(new ArrayList<Integer>());
		}

		addEdge(adj,0,1);
		addEdge(adj,2,1);
		addEdge(adj,2,3);
		addEdge(adj,3,4);
		addEdge(adj,4,5);
		addEdge(adj,5,3);
		
		if(DFS(adj,V)==true)
			System.out.println("Cycle found");
		else
			System.out.println("No cycle");
	}
}
