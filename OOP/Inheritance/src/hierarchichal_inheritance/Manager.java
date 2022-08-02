package hierarchichal_inheritance;

import java.util.Scanner;

public class Manager extends Employee
{
	private String title;
	double dues;
	
	public Manager(String n, long num) {
		super(n, num);
		// TODO Auto-generated constructor stub
	}

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public void getData() {
		Scanner input = new Scanner(System.in);
		super.getData();
		System.out.print("Enter title:  ");
		title = input.next();
		System.out.print("Enter dues:  ");
		dues = input.nextDouble();
		
	}
	
	public void putData() {
		System.out.println("\nData on manager");
		super.putData();
		System.out.println("title: " + title);
		System.out.println("dues: " + dues);
	}
	
}
