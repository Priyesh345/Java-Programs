public class Binary4
{
   static int FirstOcc(int arr[],int low,int high,int x)
   {
      if(low>high)
      return -1;
      int mid=(low+high)/2;
      if(arr[mid]>x)
      return FirstOcc(arr,low,mid-1,x);
      else if(arr[mid]<x)
      return FirstOcc(arr,mid+1,high,x);
      else
      {
         if(arr[mid]==0 || arr[mid-1]!=arr[mid])
         return mid;
         
         else
            return FirstOcc(arr,low,mid-1,x);
      }
   }
   
   public static void main(String[] args)
   {  
      int arr[]={10,20,30,45,45,45};
      int n=6;
      int x=45;
      System.out.println(FirstOcc(arr,0,n-1,x));
    }
    
 }      
      
