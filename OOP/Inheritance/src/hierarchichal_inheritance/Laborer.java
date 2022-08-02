package hierarchichal_inheritance;

public class Laborer extends Employee
{
	
	public Laborer(String n, long num) {
		super(n, num);
		// TODO Auto-generated constructor stub
	}

	public Laborer() {
		// TODO Auto-generated constructor stub
	}
	
	public void putData() {
		System.out.println("\nData on laborer:  ");
		
		super.putData();
	}

}
