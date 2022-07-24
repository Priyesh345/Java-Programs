import java.util.*;
import java.io.*;
import java.lang.*;
class Node
{
  char ch;
  int freq;
  Node left;
  Node right;
  
  Node(char c,int f,Node l,Node r)
  {
     ch=c;
     freq=f;
     left=l;
     right=r;
  }
}



class Huffman
{  
 public static void Printrec(Node root,String s)
{
    if(root.ch!='$')
    {
       System.out.println(root.ch+" "+s);
       return;
    }
    
    Printrec(root.left ,s+ "0");
    Printrec(root.right,s+ "1");
}
  public static void Huffmantree(char[] arr,int[] freq,int n)
   {
   
      PriorityQueue<Node> h=new PriorityQueue<>((n1,n2)->n1.freq-n2.freq);
      for(int i=0;i<n;i++)
        h.add(new Node(arr[i],freq[i],null,null));
      while(h.size()>1){
       Node l=h.poll();
       Node r=h.poll();
       h.add(new Node('$',l.freq+r.freq,l,r)); 
       }
       Printrec(h.peek()," ");
 }
 
 public static void main(String[] args)
 {
    char[] arr={'a','d','b','e','f'};
    int[] freq={10,50,20,40,80};                
    int n=5;  
    Huffmantree(arr,freq,n);
 }
 
}    
