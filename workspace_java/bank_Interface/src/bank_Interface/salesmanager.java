package bank_Interface;

public class salesmanager extends employee_interface{
 
	int interest;
	
	
	public salesmanager(int empId, String name, int interest) {
		super(empId, name);
		this.interest = interest;
	}
	
	public void print()
	{
		System.out.println("i am in salesmanager1");
	}
	/*public void display()
	{
		System.out.println(this.interest);
	}*/
	public String toString()
	{
		return ""+ this.interest;
	}

	public static void main(String[] args) {
       employee_interface e=new salesmanager(11, "vidu", 444);
	System.out.println(e);
		}

}
