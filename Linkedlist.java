import java.util.Scanner;
public class Linkedlist
{ 
  static class Node
  {
    int data;
    Node next;
    Node(int data)
    {
     this.data=data;
     this.next=null;
    }
  }
  
  Node head=null;
  public void create()
  { 
    int data,n,m;
    
    Scanner am=new Scanner(System.in);
    do
    { 
      System.out.print("Enter Data: ");
      data=am.nextInt();
      Node newnode=new Node(data);
      
      if(head==null)
      {
       head=newnode;
      }
      else
      {
       System.out.print("To insert node at the beginning ,Press:1,To insert node at the end ,Press:2,To insert node at the position,Press:3");
       m=am.nextInt();
       switch(m)
       {
       case 1:
        newnode.next=head;
        head=newnode;
        break;
      case 2:
        Node temp=head;
        while(temp.next!=null)
        {
          temp=temp.next;
        }
        temp.next=newnode;
        break;
      case 3:
        System.out.print("Enter the position to insert the node: ");
        Scanner ip=new Scanner(System.in);
        int p=ip.nextInt();
        Node temp1=head;
        for(int i=0;i<=(p-1);i++)
        {
         temp1=temp1.next;   
        }
        newnode.next=temp1.next;
        temp=newnode;
        break;
       }
     }         
      System.out.print("Do you want to enter more data,if yes then press:1 ");
      n=am.nextInt();
     }
     while(n==1);
   }
   
   public void traverse()
   {
     Node temp=head;
     if(temp==null)
     { 
       System.out.print("Hello this is fucking empty linked list dumbo");
     }
     else
     {
      while(temp!=null)
      {
        System.out.print(temp.data+"-->");
        temp=temp.next;
      }
     }
   }
   
    public static void main(String[] args)
    {
      Linkedlist ll=new Linkedlist();
      ll.create();
      ll.traverse();
     }
 }      
