public class Object
{
  int roll;
  String name;
  
  void setstudent(int r,String s)
  {
    roll=r;
    name=s;
  }
  
  void getstudent(){System.out.println(roll+" "+name);}
 
  
    public static void main(String[] args)
    {
      new Object1();
      new Object1().setstudent(52,"PRIYESH");
      new Object1().getstudent();
    }
}
