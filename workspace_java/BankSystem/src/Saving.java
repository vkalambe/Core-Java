
public class Saving extends Account{


	public Saving(int accId, String accName, double accBal) {
		super(accId, accName, accBal);
		
	}

	@Override
	public void withdraw(int ammount) {
		accBal=accBal-ammount;
		System.out.println(accBal);
		
	}

	@Override
	public void deposit(int ammount) {
		accBal=accBal+ammount;
		System.out.println(accBal);
		
	}

	@Override
	public void calInterest(double loanamt) {
		// TODO Auto-generated method stub
		
	}

}
