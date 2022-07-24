import java.util.*;
import java.io.*;
import java.lang.*;
public class Dijkstra
{
    
   
   public static int[]  Dijkstraco(int graph[][],int source)
   {
       int V=4;int res=0;
       int[] dist=new int[V];
       dist[source]=0;
       
       Arrays.fill(dist,Integer.MAX_VALUE);
       
       boolean[] q=new boolean[V];
       
       for(int count=0;count<V-1;count++)
       {
          int u=-1;
          
          for(int i=0;i<V;i++)
            if(!q[i] && (u==-1 || dist[i]<dist[u]))
              u=i;
              q[u]=true;
              
           for(int v=0;v<V;v++)
             if(q[v]==false  && graph[u][v]!=0)
               dist[v]=Math.min(dist[v],dist[u]+graph[u][v]);
       }
       
       return dist;
    }
    
    public static void main(String[] args)
    {
       int[][] graph=new int[][]{{0,5,10,0},
       {5,0,3,20},
       {10,3,0,2},
       {0,20,2,0},};
       
       for(int x:Dijkstraco(graph,0)){
         System.out.print(x+" ");
    }
 }
} 
