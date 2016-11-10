import java.util.Scanner;


public class AccountException 
{
	
	int baln;
	int amt;
	

	public AccountException(int baln, int amt) {
		super();
		this.baln = baln;
		this.amt = amt;
	}

	public AccountException() {
		// TODO Auto-generated constructor stub
	}

	public void withdrow() throws MyException
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Baln in our Account");
		int a=sc.nextInt();
		
		
		System.out.println("Enter amount to be withdraw");
		int b=sc.nextInt();
		
		int c=a-b;
		System.out.println(c);
		
			if(c<1000)
			{
				
					throw new MyException();
				
				
			}
			else 
			{
			
			}
	
	}
	
		public static void main(String[] args) {
		
		AccountException e1=new AccountException();
		try 
		{
			e1.display();
		}
		catch (Exception e) 
		{
			
			
		}
	
		
		
	}

}
