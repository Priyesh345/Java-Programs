import java.util.*;
import java.io.*;
import java.lang.*;
public class Memo
{  
static int[] mem;
  
  public static void main(String[] args)
  {
     int n=5;
     mem=new int[n+1];
     Arrays.fill(mem,-1);
     System.out.println(fib(n));
}  
  
  static int fib(int n)
  {  
     int res;
     
     if(mem[n]==-1)
     {
        if(n==0 || n==1)
        {
           return n;
        }
        
        else
          
          res=fib(n-1)+fib(n-2);
          mem[n]=res;
      }
      
      return mem[n];
  }
  
  }

