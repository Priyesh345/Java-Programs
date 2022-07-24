import java.util.*;
public class Dfs
{
	static void DFSrec(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited)
	{
		visited[s]=true;
		System.out.print(s+" ");

		for(int u:adj.get(s))
		{
			if(visited[u]==false)
			{
				DFSrec(adj,u,visited);
			}
		}
	}

	static void DFS(ArrayList<ArrayList<Integer>> adj,int V)
	{
		boolean visited[]=new boolean[V];
		for(int i=0;i<V;i++)
		{
			if(visited[i]==false)
			{
				DFSrec(adj,i,visited);
			}
		}
	}


	static void addEdge(ArrayList<ArrayList<Integer>> adj,int V,int u)
	{
		adj.get(V).add(u);
		adj.get(u).add(V);
	}

	public static void main(String[] args)
	{
		Scanner tk=new Scanner(System.in);
		System.out.print("Enter the size of Arraylist: ");
		int V=tk.nextInt();
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(V);
		for(int i=0;i<V;i++)
		{
			adj.add(new ArrayList<Integer>());
		}

		System.out.println("Enter the data; ");
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

		System.out.println("-----#-----#------");

		DFS(adj,V);
	}
}
