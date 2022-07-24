import java.util.*;
public class Topological
{
	static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
	{
		adj.get(u).add(v);
	}

	static void topological(ArrayList<ArrayList<Integer>> adj,int V)
	{
		int[] indegree=new int[V];

		for(int u=0;u<V;u++)
		{
			for(int x:adj.get(u))
				indegree[x]++;
		}

		Queue<Integer> q=new LinkedList<Integer>();
		for(int i=0;i<V;i++)
		{
			if(indegree[i]==0)
				q.add(i);
		}


		while(q.isEmpty()==false)
		{
			int u=q.poll();
			System.out.print(u+" ");

			for(int x:adj.get(u))
			{
				if(--indegree[x]==0)
					q.add(x);
			}
		}
	}

	public static void main(String[] args)
	{
		Scanner tk=new Scanner(System.in);
		System.out.print("Enter vertex: ");
		int V=tk.nextInt();

		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(V);

		for(int i=0;i<V;i++)
		{
			adj.add(new ArrayList<Integer>());
		}

		addEdge(adj,0,2);
		addEdge(adj,0,3);
		addEdge(adj,2,3);
		addEdge(adj,1,3);
		addEdge(adj,1,4);

		System.out.println("Following is the topological sort");

		topological(adj,V);
	}
}
