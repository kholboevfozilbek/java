package hierarchichal_inheritance;

import java.util.Scanner;

public class Employee 
{
	protected String name;
	protected long number;
	
	
	public Employee() {
		
	}
	
	public Employee(String n, long num) {
		name = n;
		number = num;
	}
	
	public void getData() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name:  ");
		name = input.next();
		System.out.print("Enter number:  ");
		number = input.nextLong();
	}
	
	public void putData() {
		System.out.println("Name:  " + name);
		System.out.println("Number:  " + number);
	}
}
