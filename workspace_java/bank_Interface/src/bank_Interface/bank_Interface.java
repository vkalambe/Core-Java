package bank_Interface;

public class bank_Interface {

	int bankId;
	String name;
	public bank_Interface(int bankId, String name) {
		super();
		this.bankId = bankId;
		this.name = name;
	}
	public void display()
	{
		System.out.println("in base class");
	}
	public static void main(String[] args) {

	    /* Inteface b=new saving(420, "vishal");
	     b.print();

	 	Inteface c=new Current(420, "vishal");
	 	c.print();
	 	
	 	Inteface s=new salesmanager(420, "vishal");
		s.print();*/
		}

	
}
