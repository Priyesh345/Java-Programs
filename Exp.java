import java.io.*;
public class Exp
{
	public static void main(String[] args) throws FileNotFoundException
	{
		PrintWriter ok=new PrintWriter("def.txt");
		ok.println("hi");
		System.out.println(10/0);
	}
}
