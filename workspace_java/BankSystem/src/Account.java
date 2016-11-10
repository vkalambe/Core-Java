import java.util.Scanner;


public abstract class Account {
	int accId;
	static String accName;
	static double accBal;
	
public Account(int accId, String accName, double accBal) {
		super();
		this.accId = accId;
		accName = accName;
		this.accBal = accBal;
	}
public abstract void withdraw(int ammount);
public abstract void deposit(int ammount);
public abstract void calInterest(double loanamt);

    
public static void main(String[] argc)
{
   Account acc=new Saving(1,"jadu",10000);
   Account acc1=new Current(1,"rhutik",50000);
	Scanner c=new Scanner(System.in);
	System.out.println("for creating account press 1");
	System.out.println("you have already account press 2");
	int login=c.nextInt();
	if(login == 1)
	{
	System.out.println("create acc type id,name,bal");
	acc=new Saving(c.nextInt(),c.next(),c.nextDouble());
	
	}
	System.out.println("enter the choice");
	System.out.println("1 for saving account");
	System.out.println("2 for current account");
	System.out.println("3 for loan account");
	
    switch (c.nextInt()) {
	case 1:
		//System.out.println("create acc type id,name,bal");
		//Account acc=new Saving(c.nextInt(),c.next(),c.nextInt());
		System.out.println("for deposit type 1");
    	System.out.println("for withdraw type 2");
    	int choice=c.nextInt();
    	System.out.println("enter the amount");
    	
        int amm=c.nextInt();
        
		switch (choice) {
		case 1:
			acc.deposit(amm);
			break;
		case 2:
			if(acc.accBal>10000)
			{
			acc.withdraw(amm);
			break;
			}
			else
			{
				System.out.println("your acc balance low please deposit money");
				break;
			}
		
		}
		break;
    case 2:
    	System.out.println("for deposit type 1");
    	System.out.println("for withdraw type 2");
    	choice=c.nextInt();
    	System.out.println("enter the ammount");
    	amm=c.nextInt();
     	System.out.println("for deposit type 1");
    	System.out.println("for withdraw type 2");
		switch (choice) {
		case 1:
			acc1.deposit(amm);
			break;
		case 2:
			acc1.withdraw(amm);
			break;
		
		     }
		break;
		
    case 3:
    	Account acc2=new loan (1, accName, accBal);
    	System.out.println("enter the loan amount");
    	int loan=c.nextInt();
    	double loanamt = 0;
		acc2.calInterest(loanamt);
    	char[] interest = null;
		System.out.println(interest);
    	break;
    	
default:
		System.out.println("choice default");
		break;
	}
}
	
	
	




}
