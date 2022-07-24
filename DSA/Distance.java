import java.util.*;
public class Distance
{
	static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}


	static void BFSdis(ArrayList<ArrayList<Integer>> adj,int s,int V,int[] dis)
	{
		Queue<Integer> q=new LinkedList<Integer>();
		boolean[] visited=new boolean[V];
		visited[s]=true;
		q.add(s);

		while(q.isEmpty()==false)
		{
			int u=q.poll();

			for(int v:adj.get(u))
			{
				dis[v]=dis[u]+1;
				visited[v]=true;
				q.add(v);
			}
		}
	}

	public static void main(String[] args)
	{
		
	        int V=4;

		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(V);
		for(int i=0;i<V;i++)
		{
			adj.add(new ArrayList<Integer>());
		}
        	

		int[] dis=new int[V+1];
		for(i=0;i<V;i++)
		{
			dis[i]=Integer.MAX_VALUE;
		}
		dis[0]=0;
		
                addEdge(adj,0,1);
                addEdge(adj,1,2);
                addEdge(adj,2,3);
                addEdge(adj,0,2);
                addEdge(adj,1,3);
		BFSdis(adj,0,V,dis);

		for(i=0;i<V;i++)
		{
			System.out.print(dis[i]+" ");
		}
	}
}
