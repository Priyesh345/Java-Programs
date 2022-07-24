public class Promotion
{
    void add(int a,long b){System.out.println("This is invoked");}
    void add(long a,int b){System.out.println("THis is not invoked");}

    public static void main(String[] args)
    {
	System.out.println(Promotion.add(20,20));
    }
}
