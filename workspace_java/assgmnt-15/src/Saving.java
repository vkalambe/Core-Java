
public class Saving extends Account{
	
	int baln;
	int amt;
	
	public Saving(int baln, int amt) {
		super(amt);
		this.baln = baln;
		this.amt = amt;
	}
	
	public void withdraw(){
		
		baln=baln-amt;
		System.out.println("my current Blance is"+  baln);
		return;
		
	}

	public static void main(String[] args) {
		Saving s1=new Saving(10000, 5000);
		s1.withdraw();
		
		
	}

}
