public class Binary5
{ 
   static int FirstOcc(int arr[],int low,int high,int x)
   {
      while(low<=high)
      {
        int mid=(low+high)/2;
        if(arr[mid]>x)
        high=mid-1;
        else if(arr[mid]<x)
        low=mid+1;
        
        else
        {
           if(arr[mid]==0 || arr[mid-1]!=arr[mid])
             return mid;
             
           else
            high=mid-1;
        }
        
      }
      
      return -1;
   }
   
   public static void main(String[] args)
   {
      int arr[]={10,20,30,45,30,30};
      int n=6;
      int x=30;
      System.out.println(FirstOcc(arr,0,n-1,x));
   }
 }               
