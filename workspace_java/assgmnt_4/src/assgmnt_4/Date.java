package assgmnt_4;

public class Date {
	
	int day;
	int mon;
	int yr;

	public Date(int day, int mon, int yr) {
		this(mon,yr);
		this.day = day;
		
	     
	}
	public Date( int mon, int yr) {
	
		
		this.mon = mon;
		this.yr = yr;
		System.out.println(this.mon);
	}











	public static void main(String[] args) {
		
	Date d=new Date(10,20,1994);
		
		
	
	}

}
