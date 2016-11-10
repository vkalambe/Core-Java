
public class Emp {
	
	 static int Empid=1;

	
	
	public Emp(int empid) {
		super();
		this.Empid++;
		
		
	}
	
	public static void totalEmp(){
	
		System.out.println(this.Empid++);
	
		
	}
	
	
	
	public static void main(String [] args){
		
		Emp e1= new Emp(this.Empid++);
		totalEmp();
		Emp e2=new Emp(this.Empid++
				
				);
		totalEmp();
		
		
		
	}
	
	
}
	
	
	
	
	

	