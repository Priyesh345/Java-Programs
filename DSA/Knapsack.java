import java.util.*;
import java.io.*;
import java.lang.*;
class Item implements Comparable<Item>
{
   int weight;
   int value;
    Item(int w,int v)
   {
     weight=w;
     value=v;
   }
   public int compareTo(Item i)
   {
      return (weight)*(i.value)-(value)*(i.weight);
   }
}

class Knapsack
{
   public static void main(String[] args)
   {
      Item[]  arr={new Item(50,600),
      new Item(20,500),
      new Item(30,400),};
      
      int W=70;
      int n=3;
      
      System.out.println(fracKnapsack(arr,W,n));
   }
   
   static double fracKnapsack(Item[] arr,int W,int n)
   {
      Arrays.sort(arr);
      double res=0.0;
      
      for(int i=0;i<n;i++)
      {
        if(arr[i].weight<=W)
        {
          res+=arr[i].value;
           W-=arr[i].weight;
	   
        }
        
        else
        {
           res+=arr[i].value*((double)W/arr[i].weight);
           break;
         }
      }
      
      return res;
    }
    
  }                  
