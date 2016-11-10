
public class Current extends Account{
	
	public Current(int accId, String accName, double accBal) {
		super(accId, accName, accBal);
	
	}
	public void withdraw(int ammount){
		
		accBal=accBal-ammount;
		System.out.println(accBal);
	
		
	}
	public void deposit(int ammount){
		
		accBal=accBal+ammount;
		System.out.println(accBal);
		
	}
	public void accept()
	{
		
	}
	@Override
	public void calInterest(double loanamt) {
		// TODO Auto-generated method stub
		
	}

	

}
