public class Quicksort
{

   int sort(int arr[],int low,int high)
   {  
      int pivot=arr[(low+high)/2];
     while(low<=high)
     {
        while(arr[low]<pivot)
        {
           low++;
        }
        
        while(arr[high]>pivot)
        {
           high--;
        }
        
        if(low<=high)
        {
          int temp=arr[low];
          arr[low]=arr[high];
          arr[high]=temp;
          low++;
          high--;
        }
     }
     
     return low;
   }
   
   void quicksort(int arr[],int low,int high)
   {
      int pi=sort(arr,low,high);
      if(low<pi-1)
      {
        quicksort(arr,low,pi-1);
      }
      if(pi<high)
      {
        quicksort(arr,pi,high);
      }
    }
    
    void display(int arr[])
    {
       for(int i:arr)
       {
          System.out.print(i+" ");
       }
    }
    
    public static void main(String[] args)
    {
        int arr[]={10,15,63,45,21,19,36,24,14,53};  
        int leng=arr.length;
        Quicksort obj=new Quicksort();
        obj.quicksort(arr,0,leng-1);
        obj.display(arr);
     }
     
 }                    
