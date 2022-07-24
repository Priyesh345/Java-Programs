class PRP
{
    int  account_no;
    String name;
    float amount;

    void insert(int a,String n,float amt)
    {
	account_no=a;
	name=n;
	amount=amt;
    }

    void deposit(float amt)
    {
	amount=amount+amt;

	System.out.println("Deposited amount "+ amt);
    }

    void withdraw(int  amt)
    {
	if(amount<amt)
	    {
		System.out.println("Insufficient Balance");
	    }

	else
	    {
		amount=amount-amt;
		System.out.println("Withdrawn amount "+amt);
	    }
    }

    void CheckBalance()
    {
	System.out.println("total amount is "+amount);
    }

    void display()
    {
	System.out.println(account_no+" "+name+" "+amount);
    }


}

public class Bank
{
    public static void main(String[] args)
    {
	PRP obj=new PRP();

	obj.insert(200111,"Priyesh",100000);
	obj.display();
	obj.CheckBalance();
	obj.deposit(10000);
	obj.CheckBalance();
	obj.withdraw(5000);
	obj.CheckBalance();
    }
}
