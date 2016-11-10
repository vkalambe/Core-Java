package array_foreach;

public class Emp {
	
	int empId;
	String name;
	Date mydate;
	
	public Emp(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	public Emp(int i, String string, Date date) {
		this.empId=i;
		this.name=string;
		this.mydate=date;
	}

	public static void main(String[] args) {
		Emp[] arr={new Emp(11,"apnil",new Date(11,06,16)),new Emp(12,"adi",new Date(11,06,16))};
        for(Emp x:arr)
        {
        	System.out.println(x.empId);
        	System.out.println(x.name);
        	System.out.println(x.mydate.dd+"/"+x.mydate.mm+"/"+x.mydate.yy);
 
        }
	}


	


	

}
