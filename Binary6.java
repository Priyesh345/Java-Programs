public class Binary6
{
   static int LastOcc(int arr[],int low,int high,int x,int n)
   {
     if(low>high)
     return -1;
     int mid=(low+high)/2;
     if(arr[mid]>x)
     return LastOcc(arr,low,mid-1,x,n);
     else if(arr[mid]<x)
     return LastOcc(arr,mid+1,high,x,n);
     else
     {
       if(mid==n-1 || arr[mid]!=arr[mid+1])
       return mid;
       else
        return LastOcc(arr,mid+1,high,x,n);
     }
   }
   
   public static void main(String[] args)
   {
     int arr[]={10,20,30,50,60,30,30};
     int n=7;
     int x=30;
     System.out.println(LastOcc(arr,0,n-1,x,n));
  }
  
  
 }         
