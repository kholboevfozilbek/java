package exercise6;

import java.util.Scanner;

public class exercise6 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name="", surname="", email="", phone="";
		
		System.out.print("Enter name:  ");
		name = input.next();
		System.out.print("Enter surname:  ");
		surname = input.next();
		System.out.print("Enter email:  ");
		email = input.next();
		System.out.print("Enter phone number:  ");
		phone = input.next();
		
		
		System.out.println("\n\n************************************");
		System.out.println("*				   *");
		System.out.println("*    " + name + " " + surname + "             *");
		System.out.println("*    " + email + "   *");
		System.out.println("*    " + phone + "                  *");
		System.out.println("*				   *");
		System.out.println("************************************");
		
		
		input.close();
		
	}
}
