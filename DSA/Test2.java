import java.util.*;
public class Test2
{
	static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int V)
	{
		adj.get(u).add(V);
		adj.get(V).add(u);
	}

	static boolean DFSrec(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[],int parent)
	{
		visited[s]=true;
		for(int u:adj.get(s))
		{
			if(visited[u]==false)
				if(DFSrec(adj,u,visited,s)==true)
					return true;
				else if(u!=parent)
					return true;
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

		Scanner tk=new Scanner(System.in);
		System.out.print("Enter the number of vertex: ");
		int V=tk.nextInt();
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(V);
		for(int i=0;i<V;i++)
		{
			adj.add(new ArrayList<Integer>());
		}

		addEdge(adj,0,1);
		addEdge(adj,1,2);
		addEdge(adj,2,4);
		addEdge(adj,4,5);
		addEdge(adj,1,3);
		addEdge(adj,2,3);

		if(DFS(adj,V)==true)
		 System.out.println("Cycle found");
		else
			System.out.println("Cycle not found");
	}
}
