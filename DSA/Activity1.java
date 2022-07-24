import java.util.*;
import java.io.*;
import java.lang.*;
class Activity
{
   int start;
   int finish;
   
   Activity(int s,int f)
   {
      start=s;
      finish=f;
   }
}
   
  
  
   class MyCmp implements Comparator<Activity>
  {
      public int compare(Activity a1,Activity a2)
      {
         return a1.finish-a2.finish;
      }
  }
 
 class Activity1
 {
   
    
   static int MaxActivity(Activity[] arr,int n)
   {
     
      Arrays.sort(arr,new MyCmp());
      int res=1;
      int prev=0;
      
      for(int count=1;count<n;count++)
      {
         if(arr[count].start>=arr[prev].finish)
         {
                 res++;
                 prev=count;
         }
      }
      
      return res;
  }  
  public static void main(String[] args)
  {
      Activity[] arr={new Activity(3,8),
      new Activity(2,4),
      new Activity(1,3),
      new Activity(10,11),};
      int n=4;
      System.out.println(MaxActivity(arr,n));
    }
    
}    
    

                       
