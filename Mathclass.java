class Mathclass
{
	public static void main(String[ ]args)
	{
		byte b1=10;
		int a=25;
		long b=45;
		short s=15;
		double d=69;
		char c='c';
		float f=25;
		boolean b2=true;

		//converting primitive into Object

		Byte byteobj=b1;
		Integer intobj=a;
		Long longobj=b;
		Short shortobj=s;
		Double doubleobj=d;
		Character charobj=c;
		Float floatobj=f;
		Boolean boolobj=b2;

		System.out.println("----Printing Object Values----");
		System.out.println("Byte value "+byteobj);
		System.out.println("Integer value "+intobj);
		System.out.println("Long value "+longobj);
		System.out.println("Short value "+shortobj);
		System.out.println("Double value "+doubleobj);
		System.out.println("Character value "+charobj);
		System.out.println("Float value "+floatobj);
		System.out.println("Boolean value "+boolobj);


		//Converting Objects into primitives

		byte bytevalue=byteobj;
		int intvalue=intobj;
		long longvalue=longobj;
		short shortvalue=shortobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		float floatvalue=floatobj;
		boolean boolvalue=boolobj;


		System.out.println("---Printing Primimtives values---");
		System.out.println("byte value "+bytevalue);
		System.out.println("int value "+intvalue);
		System.out.println("long value "+longvalue);
		System.out.println("short value "+shortvalue);
		System.out.println("double value "+doublevalue);
		System.out.println("char value "+charvalue);
	}
}
