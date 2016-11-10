
public class loan extends Account{


	public loan(int accId, String accName, double accBal) {
		super(accId, accName, accBal);
		
	}

	int loanamt;
	double interest;
	public double calInterest()
	{

		interest= interest + loanamt *0.10;
		return interest;
	}

	public static void main(String[] args) {
		
		
		
		
	}

	@Override
	public void withdraw(int ammount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(int ammount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calInterest(double loanamt) {
		// TODO Auto-generated method stub
		
	}

}
	