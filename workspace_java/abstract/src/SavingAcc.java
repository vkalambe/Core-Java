
public class SavingAcc extends account
  {
	
		
	double mysavingint;
	
		public static void main(String[] args) {
		
			account a=new SavingAcc();
			
			a.intcalc();
		
	}

		@Override
		public void intcalc() {
			
			mysavingint= custInt + 13;
		System.out.println(mysavingint);
			
			
		}

}
