package hierarchichal_inheritance;

import java.util.Scanner;

public class Scientist extends Employee
{
	private int pubs;
	
	public Scientist(String n, long num) {
		super(n, num);
		// TODO Auto-generated constructor stub
	}
	
	public Scientist() {
		// TODO Auto-generated constructor stub
	}

	public void getData() {
		Scanner input = new Scanner(System.in);
		super.getData();
		System.out.print("Enter number of publications:  ");
		pubs = input.nextInt();
	}
	
	public void putData() {
		System.out.println("\nData on scientist");
		super.putData();
		System.out.println("number of pubs:  " + pubs);
	}
	
}
