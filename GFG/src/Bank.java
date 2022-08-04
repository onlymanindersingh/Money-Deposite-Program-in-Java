import java.util.Scanner;

class Bank
{
    private double bal=5000;
    private int pwd;

    public void Deposite(double money)
    {
        System.out.print("Enter Password");
        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();
        if(pwd == 123)
        {
            bal=bal+money;
            System.out.println("Deposited Money: "+money);
            System.out.println("Total Balance: "+bal);
        }
        else
        {
            System.out.println("Incorrect Password...");
        }
    }

    public void Withdraw(double money)
    {
        System.out.print("Enter Password");
        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();
        if(pwd == 123)
        {
            bal=bal-money;
            System.out.println("Withdrawn Money: "+money);
            System.out.println("Total Balance: "+bal);    
        }
        else
        {
            System.out.print("Incorrct Password");
        }
    }

    public void checkBal()
    {
        System.out.print("Enter Password");
        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();
        if(pwd==123)
        {
            System.out.print("Total Balance: "+bal);
        }
        else
        {
            System.out.print("Incorrect Password...");
        }
    }
}

class Customer {
    
	public static void main(String [] args) {
		
        Bank b=new Bank();

        int ch;
        System.out.println("1. Deposite:");
        System.out.println("2. Withdraw:");
        System.out.println("3. CheckBalance:");
        
        System.out.print("\nEnter Your Choice:");
        Scanner s2=new Scanner(System.in);
        ch=s2.nextInt();

        switch(ch)
        {
            case 1: b.Deposite(1000);
            break;
            case 2: b.Withdraw(2000);
            break;
            case 3: b.checkBal();
            break;
            default : System.out.print("Invalid Case..."); 
        }        
    }
}
