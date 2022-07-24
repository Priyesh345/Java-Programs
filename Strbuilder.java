public class Strbuilder
{
    public static void main(String[] args)
    {
	StringBuilder s1=new StringBuilder("Priyesh");
	StringBuilder s2=new StringBuilder("Singh");

	StringBuilder s=s1.append(s2);

	System.out.println(s.toString());
    }
}
